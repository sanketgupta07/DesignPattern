/**
 * 
 */
package pattern.creational.objectpool;

/**
 * @author sanket
 *
 */
public class ObjectPoolDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectPool<Resource> pool = new ResourcePool();
		Resource r1 = pool.getObject();
		r1.doJob();
		pool.returnObject(r1);
		
		Resource r2 = pool.getObject();
		r2.doJob();
		pool.returnObject(r2);
	}

}
