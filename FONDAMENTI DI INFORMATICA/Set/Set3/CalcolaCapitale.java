import java.util.Scanner;
public class CalcolaCapitale{
	public static void main (String args[]){
		Scanner tastiera = new Scanner(System.in);
		double i, imp, a, capf;
		System.out.print("Capitale o importo iniziale: ");
		imp = tastiera.nextDouble();
		System.out.print("Tasso di interesse(da 0.00 a 1.00): ");
		i = tastiera.nextDouble();
		System.out.print("N. anni: ");
		a = tastiera.nextDouble();
		capf = imp*(1+a*i);
		System.out.println("Capitale finale: " + capf);
	}	
}