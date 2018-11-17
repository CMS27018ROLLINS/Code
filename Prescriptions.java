public class Prescriptions {
	
	private int pre_ID;
	private String date;
	private String pharmacist;

	public Prescriptions() {
 		pre_ID = 0;
 		date = "";
		pharmacist = "";		
	}
	
	public Prescriptions(int u_ID,String u_Date, String u_Phar){
		pre_ID = u_ID;
		date = u_Date;
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

	public String getPharmacist() {
		return pharmacist;
	}

	public void setPharmacist(String u_Phar) {
		pharmacist = u_Phar;
	}
	
	

}