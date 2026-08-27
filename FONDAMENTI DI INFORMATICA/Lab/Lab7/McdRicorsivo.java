public class McdRicorsivo{
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("Bisogna inserire SOLO 2 valori!");
			System.exit(1);
		}

		int n=0;
		int m=0;

		try{
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[1]);
		}
		catch(NumberFormatException e){
			System.out.println("Devi inserire un intero!");
			System.exit(1);
		}

		if(n<=0 || m<=0){
			System.out.println("Devi inserire un intero positivo!");
			System.exit(1);
		}

		System.out.println(recursiveMCD(m,n));

	}

	public static int recursiveMCD(int m, int n){

		if(m<n){
			int a = n;
			n = m;
			m = a;
		}

		if(m%n == 0){
			return n;
		}

		return recursiveMCD(n,m%n);
	}
}