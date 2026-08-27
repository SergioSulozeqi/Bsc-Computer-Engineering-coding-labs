import java.util.Scanner;
public class Reverse2{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String s;
		String reverse1 = "";
		String reverse2 = "";
		while(console.hasNextLine()){
			s = console.nextLine();
			for(int i=0; i<s.length(); i++){
				char ch = s.charAt(i);
				reverse1 = ch+reverse1;
			}
			reverse2 = reverse2 + " " + reverse1;
			reverse1 = "";
		}
		console.close();
		System.out.println(reverse2);
	}
}