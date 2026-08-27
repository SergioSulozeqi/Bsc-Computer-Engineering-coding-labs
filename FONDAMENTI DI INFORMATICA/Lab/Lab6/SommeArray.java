import java.util.Scanner;
public class SommeArray{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("Quanti elementi?");
		int n = console.nextInt();
		double somma=0;
		double[] a = new double[n];
		double[] b = new double[n];
		System.out.println("inserisci gli elementi del primo array, uno per riga");
		for(int i=0;i<n;i++){
			a[i]=console.nextDouble();
		}
		System.out.println("inserisci gli elementi del secondo array, uno per riga");
		for(int i=0;i<n;i++){
			b[i]=console.nextDouble();
		}

		for(int i=0; i<n; i++){
			somma = somma + a[i]+b[i];
			System.out.print(a[i]+b[i] + " ");
		}
		System.out.println("\n" + somma);

	}
}