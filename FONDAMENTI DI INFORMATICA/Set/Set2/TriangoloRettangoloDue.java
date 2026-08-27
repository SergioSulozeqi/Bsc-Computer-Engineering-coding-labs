import java.util.Scanner;
import java.math.*;
public class TriangoloRettangoloDue{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double lato1,lato2,lato3;
		System.out.print("Primo lato=");
		lato1=input.nextDouble();
		System.out.print("Secondo lato=");
		lato2=input.nextDouble();
		System.out.print("Terzo lato=");
		lato3=input.nextDouble();
		if(lato1*lato1==lato2*lato2+lato3*lato3 || lato2*lato2==lato1*lato1+lato3*lato3 || lato3*lato3==lato1*lato1+lato2*lato2){
			System.out.println("i tre lati formano un triangolo rettangolo");
		} else{
			System.out.println("i tre lati NON formano un triangolo rettangolo");
		}
	}
	
}