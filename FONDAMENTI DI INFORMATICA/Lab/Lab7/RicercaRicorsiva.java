import java.util.*;
public class RicercaRicorsiva{
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("Bisogna inserire SOLO 2 valori!");
			System.exit(1);
		}

		int dim=0;
		int n=0;

		try{
			dim = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[1]);
		}
		catch(NumberFormatException e){
			System.out.println("Devi inserire un intero!");
			System.exit(1);
		}

		if(n<=0 || dim<=0){
			System.out.println("Devi inserire un intero positivo!");
			System.exit(1);
		}

		int[] v = new int[dim];
		for(int i=0; i<dim; i++){
			Random r = new Random();
			v[i] = 1 + r.nextInt(n);
			System.out.print(v[i] + " ");
		}
		System.out.print("\n");

		System.out.println(ricerca(v, 0, v[0]));

	}

	public static int ricerca(int[] v, int pos, int min){

		if(pos==v.length){
			return min;
		}

		if(v[pos]<min){
			min = v[pos];
		}
		
		pos++;

		return ricerca(v, pos, min);
	}
}