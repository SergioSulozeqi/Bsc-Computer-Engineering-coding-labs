import java.util.Scanner;
public class RecFib{
	public static void main(String[] args){
		if(args.length>1){
			System.out.println("Inserisci al massimo 1 valore");
			System.exit(-1);
		}

		Scanner sc = new Scanner(System.in);
		int n=0;
		boolean done = false;

		do{
			try{
				if(args.length==0){
					System.out.print("inserisci un valore: ");
					n = sc.nextInt();
					done = true;
				}
				else{
					n = Integer.parseInt(args[0]);
					done = true;
				}
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Inserisci un valore intero!");
			}
			catch(NumberFormatException ecc){
				System.out.println("Inserisci un valore intero!");
			}

		} while(!done);	

		long t0 = System.nanoTime();
		System.out.println(recursiveFib(n));
		long t1 = System.nanoTime();
		System.out.println("Tempo trascorso in nano secondi: " + (t1-t0));

	}

	public static long recursiveFib(int n){
		if(n<2){
			return n;
		}
		return recursiveFib(n-1)+recursiveFib(n-2);
	}
}