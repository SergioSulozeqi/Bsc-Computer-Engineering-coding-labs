import java.util.Scanner;
public class ConvertiDaLireAdEuro{
	public static void main(String args[]){
		double implire, impeuro;
		Scanner t=new Scanner(System.in);
		System.out.print("importo in lire=");
		implire=t.nextDouble();
		impeuro=implire/1936.27;
		System.out.println("Importo in euro=" + impeuro);
	}
}