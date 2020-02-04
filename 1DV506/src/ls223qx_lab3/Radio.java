package ls223qx_lab3;

// System.out is used instead of System.err, since there appears to be a latency issue with the console when dealing with errors (order of messags are wrong).
public class Radio {
	private boolean on = false;
	private int volume = 1;
	private int channel = 1;

	public Radio() {
	}

	public void turnOn() { // Turning on radio
		on = true;
	}

	public void turnOff() { // Reset volume and channel when turning off radio
		on = false;
		volume = 1;
		channel = 1;
	}

	public boolean checkOnOff() { // Simply checks if the radio is on or off
		if (on) {
			return true;
		}
		System.out.println("Radio is off!");
		return false;
	}

	public String getSettings() { // Print all settings
		String settings = "Settings: ";
		if (on) {
			settings += "On, ";
		}
		else {
			settings += "Off ";
		}
		settings += "Channel " + channel + ", Volume " + volume;
		return settings;

	}

	public void channelUp() { // Checks if radio is off, then ups the channel by one.
		if (checkOnOff()) {
			if (channel < 10) {
			channel++;
			}
			else {
				System.out.println("Chanel out of range!!");
			}
		}
	}
	public void channelDown() { // Checks if radio is off, then ups the channel by one.
		if (checkOnOff()) {
			if (channel > 1) {
			channel--;
			}
			else {
				System.out.println("Chanel out of range!!");
			}
		}
	}

	public void volumeDown() {
		if (checkOnOff()) {
			if (volume < 1) {
				System.out.println("Volume out of range!");
			}
			else {
				volume--;
			}
		}

	}

	public void volumeUp() {
		if (checkOnOff()) {
			if (volume < 5) {
				volume++;
			}
			else {
				System.out.println("Volume out of range!");
			}
		}

	}

	public void setVolume(int inputVolume) {
		if (checkOnOff()) {
			if (inputVolume >= 0 && inputVolume < 5) {
				volume = inputVolume;
			}
			else {
				System.out.println("Volume out of range!");
			}
		}
	}

	public void setChannel(int inputChannel) {
		if (checkOnOff()) {
			if (inputChannel <= 10 && inputChannel >= 0) {
				channel = inputChannel;
			}
			else {
				System.out.println("Channel out of range");
			}
		}

	}

}
