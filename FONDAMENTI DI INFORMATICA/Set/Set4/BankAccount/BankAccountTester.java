public class BankAccountTester{

	/*

	Utilizzare la classe BankAccount() che
¤  crea un conto bancario inizialmente vuoto

 ̈  double getBalance()
¤  Restituisce il valore del saldo

 ̈  void withdraw(double amount)
¤  Preleva l’ammontare indicato come parametro esplicito

 ̈  void deposit(double amount)
¤  Deposita l’ammontare indicato come parametro esplicito

	*/

	public static void main(String[] args){


		BankAccount account = new BankAccount();


		double saldo = account.getBalance();

		//Stampare il valore attuale del saldo di account
		System.out.println("saldo attuale: " + saldo);

		//Depositare 100 euro in account
		account.deposit(100);

		//Stampare il valore attuale del saldo di account
		System.out.println("saldo attuale: " + account.getBalance());

		//Prelevare 20 euro da account
		account.withdraw(20);

		//Stampare il valore attuale del saldo di account
		System.out.println("saldo attuale: " + account.getBalance());

	}

}
