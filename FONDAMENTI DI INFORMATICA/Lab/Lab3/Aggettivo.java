import java.util.Scanner;

public class Aggettivo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String aggettivo = input.next();
		String s1 = aggettivo.substring(0,1);
		String s2 = aggettivo.substring(1);
		String s3 = s1.toUpperCase();
		String s4 = s3+s2;
		System.out.println(s4);
		String s5 = s4.substring(0,s4.length()-1) + "in" + s4.substring(s4.length()-1);
		String s6 = s4.substring(0,s4.length()-1) + "issim" + s4.substring(s4.length()-1);
		System.out.println(s5);
		System.out.println(s6);
	}
}