public class CalcolaInteressi{
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

		//Creare una variabile oggetto di tipo BankAccount e la chiami account
		BankAccount account = new BankAccount();

		//Depositare 100 euro in account
		account.deposit(100);

		//Calcolare un interesse del 5% sul valore attuale del saldo (Attenzione: devo conoscere il saldo, che metodo dovrò invocare?)
		double interessi = account.getBalance()*0.05;

		//Depositare gli interessi sul conto
		account.deposit(interessi);

		//Stampare il valore attuale del saldo di account
		System.out.println("saldo attuale: " + account.getBalance());

	}
}