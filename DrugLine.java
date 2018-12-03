//Group Project
//May, Felipe, Lauren

public class DrugLine {
	private int prescID;
	private String drug;
	private int qty;
	private String dosage;
	private int refillsLeft;
	private int timesFilled;
	
	//Constructors----------------------------------------------------------------------
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
	
	//Getters & Setters ---------------------------------------------------------------
	public int getPrescID() {
		return prescID;
	}

	public void setPrescID(int u_prescID) {
		prescID = u_prescID;
	}
	//-------------------------
	public String getDrug() {
		return drug;
	}

	public void setDrug(String u_Drug) {
		drug = u_Drug;
	}
	//-------------------------
	public int getQty() {
		return qty;
	}

	public void setQty(int u_Qty) {
		qty = u_Qty;
	}
	//-------------------------
	public String getDosage() {
		return dosage;
	}

	public void setDosage(String u_Dosage) {
		dosage = u_Dosage;
	}
	//-------------------------
	public int getRefillsLeft() {
		return refillsLeft;
	}

	public void setRefillsLeft(int u_RefillsLeft) {
		refillsLeft = u_RefillsLeft;
	}
	//-------------------------
	public int getTimesFilled() {
		return timesFilled;
	}

	public void setTimesFilled(int u_TimesFilled) {
		timesFilled = u_TimesFilled;
	}
	//--------------------------------------------------------------------------

	public String fillZeros(int num){
		if (num < 10){
			return "000" + num;
		}else if (num < 100){
			return "00" + num;
		}else{
			return "0" + num;
		}
	}
	//--------------------------------------------------------------------------
	
	/**
	 * Method to add blank spaces to a string in order to
	 * align columns when printing out to a file or screen
	 * @param s String to be printed
	 * @param col quantity of columns to be printed 
	 * @return the string + blank spaces
	 */
	public String align(String s, int col){
		int newCol = col - s.length();
		String newS = s;
		for (int i = 0; i < newCol; i++){
			newS += " ";
		}
		return newS;
	}
	//--------------------------------------------------------------------------

	public String getInfo() {
		 return "Prescription ID: " + align(fillZeros(getPrescID()),8) + "Drug: " + align(getDrug(), 20) + 
				 "Qty: " + align(Integer.toString(getQty()), 6) + "Dosage: " + align(getDosage(), 10) +
				 "Refills Left: " + align(Integer.toString(getRefillsLeft()), 5) + "Times Filled: " + align(Integer.toString(getTimesFilled()),5);
	} 
	//--------------------------------------------------------------------------
	
	public String getReport() {
		 return "       " + align(fillZeros(getPrescID()),8) + align(getDrug(), 45) + align(Integer.toString(getQty()), 8) + 
			    align(getDosage(), 12) + align(Integer.toString(getRefillsLeft()), 11) + align(Integer.toString(getTimesFilled()),15);
	} 
	
}