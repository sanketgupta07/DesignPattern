/**
 * 
 */
package pattern.structural.adapter;

/**
 * @author Sanket Gupta
 *
 */
public class AviPlayer extends MediaPlayer {

	/* (non-Javadoc)
	 * @see pattern.structural.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String fileType, String fileName) {
		if (fileType.equalsIgnoreCase("AVI")) 
			System.out.println("Playing AVI file: "+fileName);
		else
			System.err.println(fileType+" format not supported.");

	}

}
