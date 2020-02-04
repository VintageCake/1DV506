package ls223qx_lab3;

public class AlarmClockMain {
	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock(23, 48); // Set clock time to 23:48.
		alarm.displayTime(); // Output current time in console.
		alarm.setAlarm(6, 45); // Set alarm to 6:45.

		for (int i = 0; i < 500; i++) { // Tick the clock 500 ticks (minutes), this method will also check if the alarm is to be rung at execution.
			alarm.timeTick();
		}

		alarm.displayTime(); // Display the current 'time'.

	}

}
