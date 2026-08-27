import java.util.Scanner;
public class StandardDeviation{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		double b = 0;
		double a = 0;
		int n = 0;
		double d;
		System.out.println("inserire numeri");
		while(console.hasNextDouble()){
			double num = console.nextDouble();
			b+=num;
			a+=(num*num);
			n++;
		}
		console.close();

		if(n==0){
			System.out.println("bisogna inserire almeno un valore!");
		}
		else if(n==1){
			System.out.println("Deviazione standard = 0");
		}
		else{
			d = Math.sqrt((a-((b*b)/n))/(n-1));
			System.out.println("Deviazione Standard = " + d);
		}
	}
}