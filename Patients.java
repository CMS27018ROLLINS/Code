public class Patients extends People {
	
	private String insProvider;
	private String ssn_Number;
	
	public Patients() {
		super();
		insProvider = "";
		ssn_Number = "";
	}
	
	public Patients(String u_Name, String u_Address, String u_Tel, String u_Provider, String u_SSN){
		super(u_Name, u_Address, u_Tel);
		insProvider = u_Provider;
		ssn_Number = u_SSN;
	}

	public String getInsProvider() {
		return insProvider;
	}

	public void setInsProvider(String u_insProvider) {
		insProvider = u_insProvider;
	}

	public String getssn_Number() {
		return ssn_Number;}

	public void setSSN(String u_SSN) {
		ssn_Number = u_SSN;
	}
	
	public String getInfo() {
		 return "Name: " + super.getName() + " Provider: " + getInsProvider() + " SSN: " + getssn_Number() + " Tel: " + super.getTel() + " Address: " + super.getAddress();
	} 



}