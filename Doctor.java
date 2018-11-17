import java.util.HashMap;

public class Doctor extends People /*implements Information*/ {
	
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


}