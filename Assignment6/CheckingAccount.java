package Assignment6;

public class CheckingAccount extends Account {
	
	private static final double MinBalance=100;
	private static final double Fee=10;
	public CheckingAccount(String fname, String lname, double cb){
		super(fname,lname,cb);
	}
	
	private void ChargeFee(){
		if (this.CurBalance<MinBalance){
			this.CurBalance=this.CurBalance-Fee;
			System.out.println("Penalty of $"+Fee+" is charged\n");
		}
	}
	@Override
	public double DebitTransaction(double debitAmount){
		super.DebitTransaction(debitAmount);
		ChargeFee();
		return CurBalance;
	}
	
	@Override
	public double CreditTransaction(double creditAmount){
		super.CreditTransaction(creditAmount);
		ChargeFee();
		return CurBalance;
	}
}
