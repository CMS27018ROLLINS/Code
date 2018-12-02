public class Prescriptions {
	
	private int pre_ID;
	private String date;
	private String patient;
	private String doctor;
	private String pharmacist;

	public Prescriptions() {
 		pre_ID = 0;
 		date = "";
 		patient = "";
		doctor = "";
		pharmacist = "";
	}
	
	public Prescriptions(int u_ID,String u_Date, String u_Patient, String u_Doc, String u_Phar){
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
	
	public String getPatient() {
		return patient;
	}

	public void setPatient(String u_Patient) {
		patient = u_Patient;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String u_Doc) {
		doctor = u_Doc;
	}

	public String getPharmacist() {
		return pharmacist;
	}

	public void setPharmacist(String u_Pharmacist) {
		pharmacist = u_Pharmacist;
	}
	
	public String fillZeros(int num){
		if (num < 10){
			return "000" + num;
		}else if (num < 100){
			return "00" + num;
		}else{
			return "0" + num;
		}
	}

	
	public String getInfo() {
		 return "Prescription ID: " + fillZeros(getPre_ID()) + " Date: " + getDate() + " Patient: " + getPatient() + " \n Doctor: " + 
	             getDoctor() + " Pharmacist: " + getPharmacist() + " \n----------------------------------------------------" + "\n";
	} 

	
	

}