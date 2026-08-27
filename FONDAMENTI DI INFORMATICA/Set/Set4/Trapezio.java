/*
Realizzare in java un programma che chieda la base minore, la base maggiore, l'altezza di un trapezio e calcoli l'area
*/

import java.util.Scanner;
public class Trapezio{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		double bMag,bMin,h,a;
		
		System.out.print("base maggiore = ");
		bMag=tastiera.nextDouble();
		
		System.out.print("base minore = ");
		bMin=tastiera.nextDouble();
		
		System.out.print("altezza = ");
		h=tastiera.nextDouble();
		
		a = (bMag+bMin)*h/2;
		
		System.out.println("area = " + a);
		
	}
}