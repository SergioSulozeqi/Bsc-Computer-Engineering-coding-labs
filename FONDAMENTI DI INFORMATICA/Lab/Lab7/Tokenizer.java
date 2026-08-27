import java.util.Scanner;
public class Tokenizer{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println();
		String s = console.nextLine();
		Scanner scan = new Scanner(s);
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
	}
}