
public class Doctor extends People {
	
	private String spec; // Specialization

	public Doctor() {
		super();
		spec = "";
	}
	
	public Doctor(String u_Name, String u_Address, String u_Tel, String u_Spec){
		super(u_Name, u_Address, u_Tel);
		spec = u_Spec;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String u_Spec) {
		spec = u_Spec;
	}
	
	public String getInfo() {
		 return "\n Name: " + super.getName() + "\n Specilization: " + getSpec() + "\n Tel: " + super.getTel() + "\n Address: " + super.getAddress();
	} 


}