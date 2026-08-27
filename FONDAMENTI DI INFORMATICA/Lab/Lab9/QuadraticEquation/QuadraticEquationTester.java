import java.util.Scanner;
public class QuadraticEquationTester{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire di seguito i coeeficienti a,b,c di un'equazione ax^2 + bx + c");
		
		System.out.print("a: ");
		double a = sc.nextDouble();
		
		System.out.print("b: ");
		double b = sc.nextDouble();
		
		System.out.print("c: ");
		double c = sc.nextDouble();

		QuadraticEquation e = new QuadraticEquation(a,b,c);

		if(e.hasSolutions()){
			if(e.hasInfiniteSolutions()){
				System.out.println("L'equazione ha infinite soluzioni");
			}
			else if(e.hasUniqueSolution()){
				System.out.println("Unica soluzione: " + e.getUniqueSolution());
			}
			else{
				System.out.println("2 soluzioni: (potrebbero essere coincidenti)");
				System.out.println(e.getSolution1());
				System.out.println(e.getSolution2());
			}

		}
		else{
			System.out.println("L'equazione non ha soluzioni");
		}
	}

}