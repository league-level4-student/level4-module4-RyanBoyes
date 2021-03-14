package _04_hospital;

import java.util.ArrayList;

public class Doctor {

	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	
	
	
	
	void assignPatient(Patient p) throws DoctorFullException{
		if(patientList.size()==3) {
			throw new DoctorFullException();
		}
		else {
			patientList.add(p);
		}
	
		
	}
	
	ArrayList<Patient> getPatients(){
		
		return patientList;
	}
	
	void doMedicine() {
		
	}
	
	boolean performsSurgery() {
		return false;
	}
	
	boolean makesHouseCalls() {
		return false;
	}
	
	void doctorsHave3Patients() {
		
	}
	
	
	
	
}
