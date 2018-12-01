import java.util.ArrayList;

public class Drugs {
	
	private String name;
	private String chem_Name;
	private ArrayList<String> ingredients = new ArrayList<>();
	private String manufacture;
	private String type;
	private ArrayList<String> contraInd = new ArrayList<>();
	private int stipTimes;
	private Boolean monitored;
	
	public Drugs() {
		name = "";
		chem_Name = "";
		manufacture = "";
		type = "";
		stipTimes = 0;
	}
	
	public Drugs(String u_Name, String u_chemName, String u_Manu, String u_Type, int u_StipTimes, boolean u_Mon/*, ArrayList<String> u_Ing, ArrayList<String> u_con*/){
		name = u_Name;
		chem_Name = u_chemName;
		//ingredients = u_Ing;
		manufacture = u_Manu;
		type = u_Type;
		//contraInd = u_con;
		stipTimes = u_StipTimes;
		monitored = u_Mon;
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

	public String getIngredients(int i) {
		return ingredients.get(i);
	}

	public void setIngredients(int i, String s) {
		ingredients.set(i, s);
	}
	
	public void addIngredients(String s){
		ingredients.add(s);
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

	public String getContraInd(int i) {
		return contraInd.get(i);
	}

	public void setContraInd(int i, String s) {
		contraInd.set(i, s);
	}
	
	public void addContraInd(String s){
		contraInd.add(s);
	}

	public int getStipTimes() {
		return stipTimes;
	}

	public void setStipTimes(int u_stipTimes) {
		stipTimes = u_stipTimes;
	}

	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean u_Monitored) {
		monitored = u_Monitored;
	}
	
	public void printArrayLists(ArrayList<String> array, String s){
		int i = 1;
		for (String txt: array){
			System.out.println( s + " " + i + ": "  + txt);
			i++;
		}
	}
	
	public void getInfo() {
		
		System.out.println("Name: " + getName() + " Chem_Name : " + getChem_Name() + " Manufacture: " + getManufacture() + " Type: " + getType() +
				" Stipulated Times: " + getStipTimes() + " Monitored: " + getMonitored());
		printArrayLists(ingredients, "Ingredient");
		printArrayLists(contraInd, "Contra Indication");
		
	} 

	
	
	
	
	
	

}