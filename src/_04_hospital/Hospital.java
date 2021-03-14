package _04_hospital;

import java.util.ArrayList;

public class Hospital {


	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	
	void addDoctor(Doctor d) {
		doctors.add(d);
		}
	
	ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	void addPatient(Patient p) {
		patients.add(p);
	}
	
	ArrayList<Patient> getPatients(){
		return patients;
	}
	
	void assignPatientsToDoctors() {
		int j = 0;
		for(int i = 0; i<patients.size(); i++) {
			if(doctors.get(j).getPatients().size()<3) {
			try {
				doctors.get(j).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				e.printStackTrace();
			}
			}
			else {
				j++;
				i--;
			}
			
		}
		
		
	}
	
	
	
}
