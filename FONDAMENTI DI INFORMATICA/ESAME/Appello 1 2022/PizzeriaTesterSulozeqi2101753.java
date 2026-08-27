//Sulozeqi Sergio 2101753
import java.util.Scanner;
import java.io.*;
public class PizzeriaTesterSulozeqi2101753{

	public static void main(String[] args){
		PizzaMap menu = new PizzaMap();
		try(FileReader r = new FileReader("pizze.txt");Scanner sc= new Scanner(r)){
			while(sc.hasNextLine()){
				String nome = sc.next();
				double prezzo = sc.nextDouble();
				menu.put(nome, prezzo);
			}
		}
		catch(IOException e){
			System.out.println("problema con il file di input");
		}

		System.out.println(menu.toString());
		System.out.println(menu.printMenu());

		double tot=0;
		tot+=(double)menu.get("Margherita");
		tot+=(double)menu.get("Bufala");
		tot+=(double)menu.get("Prosciutto");
		System.out.println(tot);
	}


}