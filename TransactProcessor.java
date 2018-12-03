import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class TransactProcessor {
	
	 public static String transactionsProcessed(){
		 return "Transaction Processed";
	 }
	 
	 public static String unableToFillPrescription(){
		return "Unable to fill prescription"; 
	 }
	 
	 public static String prescriptionFilledSuccessfully(){
		 return "Prescription Filled Successfully";
	 }
	 
	public static String align(String s, int col){
		int newCol = col - s.length();
		String newS = s;
		for (int i = 0; i < newCol; i++){
			newS += " ";
		}
		return newS;
	}
	 
//LOADING FILES METHODS BEGIN ****************************************************************************************************************	 
	 /**
	  * Method to load the Drugs.txt file into an ArrayList
	  * @param inputFile File to be read
	  * @return loaded arrayList of object Drugs
	  */
	 public static ArrayList<Drugs> loadDrugs(File inputFile) {
		ArrayList<Drugs> arrayDrugs = new ArrayList<>();
	    try{
			System.out.println("-------- Loading Drugs ------------------");
	    	Scanner file = new Scanner(inputFile);
	    	file.useDelimiter(",");
	    	String str = "";
	    	String str1 = "";
			int i = 0;
			while(file.hasNextLine()){
				str = file.nextLine();
				if ( !str.equals("") ){
					Scanner txt = new Scanner(str);				
					txt.useDelimiter(",");
					Drugs d = new Drugs(txt.next(), txt.next(), txt.next(), txt.next(), txt.nextInt(), txt.nextBoolean());
					str1 = txt.next();
					while (!str1.equals("/")){
				 		d.addIngredients(str1);
						str1 = txt.next();
					}
					while (txt.hasNext()){
						d.addContraInd(txt.next());
					}
					arrayDrugs.add(i, d);
//					d.getInfo();
//					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					i++;
				}
			}
			file.close();
			return arrayDrugs;
		}catch (FileNotFoundException e) {
		  	System.out.println(e.toString());
			return arrayDrugs;
	    }
	 }

//LOADING FILES Page ....................................................................
	 /**
	  * Method to load the Doctor.txt file into an ArrayList
	  * @param inputFile File to be read
	  * @return loaded arrayList of object Doctor
	  */
	 public static ArrayList<Doctor> loadDoctor(File inputFile) {
		ArrayList<Doctor> arrayDoctor = new ArrayList<>();
	    try{
			System.out.println("-------- Loading Doctor -----------------");
	    	Scanner file = new Scanner(inputFile);
	    	file.useDelimiter(",");
	    	String str = "";
			int i = 0;
			while(file.hasNextLine()){
				str = file.nextLine();
				if ( !str.equals("") ){
					Scanner txt = new Scanner(str);				
					txt.useDelimiter(",");
					Doctor d = new Doctor(txt.next(), txt.next(), txt.next(), txt.next());
//					System.out.println(d.getInfo());
					arrayDoctor.add(i, d);
					i++;
				}
			}
			file.close();
			return arrayDoctor;
		}catch (FileNotFoundException e) {
		  	System.out.println(e.toString());
			return arrayDoctor;
	    }
	 }

//LOADING FILES Page....................................................................

	 /**
	  * Method to load the Patients.txt file into an ArrayList
	  * @param inputFile File to be read
	  * @return loaded arrayList of object Patients
	  */
	 public static ArrayList<Patients> loadPatients(File inputFile) {
		 ArrayList<Patients> arrayPatients = new ArrayList<>();
		 try{
			System.out.println("-------- Loading Patients ---------------");
		   	Scanner file = new Scanner(inputFile);
		   	file.useDelimiter(",");
		   	String str = "";
			int i = 0;
			while(file.hasNextLine()){
				str = file.nextLine();
				if ( !str.equals("") ){
					Scanner txt = new Scanner(str);				
					txt.useDelimiter(",");
					Patients p = new Patients(txt.next(), txt.next(), txt.next(), txt.next(), txt.next());
//					System.out.println(p.getInfo());
					arrayPatients.add(i, p);
					i++;
				}
			}
			file.close();
			return arrayPatients;
		} catch (FileNotFoundException e) {
		  	System.out.println(e.toString());
		  	return arrayPatients;
	    }
	 }

//LOADING FILES Page....................................................................

	 /**
	  * Method to load the Pharmacists.txt file into an ArrayList
	  * @param inputFile File to be read
	  * @return loaded arrayList of object Pharmacists
	  */
	 public static ArrayList<Pharmacists> loadPharmacists(File inputFile) {
		 ArrayList<Pharmacists> arrayPharmacists = new ArrayList<>();
		 try{
			System.out.println("-------- Loading Pharmacists ------------");
		   	Scanner file = new Scanner(inputFile);
		   	file.useDelimiter(",");
		   	String str = "";
			int i = 0;
			while(file.hasNextLine()){
				str = file.nextLine();
				if ( !str.equals("") ){
					Scanner txt = new Scanner(str);				
					txt.useDelimiter(",");
					Pharmacists p = new Pharmacists(txt.next(), txt.next(), txt.next(), txt.next(), txt.next());
//					System.out.println(p.getInfo());
					arrayPharmacists.add(i, p);
					i++;
				}
			}
			file.close();
			return arrayPharmacists;
		}catch (FileNotFoundException e) {
		  	System.out.println(e.toString());
		  	return arrayPharmacists;
	    }
	 }

//LOADING FILES Page....................................................................

	 /**
	  * Method to load the Prescriptions.txt file into an ArrayList
	  * @param inputFile File to be read
	  * @return loaded arrayList of object Prescriptions
	  */
	 public static ArrayList<Prescriptions> loadPrescriptions(File inputFile) {
		 ArrayList<Prescriptions> arrayPrescriptions = new ArrayList<>();
		 try{
			System.out.println("-------- Loading Prescriptions ----------");
		   	Scanner file = new Scanner(inputFile);
		   	file.useDelimiter(",");
		   	String str = "";
			int i = 0;
			while(file.hasNextLine()){
				str = file.nextLine();
				if ( !str.equals("") ){
					Scanner txt = new Scanner(str);				
					txt.useDelimiter(",");
					Prescriptions p = new Prescriptions(txt.nextInt(), txt.next(), txt.next(), txt.next(), txt.next());
//					System.out.println(p.getInfo());
					arrayPrescriptions.add(i, p);
					i++;
				}
			}
			file.close();
			return arrayPrescriptions;
		}
		 	catch (FileNotFoundException e) {
		  	System.out.println(e.toString());
		  	return arrayPrescriptions;
        }
	 }

//LOADING FILES Page....................................................................

	 /**
	  * Method to load the DrugLine.txt file into an ArrayList
	  * @param inputFile File to be read
	  * @return loaded arrayList of object DrugLine
	  */
	 public static ArrayList<DrugLine> loadDrugLine(File inputFile) {
		 ArrayList<DrugLine> arrayDrugLine = new ArrayList<>();
		 try{
			System.out.println("-------- Loading Drug Line --------------");
		   	Scanner file = new Scanner(inputFile);
		   	file.useDelimiter(",");
		   	String str = "";
			int i = 0;
			while(file.hasNextLine()){
				str = file.nextLine();
				if ( !str.equals("") ){
					Scanner txt = new Scanner(str);				
					txt.useDelimiter(",");
					DrugLine dl = new DrugLine(txt.nextInt(), txt.next(), txt.nextInt(), txt.next(), txt.nextInt(), txt.nextInt());
//					System.out.println(dl.getInfo());
					arrayDrugLine.add(i, dl);
					i++;
				}
			}
			file.close();
			return arrayDrugLine;
		}
		 catch (FileNotFoundException e) {
		  	System.out.println(e.toString());
		  	return arrayDrugLine;
	    }
	 }
//LOADING FILES Page....................................................................
	 
	 /**
	  * This method load txt files into arrays of object types: 
	  * Doctor, Patients, Pharmacists, Drugs, Prescriptions, Drugline
	  */
	 public static void load_Process_Files(){
		 
			File doctor = new File("Doctor.txt");
			File patients = new File("Patients.txt");
			File pharmacists = new File("Pharmacists.txt");
			File drugs = new File("Drugs.txt");
			File prescriptions = new File("Prescriptions.txt");
			File drugline = new File("DrugLine.txt");
			File transactions = new File("Transactions.txt");
					
			ArrayList<Doctor> doctorArray = new ArrayList<>();
			ArrayList<Patients> patientsArray = new ArrayList<>();
			ArrayList<Pharmacists> pharmacistsArray = new ArrayList<>();
			ArrayList<Drugs> drugsArray = new ArrayList<>();
			ArrayList<Prescriptions> prescriptionsArray = new ArrayList<>();
			ArrayList<DrugLine> druglineArray = new ArrayList<>();
			
			doctorArray = loadDoctor(doctor);
			patientsArray = loadPatients(patients);
			pharmacistsArray = loadPharmacists(pharmacists);
			drugsArray = loadDrugs(drugs);
			prescriptionsArray = loadPrescriptions(prescriptions);
			druglineArray = loadDrugLine(drugline);
			
			prescriptionsReport("Prescriptions Before.txt", prescriptionsArray, druglineArray);
			processTransactions(doctorArray, patientsArray, pharmacistsArray, drugsArray, prescriptionsArray, druglineArray, transactions);
			prescriptionsReport("Prescriptions After.txt",prescriptionsArray, druglineArray);
		 
	 }
//END LOADING FILES METHODS ********************************************************************************************************	
	 
//PROCESS FILES METHODS BEGIN ******************************************************************************************************	
	 public static void updatePrescriptions(String lookupID, String lkpDrug, ArrayList<DrugLine> dl){
		 
		 boolean foundID = false;
		 int i = 0;
		 for (i = 0; i < dl.size(); i++){
			if (dl.get(i).getPrescID() == Integer.parseInt(lookupID)){
				foundID = true;
				break;				
			}
		 }
		 try{
				PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter("TransactionsLog.txt", true)));
				outFile.println("*********************************************************************************************************************");
				outFile.println("                                            Transactions Log                                                         ");
				outFile.println("*********************************************************************************************************************");
				outFile.println("");
				if (foundID){
					while (dl.get(i).getPrescID() == Integer.parseInt(lookupID)){
						if (dl.get(i).getDrug().equals(lkpDrug)){
							outFile.println("*********************************************************************************************************************");
							outFile.println("Current Status:");
							outFile.println(dl.get(i).getInfo());
							if (dl.get(i).getRefillsLeft() > 0){
								dl.get(i).setRefillsLeft(dl.get(i).getRefillsLeft() - 1);
								dl.get(i).setTimesFilled(dl.get(i).getTimesFilled() + 1);
								outFile.println("Refilled:");
								outFile.println(dl.get(i).getInfo());
								outFile.println(prescriptionFilledSuccessfully()+ " >>>>>");
								outFile.println("*********************************************************************************************************************");
							}else{
								outFile.println(unableToFillPrescription() + " -> Exceeded quantity");
								outFile.println("*********************************************************************************************************************");
								outFile.println("");
							}
						}
						i++;
					}
				 }else{
					 outFile.println("***********************************************************************************************");
					 outFile.println("Current Status:");
					 outFile.println(unableToFillPrescription() + " -> Prescription ID: "+ dl.get(0).fillZeros(Integer.parseInt(lookupID)) + " not found!!! ");
					 outFile.println("***********************************************************************************************");
					 outFile.println("");
				 }
				outFile.flush();
				outFile.close();
		 	   } catch (IOException e){
				     System.out.println(e.toString());
		 	   } 

	 }

//PROCESS Files page......................................................................................
		 
	 public static void newPrescription(ArrayList<Doctor> doctorArray, ArrayList<Patients> patientsArray, 
         ArrayList<Pharmacists> pharmacistsArray, ArrayList<Drugs> drugsArray, 
         ArrayList<Prescriptions> prescriptionsArray, ArrayList<DrugLine>druglineArray, ArrayList<String> strLine){
		 
		 int newPrescId = prescriptionsArray.get(prescriptionsArray.size() - 1).getPre_ID() + 1; //getting the last Presc ID and Incrementing 1
		 //                                     (last position in    ArrayList).  last ID + 1 -> now we know the new Presc ID
		 
		 // Checking if Patients and Doctors exist 
		 if (lookupPatients(strLine.get(1), patientsArray) == -1){
			 Patients p = new Patients();
			 p.setName(strLine.get(1));
			 patientsArray.add(p);
		 }

		 if (lookupDoctor(strLine.get(2), doctorArray) == -1){
			 Doctor d = new Doctor();
			 d.setName(strLine.get(2));
			 doctorArray.add(d);
		 }
		 //----------------------------------------------------
		 
		 Prescriptions presc = new Prescriptions(newPrescId, strLine.get(0), strLine.get(1), strLine.get(2), strLine.get(3));
		 prescriptionsArray.add(presc);
		 
		 for (int i = 4; i < strLine.size(); i+= 3){
			 if (lookupDrug(strLine.get(i), drugsArray) > -1){
				 DrugLine dl = new DrugLine(newPrescId, strLine.get(i), Integer.parseInt(strLine.get(i+1)), strLine.get(i+2), Integer.parseInt(strLine.get(i+1)) - 1, 1);
				 druglineArray.add(dl);
			 }else{
				 DrugLine dl = new DrugLine();
				 dl.setPrescID(newPrescId);
				 dl.setDrug(">> " + strLine.get(i) + " << Unavailable");
				 druglineArray.add(dl);
			 }
			 
		 }
		 
	 }

//PROCESS Files Page.............................................................................................	 
	 
	 public static void processTransactions(ArrayList<Doctor> doctorArray, ArrayList<Patients> patientsArray, 
			                                ArrayList<Pharmacists> pharmacistsArray, ArrayList<Drugs> drugsArray, 
			                                ArrayList<Prescriptions> prescriptionsArray, ArrayList<DrugLine>druglineArray, File inputFile){
		 
		 try{
			System.out.println("-------- Loading Transactions  ----------");
		   	Scanner file = new Scanner(inputFile);
		   	file.useDelimiter(",");
		   	String str = "";
			int count = 0;
			int i = 0;
			ArrayList <String> line = new ArrayList<>();
			String trans = "";
			String lookup = "";
			String lkpDrug = "";
			while(file.hasNextLine()){
				
				str = file.nextLine();
				if ( !str.equals("") ){
					Scanner txt = new Scanner(str);				
					txt.useDelimiter(",");
					trans = txt.next();
					switch (trans){
						case "FP":
							while (txt.hasNext()){
								line.add(txt.next());
							}
							if (line.size() > 2){
								newPrescription(doctorArray, patientsArray, pharmacistsArray, drugsArray, prescriptionsArray, druglineArray, line);
								line.clear();
							}else{
								lookup = line.get(0);  //Prescription ID
								lkpDrug = line.get(1); //Drug to be found								
								line.clear();
								updatePrescriptions(lookup, lkpDrug, druglineArray);
							}
							break;
						case "FD": //Prints doctors who prescribed a determined drug more than stipulated times
							lookup = txt.next();
							listOfDoctors(lookup, doctorArray, prescriptionsArray, druglineArray, drugsArray);
							break;
						case "PD": //Prints drugs prescribed more than stipulated times by a doctor
							lookup = txt.next();
							doctorsReport(lookup, doctorArray, prescriptionsArray, druglineArray, drugsArray);
							break;
						case "FDC": //Prints a cross reference list of drugs and a named drug as a contraindication 
							lookup = txt.next();
							drugsContraInd(lookup, drugsArray);							
							break;
						case "CD": //Prints doctor info
							lookup = txt.next();
							contactDoctor(lookup, doctorArray);
							break;
						default:
							break;
					}
				}
			}
			file.close();
		}
		 catch (FileNotFoundException e) {
		  	System.out.println(e.toString());
	    }
	 
	 }
	 
//PROCESS FILES METHODS END *****************************************************************************************************
	 
//LOOKUP METHODS BEGIN **********************************************************************************************************
	 
	 public static int lookupArrayList(String lookup, ArrayList<String> s){
		 int iReturn = -1;
		 for (int i = 0; i < s.size(); i++){
			if (s.get(i).equals(lookup)){
				iReturn = i;
				break;				
			}
		 }
		 return iReturn;
	 }
	 
//LOOKUP Page.............................................................................	 
	 public static int lookupPatients(String s, ArrayList<Patients> p){
		 int iReturn = -1;
		 for (int i = 0; i < p.size(); i++){
			if (p.get(i).getName().equals(s)){
				iReturn = i;
				break;				
			}
		 }
		 return iReturn;
	 }
//LOOKUP Page.............................................................................	 
	 public static int lookupDoctor(String s, ArrayList<Doctor> d){
		 int iReturn = -1;
		 for (int i = 0; i < d.size(); i++){
			if (d.get(i).getName().equals(s)){
				iReturn = i;
				break;				
			}
		 }
		 return iReturn;
	 }
//LOOKUP Page.............................................................................	 
	 public static int lookupDrug(String s, ArrayList<Drugs> d){
		 int iReturn = -1;
		 for (int i = 0; i < d.size(); i++){
			if (d.get(i).getName().equals(s)){
				iReturn = i;
				break;				
			}
		 }
		 return iReturn;
	 }
//LOOKUP Page.............................................................................	 
	 public static int lookupDrugLine(int lookup, ArrayList<DrugLine> dl){
		 int iReturn = -1;
		 for (int i = 0; i < dl.size(); i++){
			if (dl.get(i).getPrescID() == lookup){
				iReturn = i;
				break;				
			}
		 }
		 return iReturn;
	 }
	 
//LOOKUP METHODS END ************************************************************************************************************	 
	 
//REPORT METHODS BEGIN **********************************************************************************************************
	 
	 public static void drugsContraInd(String lookup, ArrayList<Drugs> drugsArray){
		 
		 ArrayList<String> drugs = new ArrayList<>();
		 
		 for (int i = 0; i < drugsArray.size(); i++){
			 for (int j = 0; j < drugsArray.get(i).getContraIndArray().size(); j++){
				 if (drugsArray.get(i).getContraInd(j).equals(lookup)){
					 drugs.add(drugsArray.get(i).getName());
					 break;
				 }
				 
			 }
		 }
		 try{
				FileOutputStream outputFile = new FileOutputStream(lookup + " - Contraindications");
				PrintWriter outFile = new PrintWriter(outputFile);
				outFile.println("**********************************************");
				outFile.println("  Contraindications Report : " + lookup );
				outFile.println("**********************************************");
				outFile.println("");
				outFile.println("-----------------------------------------------");
				outFile.println("  Drug Name ");
				outFile.println("-----------------------------------------------");
				for (int i = 0; i < drugs.size(); i++){
					outFile.println("  " + drugs.get(i));
				}
				outFile.flush();
				outFile.close();
			}
			catch (FileNotFoundException e) {
	    	  System.out.println(e.toString());
			}
	 }
	 
//REPORT Page..................................................................................
	 
	 public static void contactDoctor(String lookup, ArrayList<Doctor> d){
		 boolean found = false;
		 for (int i = 0; i < d.size(); i++){
			 if ( d.get(i).getName().equals(lookup) ){
				 try{
						FileOutputStream outputFile = new FileOutputStream(lookup + " Doctor Info");
						PrintWriter outFile = new PrintWriter(outputFile);
						outFile.println("**********************************************");
						outFile.println("  Information Report: " + lookup );
						outFile.println("**********************************************");
						outFile.println("");
						outFile.println("-----------------------------------------------");
						outFile.println("  " + d.get(i).getInfo());
						outFile.println("-----------------------------------------------");
						outFile.flush();
						outFile.close();
					}
					catch (FileNotFoundException e) {
			    	  System.out.println(e.toString());
					}
				 found = true;
				 break;
			 }
		 }
		 if (!found){
			System.out.println("Doctor not found!!!");
		 }
	 }

//REPORT Page..................................................................................
	 
	 public static void listOfDoctors(String drugLookup, ArrayList<Doctor> doctor, ArrayList<Prescriptions> presc, ArrayList<DrugLine> dl, ArrayList<Drugs>drugsArray){
			 ArrayList<String> doctorList = new ArrayList<>();
			 ArrayList<Integer> drugQty = new ArrayList<>();
			 
			 int prescId = 0;
			 int i = 0;
			 int iPresc = 0;
			 int iDoctor = 0;
			 while ( i < dl.size() ){
				 prescId = dl.get(i).getPrescID();
				 while (dl.get(i).getPrescID() == prescId){
					 if (drugLookup.equals(dl.get(i).getDrug())){
						 
						 iDoctor = lookupArrayList(presc.get(iPresc).getDoctor(),doctorList);
						 if ( iDoctor > -1){
							 drugQty.set(iDoctor, drugQty.get(iDoctor) +  dl.get(i).getQty());
						 }else{
							 doctorList.add(presc.get(iPresc).getDoctor());
							 drugQty.add(dl.get(i).getQty());
						 }
						 
					 }
					 if ( i < dl.size() - 1){
						 i++;
					 }else{
						 i++;
						 break;
					 }
				 }
				 iPresc++;
			 }
			 if (!doctorList.isEmpty()){
				 printReportToFile("Drug Report: ","Doctor Name", drugLookup, doctorList, drugQty);
			 }else{
				 printReportToFile("Not prescribed above stipulated times","", drugLookup, doctorList, drugQty);
			 }
     }

//REPORT Page..................................................................................

	 public static void doctorsReport(String lookup, ArrayList<Doctor> doctor, ArrayList<Prescriptions> presc, ArrayList<DrugLine> dl, ArrayList<Drugs>drugsArray){
			 ArrayList<String> drugName = new ArrayList<>();
			 ArrayList<Integer> drugQty = new ArrayList<>();
			 ArrayList<Integer> prescId = new ArrayList<>();
			 
			 if (lookupDoctor(lookup, doctor) > -1){
				 
				 //Storing all Prescription IDs referred to the doctor
				 for (int i = 0; i < presc.size(); i++){
					 if (presc.get(i).getDoctor().equals(lookup)){
						 prescId.add(presc.get(i).getPre_ID());
					 }
				 }
				 //--------------------------------------------------
				 // Filling up Array with drugs and quantities prescribed
				 int j = 0;
				 int iDrugName = -1;
				 for (int i = 0; i < prescId.size(); i++){
					 j = lookupDrugLine(prescId.get(i), dl);
					 while (dl.get(j).getPrescID() == prescId.get(i)){
						 iDrugName = lookupArrayList(dl.get(j).getDrug(), drugName);
						 if (iDrugName > -1){
							 drugQty.set(iDrugName, drugQty.get(iDrugName) + dl.get(j).getQty());
							 j++;
						 }else{
							 drugQty.add(dl.get(j).getQty());
							 drugName.add(dl.get(j).getDrug());
							 if (dl.size() - 1 < j){
								 j++;
							 }else{
								 break;
							 }
						 }
					 }
				 }
				 //--------------------------------------------------
				 //Checking drugs that did not exceed the stipulated times
				 int iDrug = 0;
				 
				 for (int i = 0; i < drugName.size(); i++){
					 iDrug = lookupDrug(drugName.get(i), drugsArray);
					 if ( iDrug > -1){
						 if (drugsArray.get(iDrug).getStipTimes() >= drugQty.get(i)){
							 drugName.remove(i);
							 drugQty.remove(i);
							 i = -1;
						 }
					 }else{
						 drugName.remove(i);
						 drugQty.remove(i);
						 i = -1;
					 }
				 }
				 printReportToFile("Doctor Report: ","Drug Name", lookup + "- Drugs Prescribed", drugName, drugQty);
			 }else{
				System.out.println("Doctor not found!!!");
			 }
	 }

//REPORT Page..................................................................................

	 public static void prescriptionsReport(String fileName, ArrayList<Prescriptions> pr, ArrayList<DrugLine> dl){
		 
		 try{
				FileOutputStream outputFile = new FileOutputStream(fileName);
				PrintWriter outFile = new PrintWriter(outputFile);
				outFile.println("--------------------------------------------------------------------------------------------------------");
				outFile.println("                                     Prescriptions Report                                               ");
				outFile.println("--------------------------------------------------------------------------------------------------------");
				outFile.println("");
				int id = 0;
				int bof = 0;
				for (int i = 0; i < pr.size(); i++){
					outFile.println("********************************************************************************************************");
					outFile.println("Prescription: " + pr.get(i).fillZeros(pr.get(i).getPre_ID()) + "  Patient: " + pr.get(i).getPatient() +
							           "     Date: " + pr.get(i).getDate());
					outFile.println("Doctor: " + pr.get(i).getDoctor() + "    Pharmacist: " + pr.get(i).getPharmacist());
					outFile.println("--------------------------------------------------------------------------------------------------------");
					outFile.println("    ----------------------------------------------------------------------------------------------------");
					outFile.println("    |   ID   | Drug Name                               |   Qty   | Dosage | Ref Left | Times Ref |");
					outFile.println("    ----------------------------------------------------------------------------------------------------");
					for (bof = 0; bof < dl.size(); bof++){
						if (dl.get(bof).getPrescID() == pr.get(i).getPre_ID()){
							break;
						}
					}
					for (int j = bof; j < dl.size(); j++){
						if (dl.get(j).getPrescID() != pr.get(i).getPre_ID()){
							break;
						}else{
							outFile.println(dl.get(j).getReport());
						}
					}
					outFile.println("********************************************************************************************************");
					outFile.println("");
				}
				outFile.flush();
				outFile.close();

		 }catch (FileNotFoundException e) {
	    	  System.out.println(e.toString());
			}

		 
	 }

//REPORT Page..................................................................................

	 public static void printReportToFile(String title, String col, String outFileName, ArrayList<String> s, ArrayList<Integer> qty){

		 try{
				FileOutputStream outputFile = new FileOutputStream(outFileName);
				PrintWriter outFile = new PrintWriter(outputFile);
				outFile.println("***********************************************************");
				outFile.println("  " + title + ": " + outFileName );
				outFile.println("***********************************************************");
				outFile.println("");
				if (!s.isEmpty()){
					outFile.println("-----------------------------------------------");
					outFile.println("          " + align(col, 25) +"| Quantity ");
					outFile.println("-----------------------------------------------");
				}
				for (int i = 0; i < s.size(); i++){
					outFile.println("  " + align(s.get(i), 38) + align(Integer.toString(qty.get(i)),5));
				}
				outFile.flush();
				outFile.close();
			}
			catch (FileNotFoundException e) {
	    	  System.out.println(e.toString());
			}
	 }

	 
// END REPORTS ************************************************************************************************************************************	 	
	
//-- Main ---------------------------------------------------------------------	
	public static void main(String[] args){
		
		load_Process_Files();
	}
	
//-----------------------------------------------------------------------------

}
