import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
public class ContaVocali{
	public static void main(String[] args){

		try(FileReader r = new FileReader("prova.txt"); Scanner sc = new Scanner(r); PrintWriter p = new PrintWriter("risultato.txt")){
			String s = sc.nextLine();
			int vocali = contaVocali(s);

			p.println(vocali);
		}
		catch(IOException e){
			System.out.println("Problema legato ai file");
		}
		
	}

	public static int contaVocali(String s){

		if(s.length()<1){
			return 0;
		}

		if(s.charAt(0)=='a' || s.charAt(0)=='A' || s.charAt(0)=='e' || s.charAt(0)=='E' || s.charAt(0)=='i' || s.charAt(0)=='I' || s.charAt(0)=='o' || s.charAt(0)=='O' || s.charAt(0)=='u' || s.charAt(0)=='U'){
			return 1 + contaVocali(s.substring(1));
		}

		return contaVocali(s.substring(1));
	}
}