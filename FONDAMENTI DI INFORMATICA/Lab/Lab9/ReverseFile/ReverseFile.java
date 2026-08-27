import java.util.*;
import java.io.*;
public class ReverseFile{
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("Usage: java RverseFile input output");
			System.exit(1);
		}

		String inputFile = args[0];
		String outputFile = args[1];

		try(FileReader r = new FileReader(inputFile);Scanner sc = new Scanner(r); PrintWriter out = new PrintWriter(outputFile)){
			while(sc.hasNextLine()){
				String riga = sc.nextLine();
				String reverse = reverseString(riga);
				out.println(reverse);
			}
		}
		catch(IOException e){
			System.out.println("**Errore che non dipende dal programmatore**");
		}
		catch(NoSuchElementException ecc){
			System.out.println("**Errore riguardante lo scanner**");
		}
	}


	public static String reverseString(String s){

		String reverse = "";

		for(int i=s.length()-1;i>-1;i--){
			reverse += s.charAt(i);
		}

		return reverse;
	}
}