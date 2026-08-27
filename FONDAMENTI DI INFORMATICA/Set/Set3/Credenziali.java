import java.util.Scanner;
public class Credenziali{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String nome, cognome;
		int eta;
		System.out.print("inserire il nome dell'utente: ");
		nome=s.next();
		System.out.print("inserire il cognome dell'utente: ");
		cognome=s.next();
		System.out.print("inserire l'età dell'utente: ");
		eta = s.nextInt();
		char c1 = nome.charAt(0);
		char c2 = cognome.charAt(0);
		System.out.println("la tua password è: "+c1+c2+eta);
	}
}