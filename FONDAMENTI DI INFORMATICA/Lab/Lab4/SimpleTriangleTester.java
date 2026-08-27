import java.util.Scanner;
public class SimpleTriangleTester{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int l1,l2,l3,a=0,b=0,c=0;
		System.out.print("inserisci il primo lato ");
		l1 = console.nextInt();
		System.out.print("inserisci il secondo lato ");
		l2 = console.nextInt();
		System.out.print("inserisci il terzo lato ");
		l3 = console.nextInt();
		if(l1<=l2 && l2<=l3){
			a=l1;
			b=l2;
			c=l3;
		}
		else if(l1<=l3 && l3<=l2){
			a=l1;
			b=l3;
			c=l2;
		}
		else if(l2<=l1 && l1<=l3){
			a=l2;
			b=l1;
			c=l3;
		}
		else if(l2<=l3 && l3<=l1){
			a=l2;
			b=l3;
			c=l1;
		}
		else if(l3<=l2 && l2<=l1){
			a=l3;
			b=l2;
			c=l1;
		}
		else if(l3<=l1 && l1<=l2){
			a=l3;
			b=l1;
			c=l2;
		}

		if(c>a+b){
			System.out.println("non è un triangolo");
		}
		else if(c==a && c==b){
			System.out.println("triangolo equilatero");
		}
		else{
			if(c==a || c==b || a==b){
				System.out.print("triangolo isocele ");
			}
			else{
				System.out.print("triangolo scaleno ");
			}
			if(c*c-a*a-b*b>0){
				System.out.println("ottusangolo");
			}
			else if(c*c-a*a-b*b<0){
				System.out.println("acutangolo");
			}
			else{
				System.out.println("rettangolo");
			}
		}

	}
}