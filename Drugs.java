import java.util.ArrayList;

public class Drugs {
	
	private String name;
	private String chem_Name;
	private ArrayList<String> ingredients = new ArrayList<>();
	private String manufacture;
	private String type;
	private ArrayList<String> contraInd = new ArrayList<>();
	private int stipTimes;
	
	public Drugs() {
		name = "";
		chem_Name = "";
		manufacture = "";
		type = "";
		stipTimes = 0;
	}
	
	public Drugs(String u_Name, String u_chemName, ArrayList<String> u_Ing, String u_Manu, String u_Type, ArrayList<String> u_con, int u_StipTimes){
		name = u_Name;
		chem_Name = u_chemName;
		ingredients = u_Ing;
		manufacture = u_Manu;
		type = u_Type;
		contraInd = u_con;
		stipTimes = u_StipTimes;
	}

	public String getName() {
		return name;
	}

	public void setName(String u_Name) {
		name = u_Name;
	}

	public String getChem_Name() {
		return chem_Name;
	}

	public void setChem_Name(String u_chemName) {
		chem_Name = u_chemName;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> u_ingredients) {
		ingredients = u_ingredients;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String u_manufacture) {
		manufacture = u_manufacture;
	}

	public String getType() {
		return type;
	}

	public void setType(String u_Type) {
		type = u_Type;
	}

	public ArrayList<String> getContraInd() {
		return contraInd;
	}

	public void setContraInd(ArrayList<String> u_ContraInd) {
		contraInd = u_ContraInd;
	}

	public int getStipTimes() {
		return stipTimes;
	}

	public void setStipTimes(int u_stipTimes) {
		stipTimes = u_stipTimes;
	}
	
	
	
	

}