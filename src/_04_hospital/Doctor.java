package _04_hospital;

import java.util.ArrayList;

public abstract class Doctor {

	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	abstract boolean performsSurgery();
	
	abstract boolean makesHouseCalls();
	
	abstract void assignPatient(Patient p);
	
	abstract ArrayList<Patient> getPatients();
	
	abstract void doMedicine();
	
	
	
	
	
}
