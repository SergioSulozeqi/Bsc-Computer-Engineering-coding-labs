import java.util.Scanner;
import java.io.*;
public class CapsCopier{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("inserire il nome del file a cui accedere in lettura");
		String lettura = sc.next();
		System.out.println("inserire il nome del file a cui accedere in scrittura");
		String scrittura = sc.next();

		try(FileReader r = new FileReader(lettura); Scanner scan = new Scanner(r); PrintWriter p = new PrintWriter(scrittura)){
			
			while(scan.hasNextLine()){

				String riga = scan.nextLine();
				Scanner console = new Scanner(riga);
				//console.useDelimiter("['\\s]+");

				while(console.hasNext()){
					String s = console.next();
					String s2 = s.substring(0,1).toUpperCase();
					String s3 = s.substring(1).toLowerCase();
					String s4 = s2+s3;
					p.print(s4 + " ");
				}

				p.print("\n");
			}
			
		}
		catch(IOException e){
			System.out.println("Il file non esiste");
		}
	}
}
