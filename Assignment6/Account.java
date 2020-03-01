package Assignment6;

public class Account {
	protected String FirstName = "";
	protected String LastName = "";
	protected double CurBalance;

	public Account(String fname, String lname, double curbalance) {
		this.FirstName = fname;
		this.LastName = lname;
		this.CurBalance = curbalance;
	}

	public String getAcctType() {
		return this.getClass().getName();
	}
	
	public double DebitTransaction(double debitAmount){
		this.CurBalance=this.CurBalance-debitAmount;
		return this.CurBalance;
	}
	
	public double CreditTransaction(double creditAmount){
		this.CurBalance=this.CurBalance+creditAmount;
		return this.CurBalance;
	}
	
	public String toString(){
		return "Account name: "+this.FirstName+" "+this.LastName+"\nAccount Type: "+getAcctType()+"\n Balance $"+this.CurBalance;
	}
	
	
	public static void main(String[] args) {
        CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50); // he was poor once before
        System.out.println(ch1);


        ch1.DebitTransaction(0.25); // he was cheap back then too
        System.out.println(ch1);    // should be $39.75 (= $49.75 - $10 fee)


        ch1.CreditTransaction(7.00); // small expense check
        System.out.println(ch1);     // should be $36.75 (= $39.75 + $7.00 - $10 fee)


        ch1.CreditTransaction(1000000); // a huge bonus!!
        System.out.println(ch1); // should be $1000036.75

	    
	 }

}
