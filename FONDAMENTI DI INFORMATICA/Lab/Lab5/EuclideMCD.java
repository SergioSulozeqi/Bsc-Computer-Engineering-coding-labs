import java.util.Scanner;
public class EuclideMCD{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int m,n,a, mNew,nNew;
		do{
			System.out.println("inserire primo numero (intero positivo)");
			m = console.nextInt();
		}while(m<1);
		do{
			System.out.println("inserire secondo numero (intero positivo");
			n = console.nextInt();
		}while(n<1);

		//rendo m>n 
		if(m<n){
			a=m;
			m=n;
			n=a;
		}

		while(m%n!=0){
			mNew=n;
			nNew= m%n;

			m=mNew;
			n=nNew;
		}

		System.out.println("MCD: " + n);
	}
}