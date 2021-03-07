package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{

	@Override
	boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	void assignPatient(Patient p) {
		// TODO Auto-generated method stub
		patientList.add(p);
	}

	@Override
	ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

	
	boolean didMedicine = false;
	
	void doMedicine() {
		didMedicine = true;
		if(didMedicine==true) {
			for (Patient patient : patientList) {
				patient.caredFor=true;
				
			}
		}
	}

}
