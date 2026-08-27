//Sulozeqi Sergio 2101753
import java.util.Scanner;
public class Sulozeqi2101753Ric{
	public static void main(String[] args){
		System.out.println("Inserire una stringa");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(vocali(s));
		System.out.println(reverse(s));
	}

	public static String vocali(String s){

		if(s.equals("")){
			return "";
		}

		String s1 = s.substring(0,1);
		if(s1.equals("A") || s1.equals("a") || s1.equals("E") || s1.equals("e") || s1.equals("I") || s1.equals("i") || s1.equals("O") || s1.equals("o") || s1.equals("U") || s1.equals("u")){
			return s1 + vocali(s.substring(1));
		}
		return vocali(s.substring(1));
	}

	public static String reverse(String s){

		if(s.equals("")){
			return "";
		}

		String s1 = s.substring(0,1);
		if(s1.equals("A") || s1.equals("a") || s1.equals("E") || s1.equals("e") || s1.equals("I") || s1.equals("i") || s1.equals("O") || s1.equals("o") || s1.equals("U") || s1.equals("u")){
			return reverse(s.substring(1)) + s1;
		}
		return reverse(s.substring(1));
	}


}