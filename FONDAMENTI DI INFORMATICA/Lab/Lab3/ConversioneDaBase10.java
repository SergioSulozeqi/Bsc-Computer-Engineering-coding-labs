import java.util.Scanner;
public class ConversioneDaBase10{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		System.out.print("inserire la base di conversione: ");
		int b = tastiera.nextInt();
		System.out.print("inserire il numero da convertire (deve essere compreso fra[0," + (b*b*b) + "): ");
		int n = tastiera.nextInt();
		int r2=n%b;
		n=n/b;
		int r1=n%b;
		n=n/b;
		int r0=n%b;
		System.out.print(r0);
		System.out.print(r1);
		System.out.println(r2);
	}
}