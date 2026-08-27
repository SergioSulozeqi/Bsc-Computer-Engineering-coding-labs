import java.util.Scanner;
import java.util.Scanner;
public class Sottostringa2{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("inserire la prima stringa: ");
		String s1 = console.nextLine();
		System.out.print("inserire la seconda stringa: ");
		String s2 = console.nextLine();
		int uno = s1.length();
		int due = s2.length();
		boolean done = false;
		for(int i=0;i<=uno-due; i++){
			for(int j=0; j<due; j++){
				char c1 = s1.charAt(i+j);
				char c2 = s2.charAt(j);
				if(c1==c2){
					done = true;
				}
				else{
					done = false;
					break;
				}
			}
			if(done){
				break;
			}
		}
		if(done){
			System.out.println("s2 è una sottostringa di s1");
		}
		else{
			System.out.println("s2 NON è una sottostringa di s1");
		}
	}
}