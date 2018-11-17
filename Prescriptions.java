public class Prescriptions {
	
	private String pre_ID;
	private String pharmacist;

	public Prescriptions() {
 		pre_ID = "";
		pharmacist = "";		
	}
	
	public Prescriptions(String u_ID, String u_Phar){
		pre_ID = u_ID;
		pharmacist = u_Phar;
	}

	public String getPre_ID() {
		return pre_ID;
	}

	public void setPre_ID(String u_preID) {
		pre_ID = u_preID;
	}

	public String getPharmacist() {
		return pharmacist;
	}

	public void setPharmacist(String u_Phar) {
		pharmacist = u_Phar;
	}
	
	

}