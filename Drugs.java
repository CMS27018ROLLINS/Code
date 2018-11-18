//May Phan, Felipe Jordao, Lauren Hancock
//CMS 270 Fall 2018

import java.util.ArrayList;

public class Drugs {
	
	private String name;
	private String chem_Name;
	private ArrayList<String> ingredients = new ArrayList<>();
	private String manufacture;
	private String type;
	private ArrayList<String> conditions = new ArrayList<>();//add setters and getters
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
	
	public Drugs(String u_Name, String u_chemName, ArrayList<String> u_Ing, String u_Manu, String u_Type, ArrayList<String> u_con, int u_StipTimes){
		name = u_Name;
		chem_Name = u_chemName;
		ingredients = u_Ing;
		manufacture = u_Manu;
		type = u_Type;
		contraInd = u_con;
		stipTimes = u_StipTimes;
	}

	//------------------------------------------------------------------------
	//***Getters and Setters - blocked by get and set pairs***
	public String getName() {
		return name;
	}

	public void setName(String u_Name) {
		name = u_Name;
	}
	//------------------------------------------------------------------------
	public String getChem_Name() {
		return chem_Name;
	}

	public void setChem_Name(String u_chemName) {
		chem_Name = u_chemName;
	}
	//------------------------------------------------------------------------
	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> u_ingredients) {
		ingredients = u_ingredients;
	}
	//------------------------------------------------------------------------
	public ArrayList<String> getConditions(){
		return conditions;
	}
	public void setConditions(ArrayList<String> u_conditions) {
		conditions = u_conditions;
	}
	
	//------------------------------------------------------------------------
	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String u_manufacture) {
		manufacture = u_manufacture;
	}
	//------------------------------------------------------------------------
	public String getType() {
		return type;
	}

	public void setType(String u_Type) {
		type = u_Type;
	}
	//------------------------------------------------------------------------
	public ArrayList<String> getContraInd() {
		return contraInd;
	}

	public void setContraInd(ArrayList<String> u_ContraInd) {
		contraInd = u_ContraInd;
	}
	//------------------------------------------------------------------------
	public int getStipTimes() {
		return stipTimes;
	}

	public void setStipTimes(int u_stipTimes) {
		stipTimes = u_stipTimes;
	}
	//------------------------------------------------------------------------
	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean u_Monitored) {
		monitored = u_Monitored;
	}
	//------------------------------------------------------------------------



}