package _04_hospital;

public class Patient {

	boolean caredFor = false;
	
	void checkPulse() {
		caredFor = true;
	}
	
	
	boolean feelsCaredFor() {
		if(caredFor==true) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	
}
