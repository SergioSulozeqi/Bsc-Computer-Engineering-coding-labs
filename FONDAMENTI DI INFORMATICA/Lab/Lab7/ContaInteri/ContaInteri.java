import java.util.Scanner;
public class ContaInteri{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n;
		int contatore = 0;

		//System.out.println("inserire numeri interi");

		while(sc.hasNext()){
			try{
				n = sc.nextInt();
				contatore++;
			}
			catch(java.util.InputMismatchException ecc){
				sc.next();
			}
		}
		sc.close();
		System.out.println("valori: " + contatore);
	}
}