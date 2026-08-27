import java.util.Scanner;
public class DivisioneReale{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		
		double dividendo,divisore,quoziente;
		
		System.out.println("Divisione reale");
		System.out.print("Inserisci dividendo: ");
		dividendo=console.nextInt();
		
		System.out.print("Inserisci divisore: ");
		divisore=console.nextInt();
		
		quoziente = dividendo/divisore;
		
		System.out.println("Quoziente = " + quoziente);
		System.out.println("Fine elaborazione");
	}
}