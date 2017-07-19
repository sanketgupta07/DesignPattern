/**
 * 
 */
package pattern.structural.adapter;

/**
 * @author Sanket Gupta
 *
 */
public class Mp3Player extends MediaPlayer {

	/* (non-Javadoc)
	 * @see pattern.structural.adapter.MediaPlayer#play(java.lang.String)
	 */
	@Override
	public void play(String fileType, String fileName) {
		if(fileType.equalsIgnoreCase("MP3"))
			System.out.println("Playing Mp3 file: "+fileName);
		else
			System.err.println(fileType+" format not supported.");

	}

}
