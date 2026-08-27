/*
si vuole coprire con una striscia di piastrelle un muro tale che le piastrelle si alternino nere e bianche e sia la prima che l'ultima siano nere.
scrivere un programma che dati in input la larghezza di un muro e la larghezza di una piastrella, stabilisca il numero di piastrelle utilizzate e la lunghezza del tratto di muro non coperto da piastrelle.
*/

import java.util.Scanner;
public class Piastrelle{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		double piastrella, muro;
		System.out.print("Inserisci la larghezza delle piastrelle: ");
		piastrella=console.nextDouble();
		System.out.print("Inserisci la larghezza del muro: ");
		muro=console.nextDouble();
		double muro2 = muro-piastrella;
		double coppie = muro2/(piastrella*2);
		int coppieIntere = (int) coppie;
		double gap = (muro-(coppieIntere*piastrella*2+piastrella))/2;
		int piastrelle = coppieIntere*2+1;
		System.out.println("Sono state utilizzate " + piastrelle + " piastrelle ed è stato lasciato un gap di " + gap + " all'inizio e alla fine del muro");
	}
}