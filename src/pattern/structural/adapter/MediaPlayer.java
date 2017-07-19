/**
 * 
 */
package pattern.structural.adapter;

/**
 * @author Sanket Gupta
 *
 */
public abstract class MediaPlayer {
	/**
	 * this method will play media.
	 * @param fileType
	 */
	public abstract void play(String fileType, String fileName);

}
