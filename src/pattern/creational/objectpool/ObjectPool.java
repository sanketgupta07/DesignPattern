/**
 * 
 */
package pattern.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author sanket
 *
 */
public abstract class ObjectPool<T> {
	private long objectLifeTime;

	private Hashtable<T, Long> lockedObject, unlockedUnlockedObject;

	public ObjectPool() {
		objectLifeTime = 50000; // 50 seconds
		lockedObject = new Hashtable<T, Long>();
		unlockedUnlockedObject = new Hashtable<T, Long>();
	}

	/**
	 * Create a new object.
	 * @return
	 */
	protected abstract T create();

	/**
	 * Validate the object.
	 * @param o
	 * @return
	 */
	public abstract boolean validate(T o);

	/**
	 * Marked expire the object.
	 * @param o
	 */
	public abstract void expire(T o);

	/**
	 * Get object from pool.
	 * @return
	 */
	public synchronized T getObject() {
		long now = System.currentTimeMillis();
		T t;
		if (unlockedUnlockedObject.size() > 0) {
			Enumeration<T> e = unlockedUnlockedObject.keys();
			while (e.hasMoreElements()) {
				t = e.nextElement();
				if ((now - unlockedUnlockedObject.get(t)) > objectLifeTime) {
					// object has expired
					unlockedUnlockedObject.remove(t);
					expire(t);
					t = null;
				} else {
					if (validate(t)) {
						unlockedUnlockedObject.remove(t);
						lockedObject.put(t, now);
						return (t);
					} else {
						// object failed validation
						unlockedUnlockedObject.remove(t);
						expire(t);
						t = null;
					}
				}
			}
		}
		// no objects available, create a new one
		t = create();
		lockedObject.put(t, now);
		return (t);
	}

	/**
	 * Return object to pool.
	 * @param t
	 */
	public synchronized void returnObject(T t) {
		lockedObject.remove(t);
		unlockedUnlockedObject.put(t, System.currentTimeMillis());
	}
}
