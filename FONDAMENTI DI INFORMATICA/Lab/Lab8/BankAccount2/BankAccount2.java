public class BankAccount2{
	private double balance;

	public BankAccount2(){
		balance=0;
	}
	public BankAccount2(double initialBalance){
		balance=initialBalance;
	}
	public boolean deposit(double amount){
		if(amount>0){
			balance += amount;
			return true;
		}
		return false;
	}
	public boolean withdraw(double amount){
		if(amount<=balance && amount>0){
			balance -= amount;
			return true;
		}
		return false;
	}
	public double getBalance(){
		return balance;
	}
	public String toString(){
		return "il saldo del conto è: "+balance;
	}
}