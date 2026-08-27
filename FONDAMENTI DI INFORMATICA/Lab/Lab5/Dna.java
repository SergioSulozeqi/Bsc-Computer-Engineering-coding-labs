import java.util.Scanner;
public class Dna{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.println("inserire una stringa di DNA: ");
		String s = console.nextLine();
		console.close();
		String reverse="";
		boolean error = false;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch=='A' || ch=='T' || ch=='C' || ch=='G'){
				reverse = ch+reverse;

			}
			else{					
				error=true;
			}
		}
		if(error){
				System.out.println("stringa non valida");
			}
		else{
			System.out.println("stringa invertita: " + reverse);

			String reverse2 = "";

			for(int i=0; i<reverse.length(); i++){
				char ch = reverse.charAt(i);
				if(ch=='A'){
					ch = 'T';
				}
				else if(ch=='T'){
					ch = 'A';
				}
				else if(ch=='C'){
					ch = 'G';
				}
				else if(ch=='G'){
					ch = 'C';
				}
				reverse2 = reverse2 + ch;

			}
			System.out.println("stringa complementare: " + reverse2);
		}
	}
}