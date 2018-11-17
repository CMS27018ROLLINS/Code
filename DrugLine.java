
public class DrugLine extends Prescriptions {
	private String dosage;
	private int refillsLeft;
	private int timesFilled;
	
	public DrugLine(){
		super();
		dosage = "";
		refillsLeft = 0;
		timesFilled = 0;
	}
	
	public DrugLine(int u_ID,String u_Date, String u_Phar, String u_Dos, int u_RefLeft, int u_TimesFilled){
		super(u_ID, u_Date, u_Phar);
		dosage = u_Dos;
		refillsLeft = u_RefLeft;
		timesFilled = u_TimesFilled;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String u_Dosage) {
		dosage = u_Dosage;
	}

	public int getRefillsLeft() {
		return refillsLeft;
	}

	public void setRefillsLeft(int u_RefillsLeft) {
		refillsLeft = u_RefillsLeft;
	}

	public int getTimesFilled() {
		return timesFilled;
	}

	public void setTimesFilled(int u_TimesFilled) {
		timesFilled = u_TimesFilled;
	}
	
	
	
	

}
