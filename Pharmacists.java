public class Pharmacists extends People {

	private String certdate; 
	private String ssn_Number;
	
	public Pharmacists() {
		super();
		certdate = "";
		ssn_Number = "";
	}
	
	public Pharmacists(String u_Name, String u_Address, String u_Tel, String u_cert, String u_SSN){
		super(u_Name, u_Address, u_Tel);
		certdate = u_cert;
		ssn_Number = u_SSN;
	}

	public String getCertdate() {
		return certdate;
	}

	public void setCertdate(String u_Certdate) {
		certdate = u_Certdate;
	}

	public String getSsn_Number() {
		return ssn_Number;
	}

	public void setSsn_Number(String u_SSN) {
		ssn_Number = u_SSN;
	}
	
	public String getInfo() {
		 return "Name: " + super.getName() + " Cert Date: " + getCertdate() + " SSN: " + getSsn_Number() + " Tel: " + super.getTel() + " Address: " + super.getAddress();
	} 

	


}