import java.util.Scanner;
import java.math.*;
public class TriangoloRettangolo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double cat1, cat2, ipo;
		System.out.print("Primo cateto=");
		cat1=input.nextDouble();
		System.out.print("Secondo cateto=");
		cat2=input.nextDouble();
		if(cat1>=0 && cat2>=0){
			ipo=Math.sqrt(cat1*cat1 + cat2*cat2);
			System.out.println("ipotenusa=" + ipo);
		} else{
			System.out.println("Dati in input errati, la lunghezza di entrambi i cateti deve essere non nulla");
		}
	}
	
}