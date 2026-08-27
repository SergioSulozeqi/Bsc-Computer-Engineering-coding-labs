/*
Realizzare in java un programma che chieda la base, l'altezza di un rettangolo e calcoli il perimetro, la diagonale, l'area.

*/

import java.util.Scanner;
public class Rettangolo{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		double a,b,h,d,p;
		System.out.print("base = ");
		b=tastiera.nextDouble();
		System.out.print("altezza = ");
		h=tastiera.nextDouble();
		p=(b+h)*2;
		a=b*h;
		d=Math.sqrt(b*b + h*h);
		
		System.out.println("perimetro = " + p);
		System.out.println("area = " + a);
		System.out.println("diagonale = " + d);
	}
}