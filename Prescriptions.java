public class Prescriptions {
	
	private int pre_ID;
	private String date;
	private Patients patient;
	private Doctor doctor;
	private Pharmacists pharmacist;

	public Prescriptions() {
 		pre_ID = 0;
 		date = "";
 		patient = null;
		doctor = null;
		pharmacist = null; 
	}
	
	public Prescriptions(int u_ID,String u_Date, Patients u_Patient, Doctor u_Doc, Pharmacists u_Phar){
		pre_ID = u_ID;
		date = u_Date;
		patient = u_Patient;
		doctor = u_Doc;
		pharmacist = u_Phar;
	}

	public int getPre_ID() {
		return pre_ID;
	}

	public void setPre_ID(int u_preID) {
		pre_ID = u_preID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String u_Date) {
		date = u_Date;
	}
	
	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients u_Patient) {
		patient = u_Patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor u_Doc) {
		doctor = u_Doc;
	}

	public Pharmacists getPharmacist() {
		return pharmacist;
	}

	public void setPharmacist(Pharmacists u_Pharmacist) {
		pharmacist = u_Pharmacist;
	}
	
	public String getInfo() {
		 return "Prescription ID: " + getPre_ID() + " Date: " + getDate() + " Patient: " + getPatient().getName() + " \n Doctor: " + getDoctor().getName() + " Pharmacist: " + getPharmacist().getName() +
				 " \n----------------------------------------------------" + "\n";
	} 

	
	

}
