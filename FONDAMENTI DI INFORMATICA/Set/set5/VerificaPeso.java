import java.util.Scanner;
public class VerificaPeso{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double peso,altezza,pesoIdeale;
		System.out.print("inserisci peso in kg: ");
		peso = input.nextDouble();
		System.out.print("inserisci altezza in cm: ");
		altezza = input.nextDouble();
		pesoIdeale=altezza-105;
		if(peso>pesoIdeale){
			System.out.println("sovrappeso");
		}
		if(peso<pesoIdeale){
			System.out.println("sottopeso");
		}
		if(peso==pesoIdeale){
			System.out.println("normopeso");
		}
	}
}