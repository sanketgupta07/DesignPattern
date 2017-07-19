/**
 * 
 */
package pattern.structural.adapter;

/**
 * @author Sanket Gupta
 *
 */
public class AdapterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Comment out to check incompatibility of players.
		//		Mp3Player mp3 = new Mp3Player();
		//		mp3.play("MP3", "Channa_Mereya.mp3");
		//		mp3.play("AVI", "Matrix.avi");
		//		AviPlayer avi =  new AviPlayer();
		//		avi.play("AVI", "Matrix.avi");		
		//		avi.play("MP3", "Channa_Mereya.mp3");

		MediaPlayer player = new MediaAdapter();
		player.play("MP3", "Channa_Mereya.mp3");
		player.play("AVI", "Matrix.avi");
		player.play("MP4", "LOTR.mp4");


	}

}
