/*
Scrivere in java un programma che inserito un numero stabilisce se è o meno una potenza di 2
*/

import java.util.Scanner;
public class Potenza{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int x,p=1;
		do{
			System.out.println("inserisci x intero e positivo");
			x = console.nextInt();
			if(x<=0){
				System.out.println("il numero x deve essere positivo");
			}
		} while(x<=0);
		while(p<x){
			p = p*2;
		}
		if(p==x){
			System.out.println("x è una potenza di 2");
		}else
			System.out.println("x NON è una potenza di 2");
	}
}