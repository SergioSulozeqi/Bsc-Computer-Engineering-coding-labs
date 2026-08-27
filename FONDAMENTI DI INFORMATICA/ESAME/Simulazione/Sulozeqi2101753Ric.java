//Sergio Sulozeqi 2101753
import java.util.Scanner;
public class Sulozeqi2101753Ric{
	public static void main(String[] args){
		System.out.println("Inserire stringa");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(somma(s));
	}

	public static int somma(String s){

		if(s==null){
			return 0;
		}

		if(s.length()<1){
			return 0;
		}

		String s1 = s.substring(0,1);
		try{
			int n = Integer.parseInt(s1);
			return n + somma(s.substring(1));

		}
		catch(NumberFormatException e){
			return somma(s.substring(1));
		}
	}
}