import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class TransactProcessor implements Information {
	
	 public String TransactionsProcessed(){
		 return "";
	 }
	 
	 public String UnableToFillPrescription(){
		return ""; 
	 }
	 
	 public String PrescriptionFilledSuccessfully(){
		 return "";
	 };
	 
	 public HashMap<String, Integer> findDoctor(ArrayList<String> doctor, ArrayList<Drugs> drugs, ArrayList<Prescriptions> Presc){
		 HashMap<String, Integer> doctors = new HashMap<>();
		 return doctors;
	 }
	 
	 public HashMap<String, Integer> findDrugContraIndications(String doc_Name){
		 HashMap<String, Integer> doctors = new HashMap<>();
		 return doctors;
	 }
	 
	 public String ContactDoctor(HashMap<String, String> doctorsDB, String docName){
		 
		 return "Doctor's info";
	 }
	 
	 public void Commit(){
		 
	 }
	 
	 public void processTransactions(){
		 
	 }

	
	
//-- Main ---------------------------------------------------------------------	
	public static void main(String[] args){
		
		
		
	}
	
//-----------------------------------------------------------------------------

}
