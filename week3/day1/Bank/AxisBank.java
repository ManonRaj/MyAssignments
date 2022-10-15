package week3.day1.Bank;

public class AxisBank extends BankInfo {
	//Method Overriding
	public int deposit(int depamnt)
	{
		int deposit = depamnt;
		System.out.println("Deposit Amount is : "+deposit);
		return deposit;
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving(542654);
		obj.fixed(83764);		
		obj.deposit(6000);


	}

}
