/*
scrivere in java un programma che chieda all'utente il dividendo intero non negativo x, il divisore intero positivo y ed esegua la divisione intera con resto, calcoando il quoziente q, il resto r.
*/

import java.util.Scanner;
public class QuozienteSenzaDivisione{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int x,y,q=0,r;
		do{
			System.out.print("dividendo = ");
			x = console.nextInt();
			if(x<0){
				System.out.println("valore errato");
			}
		} while(x<0);
		do{
			System.out.print("divisore = ");
			y = console.nextInt();
			if(y<0){
				System.out.println("valore errato");
			}
		} while(y<0);
		
		while (x>=y){
			x=x-y;
			q++;
		}
		r=x;
		System.out.println("Quoziente = " + q);
		System.out.println("Resto = " + r);
	}
}