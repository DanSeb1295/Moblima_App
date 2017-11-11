package moblima;
import java.util.ArrayList;

enum AgeCat {CHILD, STUDENT, SENIOR_CITIZEN, ADULT}

public class CustAcc {
		
	public ArrayList<Transaction> transactionList;
	private double mobileNumber;
	private String email;
	public AgeCat ageCat; //change UML diagram
		
	public CustAcc(double mobileNumber, String email, AgeCat ageCat) {
			this.mobileNumber = mobileNumber;
			this.email = email;
			this.ageCat = ageCat;
		}
		
	public AgeCat getAgeCat() {
			return ageCat;
		}
		
	public String getEmail() {
			return email;
		}
		
	public double getMobileNumber() {
			return mobileNumber;
		}
		
	public ArrayList<Transaction> getTransactionList(){
			return transactionList;
		}	
	public void addTransaction(Transaction transactionToAdd){
		transactionList.add(transactionToAdd);	
		}
		
}


