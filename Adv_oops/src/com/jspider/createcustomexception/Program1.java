package com.jspider.createcustomexception;

class OverSpeedException extends Exception{
	
}

class SpeedTrack{
	static void checkSpeed(int speed) throws OverSpeedException{
		if(speed>80) {
			throw new OverSpeedException();
		}
		else {
			System.out.println("The speed is under control");
		}
	}
}

public class Program1 {

	public static void main(String[] args) {
		int speed=299;
		try {
			SpeedTrack.checkSpeed(60);
//			SpeedTrack.checkSpeed(speed);
		}
		catch (OverSpeedException e) {
//			e.printStackTrace();
			System.err.println("You are doing OverSpeeding...your speed is :"+speed);
		}

	}

}
