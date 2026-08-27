/*
Supponiamo di disporre di un sistema di calcolo privo di addizione, sottrazione, moltiplicazione, divisione, dotato solo delle operazioni di predecessore e successore e dei cicli.
Si desidera scrivere un programma in linguaggio java che chieda in input i due addendi interi non negativi x e y ed esegua la soma
*/

import java.util.Scanner;
public class SommaSenzaAddizione{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int x,y;
		System.out.println("***ADDIZIONE TRA INTERI NON NEGATIVI***");
		do{
			System.out.print("primo addendo = ");
			x = console.nextInt();
			if(x<0){
				System.out.println("valore errato");
			}
		} while(x<0);
		do{
			System.out.print("secondo addendo = ");
			y = console.nextInt();
			if(y<0){
				System.out.println("valore errato");
			}
		} while(y<0);
		
		while(y>0){
		y--;
		x++;
		}
		
		System.out.println("somma = " + x);
	}
}