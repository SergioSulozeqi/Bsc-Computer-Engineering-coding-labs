import java.util.Scanner;
public class Sottostringa{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("inserire la prima stringa: ");
		String s1 = console.nextLine();
		System.out.print("inserire la seconda stringa: ");
		String s2 = console.nextLine();
		int uno = s1.length();
		int due = s2.length();
		boolean done = false;
		for(int i=0; i<=uno-due; i++){
			String s3 = s1.substring(i,i+due);
			if(s3.equals(s2)){
				done=true;
				break;
			}
		}
		//funziona anche se s2 è una stringa vuota
		if(done){
			System.out.println("s2 è una sottostringa di s1");
		}
		else{
			System.out.println("s2 NON è una sottostringa di s1");
		}
	}
}