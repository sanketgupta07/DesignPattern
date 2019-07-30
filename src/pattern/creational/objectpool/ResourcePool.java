/**
 * 
 */
package pattern.creational.objectpool;

/**
 * @author sanket
 *
 */
public class ResourcePool extends ObjectPool<Resource> {

	@Override
	protected Resource create() {
		Resource r = new Resource(true, System.currentTimeMillis());
		return r;
	}

	@Override
	public boolean validate(Resource r) {
		if(r.getCreateTime() - System.currentTimeMillis() >= 50000)
			r.setValid(false);
		return r.isValid();
	}

	@Override
	public void expire(Resource r) {
		r.setValid(false);
	}

}
