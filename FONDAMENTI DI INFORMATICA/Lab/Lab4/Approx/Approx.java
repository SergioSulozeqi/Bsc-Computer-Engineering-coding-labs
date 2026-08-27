import java.util.Scanner;

public class Approx{
	public static void main(String[] args){
		System.out.println("inserire 2 numeri");
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		if(Numeric.approxEqual(n1,n2)){
			System.out.println("i 2 numeri sono aprossimativamente uguali");
		}
		else
			System.out.println("i 2 numeri non sono aprossimativamente uguali");
	}
}
