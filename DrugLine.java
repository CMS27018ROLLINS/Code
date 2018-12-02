
public class DrugLine {
	private int prescID;
	private String drug;
	private int qty;
	private String dosage;
	private int refillsLeft;
	private int timesFilled;
	
	public DrugLine(){
		dosage = "";
		refillsLeft = 0;
		timesFilled = 0;
	}
	
	public DrugLine(int u_prescID, String u_Drug, int u_Qty, String u_Dos, int u_RefLeft, int u_TimesFilled){
		prescID = u_prescID;
		drug = u_Drug;
		qty = u_Qty;
		dosage = u_Dos;
		refillsLeft = u_RefLeft;
		timesFilled = u_TimesFilled;
	}
	
	public int getPrescID() {
		return prescID;
	}

	public void setPrescID(int u_prescID) {
		prescID = u_prescID;
	}

	public String getDrug() {
		return drug;
	}

	public void setDrug(String u_Drug) {
		drug = u_Drug;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int u_Qty) {
		qty = u_Qty;
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
	
	public String getInfo() {
		 return "Prescription ID: 000" + getPrescID() + "  Drug: " + getDrug() + " Qty: " + getQty() + " Dosage: " + getDosage() + " Refills Left: " + getRefillsLeft() + " Times Filled: " + getTimesFilled();
	} 

	public String getReport() {
		 return "         " + getPrescID() + "       " + getDrug() + "                  " + getQty() + "        " + getDosage() + "         " + getRefillsLeft() + "         " + getTimesFilled();
	} 
	
	
	

}