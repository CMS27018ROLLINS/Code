
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
		 return "\n Name: " + super.getName() + "\n Specialization: " + getSpec() + "\n Tel: " + super.getTel() + "\n Address: " + super.getAddress();
	} 
	
	public String getInfoReport() {
		 return "  " + super.align(super.getName(), 27) + super.align(getSpec(), 29) + super.align(super.getTel(), 18) + super.align(super.getAddress(),20);
	} 
	


}