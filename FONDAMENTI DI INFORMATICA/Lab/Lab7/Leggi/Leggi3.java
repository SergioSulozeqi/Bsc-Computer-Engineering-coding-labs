import java.util.Scanner;
import java.io.*;

public class Leggi3{
	public static void main(String[] args){
		try(FileReader r = new FileReader("input.txt"); Scanner sc = new Scanner(r)){
			while(sc.hasNextLine()){
				String s = sc.nextLine();
				Scanner scan = new Scanner(s);
				scan.useDelimiter("[,?\\s]+");
				while(scan.hasNext()){
					System.out.println(scan.next());
				}
			}
		}
		catch(IOException e){
			System.out.println("Il file non esiste");
		}
	}
}