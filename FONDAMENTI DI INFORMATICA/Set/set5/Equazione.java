/*
è data un'equazione del tipo ax=b, essa è risolvibile solo se a!=0
scrivere in java un programma che chieda all'utente a e b e calcoli x.
*/
import java.util.Scanner;
public class Equazione{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		double a,b,x;
		System.out.println("Equazione: ax=b");
		System.out.print("Inserire a: ");
		a=console.nextDouble();
		System.out.print("Inserire b: ");
		b=console.nextDouble();
		if(a==0)
			System.out.println("l'equazione non è risolvibile perchè a deve essere diverso da 0");
		else{
			x=b/a;
			System.out.println("x = " + x);
		}
	}
}