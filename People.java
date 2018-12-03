//Group Project
//May, Felipe, Lauren

public abstract class People {

	protected String name; 
	protected String address; 
	protected String tel; 
	
	//Constructors --------------------------------------------------------
	public People() {
		name = "";
		address = "";
		tel = "";		
	}
	
	public People(String u_Name, String u_Address, String u_Tel){
		name = u_Name;
		address = u_Address;
		tel = u_Tel;
	}
	// Getters & Setters ----------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String u_name) {
		name = u_name;
	}
	//--------------------------------------
	public String getAddress() {
		return address;
	}

	public void setAddress(String u_address) {
		address = u_address;
	}
	//--------------------------------------

	public String getTel() {
		return tel;
	}

	public void setTel(String u_tel) {
		tel = u_tel;
	}
	//---------------------------------------------------------------------
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

}