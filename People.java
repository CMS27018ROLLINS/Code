public abstract class People {

	protected String name; 
	protected String address; 
	protected String tel; 
	
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

	public String getName() {
		return name;
	}

	public void setName(String u_name) {
		name = u_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String u_address) {
		address = u_address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String u_tel) {
		tel = u_tel;
	}
	

}