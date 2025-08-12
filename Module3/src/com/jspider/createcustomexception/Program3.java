package com.jspider.createcustomexception;

class InvildIncidentLevelException extends Exception{
	@Override
	public void printStackTrace() {
		System.err.println("Exception Happend");
	}
}

class IncidentManager{
	static void assignLevel(int level) throws InvildIncidentLevelException{
		if(level>3) {
			throw new InvildIncidentLevelException();
		}
		else System.out.println("its ok");
	}
}

public class Program3 {

	public static void main(String[] args) {
		try {
			IncidentManager.assignLevel(2);
			IncidentManager.assignLevel(5);
			
		}
		catch (InvildIncidentLevelException e) {
			e.printStackTrace();
		}

	}

}
