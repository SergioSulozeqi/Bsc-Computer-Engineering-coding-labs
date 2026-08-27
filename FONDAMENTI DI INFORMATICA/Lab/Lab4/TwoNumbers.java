import java.util.Scanner;

public class TwoNumbers{
	public static void main(String[] args){
		System.out.println("inserisci 2 numeri: ");
		Scanner input = new Scanner(System.in);
		double n1 = input.nextInt();
		double n2 = input.nextInt();
		double somma = n1+n2;
		double prodotto = n1*n2;
		double media = (n1+n2)/2;
		double massimo;
		double minimo;
		if(n1<n2){
			minimo=n1;
			massimo=n2;
		}
		else{
			minimo=n2;
			massimo=n1;
		}
		double diff = n1-n2;
		if(diff<0){
		diff=-diff;
		}
		System.out.println("somma = " + somma);
		System.out.println("prodotto = " + prodotto);
		System.out.println("media = " + media);
		System.out.println("massimo = " + massimo);
		System.out.println("minimo = " + minimo);
		System.out.println("valore assoluto della differenza = " + diff);
	}
}
