package _04_hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor{

	@Override
	boolean performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
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

	@Override
	void doMedicine() {
		// TODO Auto-generated method stub
		
	}

	

	
	
	
}
