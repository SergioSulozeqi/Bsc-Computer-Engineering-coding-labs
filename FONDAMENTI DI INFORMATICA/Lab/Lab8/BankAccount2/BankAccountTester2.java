import java.util.Scanner;
public class BankAccountTester2{
	public static void main(String[] args){
		BankAccount2 acc = new BankAccount2();
		Scanner sc = new Scanner(System.in);
		String s = "";
		do{
			System.out.println("Inserire un comando (Q,B,D,W,A): ");
			s = sc.next();

			if(s.equalsIgnoreCase("B")){
				System.out.println("Saldo attuale: " + acc.getBalance());
			}

			if(s.equalsIgnoreCase("D")){
				double somma = sc.nextDouble();
				boolean done = acc.deposit(somma);
				if(done){
					System.out.println("Versamento effettuato: " + acc.getBalance());
				}
				else{
					System.out.println("Versamento non corretto");
				}
			}

			if(s.equalsIgnoreCase("W")){
				double somma = sc.nextDouble();
				boolean done = acc.withdraw(somma);
				if(done){
					System.out.println("Prelievo effettuato: " + acc.getBalance());
				}
				else{
					System.out.println("Prelievo non autorizzato");
				}
			}

			if(s.equalsIgnoreCase("A")){
				double interessi = sc.nextDouble();
				double balance = acc.getBalance();
				boolean done = acc.withdraw(balance*interessi);
				if(done){
					System.out.println("Interessi calcolati e accreditati: " + acc.getBalance());
				}
				else{
					System.out.println("impossibile accreditare gli interessi");
				}
			}
			sc.nextLine();
		} while(!s.equalsIgnoreCase("Q"));

		sc.close();
	}
}