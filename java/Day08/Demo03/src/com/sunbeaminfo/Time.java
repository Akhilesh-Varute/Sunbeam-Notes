package com.sunbeaminfo;

import java.io.IOException;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public void setHours(int hours) {
		if (hours < 0 || hours >= 24)
			throw new RuntimeException("Hours should be 0 to 23"); // unchecked Exception
		this.hours = hours;
	}

	public void setMinutes(int minutes){
		if (minutes < 0 || minutes >= 60)
			throw new RuntimeException("minutes should be 0 to 59"); // unchecked Exception
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) throws IOException{
		if(seconds < 0 || seconds>=60)
			throw new IOException("seconds should be 0 to 59"); // checked Exception
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
