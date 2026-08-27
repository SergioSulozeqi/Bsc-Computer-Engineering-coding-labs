import java.util.Scanner;
public class DivisioneIntera{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int dividendo,divisore,quoziente,resto;
		System.out.println("Divisione intera con resto");
		System.out.print("Inserisci dividendo: ");
		dividendo=console.nextInt();
		System.out.print("Inserisci divisore: ");
		divisore=console.nextInt();
		quoziente = dividendo/divisore;
		resto = dividendo%divisore;
		System.out.println("Quoziente = " + quoziente);
		System.out.println("Resto = " + resto);
	}
}