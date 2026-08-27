public class SommaRicorsiva{
	public static void main(String[] args){
		if(args.length!=1){
			System.out.println("Bisogna inserire uno e un solo valore!");
			System.exit(1);
		}

		int n=0;

		try{
			n = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println("Devi inserire un intero!");
			System.exit(1);
		}

		if(n<=0){
			System.out.println("Devi inserire un intero positivo!");
			System.exit(1);
		}

		System.out.println(somma(n));

	}

	public static int somma(int num){
		if(num==0){
			return 0;
		}
		return num+somma(num-1);
	}
}