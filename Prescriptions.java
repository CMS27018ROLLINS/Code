public class Prescriptions {
	
	private int pre_ID;
	private String date;
	private String doctor;

	public Prescriptions() {
 		pre_ID = 0;
		doctor = "";		
	}
	
	public Prescriptions(int u_ID, String u_Doc){
		pre_ID = u_ID;
		doctor= u_Doc;
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

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String u_Doc) {
		doctor = u_Doc;
	}
	
	

}
