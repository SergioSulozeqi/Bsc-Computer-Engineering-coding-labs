import java.util.Scanner;
public class IterFib{
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
		System.out.println(iterativeFib(n));
		long t1 = System.nanoTime();
		System.out.println("Tempo trascorso in nano secondi: " + (t1-t0));

	}

	public static long iterativeFib(int n){
		if (n < 2){
			return n;
		}
   		int fib0 = 0;
   		int fib1 = 1;
   		for (int i = 2; i <= n; i++){
   			int newFib = fib0 + fib1;
   			fib0 = fib1;
   			fib1 = newFib;
   		}
   		return fib1;
	}
}