import java.util.Scanner;
public class SomeNumbers{
	public static void main(String[] args){
		Scanner console= new Scanner(System.in);
		double somma=0,sommaAssoluta=0,prodotto=1,media;
		int i=0;
		System.out.println("***inserire una quantità arbitraria di numeri***");
		while(console.hasNextDouble()){
			double n = console.nextDouble();
			somma += n;
			sommaAssoluta += Math.abs(n);
			prodotto *= n;
			i++;
		}

		if(i<2){
			System.out.println("Devi inserire almeno 2 numeri");
		}
		else{
			System.out.println("somma = " + somma);
			System.out.println("somma assoluta = " + sommaAssoluta);
			System.out.println("prodotto = " + prodotto);
			System.out.println("media = " + (somma/i));
		}
	}
}