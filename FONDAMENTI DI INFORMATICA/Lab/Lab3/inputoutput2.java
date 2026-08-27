import java.util.Scanner;
public class inputoutput2{
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		String parola1 = tastiera.next();
		String parola2 = tastiera.next();
		String parola3 = tastiera.next();
		System.out.println(parola3 + "\n" + parola2 + "\n" + parola1);
	}
}