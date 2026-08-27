import java.util.*;
import java.io.*;
public class Dna{
	public static void main(String[] args){

		if(args.length!=2){
			System.out.println("usage: java Dna sospetti.txt casoX.txt");
		}


		try(FileReader r1 = new FileReader(args[1]);Scanner sc1 = new Scanner(r1);FileReader r2 = new FileReader(args[0]); Scanner sc2 = new Scanner(r2)){
			
			String dna = sc1.next();

			sc2.next();
			String str1 = sc2.next();
			String str2 = sc2.next();
			String str3 = sc2.next();

			int rip1 = ricerca(dna,str1);
			int rip2 = ricerca(dna,str2);
			int rip3 = ricerca(dna,str3);

			System.out.println("***RISULTATI DELLA RICERCA DEL DNA DATO***");
			System.out.println(str1 + ":" + rip1);
			System.out.println(str2 + ":" + rip2);
			System.out.println(str3 + ":" + rip3);

			sc2.nextLine();

			//PROBLEMA CON BOB NEL CASO 2

			while(sc2.hasNextLine()){
				
				int count = 0;
				String nome = sc2.next();
				
				if(rip1==Integer.parseInt(sc2.next())){
					count++;
				}
				if(rip2==Integer.parseInt(sc2.next())){
					count++;
				}
				if(rip3==Integer.parseInt(sc2.next())){
					count++;
				}
				sc2.nextLine();
				
				if(count==3){
					System.out.println("colpevole: " + nome);
					System.exit(1);
				}

			}

			System.out.println("Nessun match trovato");

		}
		catch(IOException e){
			System.out.println("errore dovuto al FileReader");
			System.exit(1);
		}
		
	}


	public static int ricerca(String dna, String str){
		int maxCount=0;
		int count=0;
		int k=1;
		for(int i=0;i<dna.length()-3;i+=k){
			int j;
			for(j=0;j<str.length();j++){
				if(dna.charAt(i+j)!=str.charAt(j)){
					if(maxCount<count){
						maxCount=count;
					}
					count=0;
					k=1;
					break;
				}
				if(i+j==dna.length()-1 && dna.charAt(i+j)==str.charAt(j)){
					count++;
					if(maxCount<count){
					maxCount=count;
					}
				}
			}
			if(j==str.length()){
				k=str.length();
				count++;
			}		
		}

		return maxCount;
	}
}