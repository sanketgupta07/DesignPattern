/**
 * 
 */
package pattern.structural.adapter;

/**
 * @author Sanket Gupta
 *
 */
public class AdvancePlayer extends MediaPlayer {
	private MediaPlayer player;
	
	/* (non-Javadoc)
	 * @see pattern.structural.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String fileType, String fileName) {
		if(fileType.equalsIgnoreCase("MP3"))
			player=new Mp3Player();
		else if (fileType.equalsIgnoreCase("AVI")) 
			player = new AviPlayer();
		else {
			System.err.println(fileType+" Format not supported.");
			return;
		}
		player.play(fileType, fileName);
	}

}
