import java.util.Scanner;
public class IsMagicSquare{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int numeri;
		double radice;
		int radiceIntera;
		int[] v = new int[1];
		int n = 0;
		System.out.println("inserire valori");
		while(console.hasNextInt()){
			if(n==v.length){
				v = ArrayUtil.resize(v,v.length*2);
			}
			v[n] = console.nextInt();
			n++;
		}
		v = ArrayUtil.resize(v,n);

		radice = Math.sqrt(n);
		radiceIntera = (int)radice;
		if(radiceIntera*radiceIntera == n){

			for(int i = 1; i <= n; i++){
				int result = ArrayUtil.find(v,n,i);
				if(result==-1){
					System.out.println("i numeri inseriti non compongono un quadrato magico");
					System.exit(-1);
				}
			}

			int[][] mat = new int[radiceIntera][radiceIntera];
			int k=0;
			for(int i=0;i<radiceIntera;i++){
				for(int j=0; j<radiceIntera; j++){
					mat[i][j] = v[k];
					k++;
				}
			}
			n=radiceIntera;

			int somma = 0;
			for(int i=0;i<n;i++){
				somma += mat[0][i];
			}

			int sommaDiagonale2 = 0;
			for(int i=0;i<n;i++){
				sommaDiagonale2 += mat[i][n-1-i];
				int sommaRiga=0;
				int sommaColonna=0;
				int sommaDiagonale1=0;
				for(int j=0;j<n;j++){
					sommaRiga += mat[i][j];
					sommaColonna += mat[j][i];
					sommaDiagonale1 += mat[j][j];

				}
				if(sommaRiga!=somma || sommaColonna!=somma || sommaDiagonale1!=somma){
					System.out.println("i numeri inseriti non compongono un quadrato magico");
					System.exit(-1);
				}
			}
			if(sommaDiagonale2!=somma){
				System.out.println("i numeri inseriti non compongono un quadrato magico");
				System.exit(-1);
			}
			else{
				System.out.println("***i numeri inseriti compongono un quadrato magico***");
			}
		}

		else{
			System.out.println("i numeri inseriti non compongono un quadrato magico");
		}
	}
}