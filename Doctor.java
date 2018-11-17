import java.util.HashMap;

public class Doctor extends People /*implements Information*/ {
	
	private String spec; // Specialization
	private HashMap<String, String> watchList = new HashMap<>();
	

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
	
	public HashMap<String, String> getWatchList() {
		return watchList;
	}

	public void setWatchList(HashMap<String, String> u_WatchList) {
		watchList = u_WatchList;
	}

	


}