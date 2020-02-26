/**
 * Television 
 * @author smjacobsmacbookpro
 *
 */
public class Television {
	//field
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn = false;
	private int channel = 2;
	private int volume = 20;
	
	
	//methods
	/**
	 * constructor - initialize brand and screen size
	 * @param brand manufacturer
	 * @param size screen size
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	/**
	 * setting channel
	 * @param station channel
	 */
	public void setChannel(int station) {
		channel = station;
	}
	/**
	 * power switch
	 */
	public void power() {
		powerOn = !powerOn;
	}
	/**
	 * increase volume
	 */
	public void increaseVolume() {
		volume++;
	}
	/**
	 * decrease volume
	 */
	public void decreaseVolume() {
		volume--;
	}
	
	/**
	 * get channel
	 * @return channel
	 */
	public int getChannel() {
		return channel;

	}
	/**
	 * get volume
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * get brand
	 * @return MANUFACTURER
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	/**
	 * get screen size
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
}
