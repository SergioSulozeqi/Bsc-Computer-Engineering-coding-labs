import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("inserire una riga di testo");
		String s = console.nextLine();
		String reverse = "";
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println(s + " invertita: " + reverse);
	}
}