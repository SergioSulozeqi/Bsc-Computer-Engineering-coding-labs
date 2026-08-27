import java.util.Scanner;
public class SommaDouble{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//devo usare la virgola se il mio sistema operativo usa la lingua italiana
		System.out.println("inserisci il primo numero: ");
		double n1 = input.nextDouble();
		System.out.println("inserisci il secondo numero: ");
		double n2 = input.nextDouble();
		System.out.println("inserisci il terzo numero: ");
		double n3 = input.nextDouble();
		double somma = n1+n2+n3;
		System.out.println("la somma è: " + somma);
	}
}