public class Prescriptions {
	
	private int pre_ID;
	private String date;
	private String patient;
	private String doctor;
	private String pharmacist;

	public Prescriptions() {
 		pre_ID = 0;
 		date = "";
		doctor = "";		
	}
	
	public Prescriptions(int u_ID,String u_Date, String u_Doc){
		pre_ID = u_ID;
		date = u_Date;
		doctor = u_Doc;
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
	
	

}