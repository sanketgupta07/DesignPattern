/**
 * 
 */
package pattern.creational.objectpool;

/**
 * @author sanket
 *
 */
public class Resource {

	public static int counter = 0;
	private boolean isValid;
	private long createTime;
	private String name;
	/**
	 * @param isValid
	 * @param createTime
	 */
	public Resource(boolean isValid, long createTime) {
		this.isValid = isValid;
		this.createTime = createTime;
		this.name= "Resource: "+ ++counter;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public long getCreateTime() {
		return createTime;
	}	
	
	public void doJob() {
		if(isValid) {
			System.out.println("Job done via "+name);
		}
	}

}
