import java.util.Scanner;
public class RettangoloCiclo{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		double b,h,p,s;
		do{
			System.out.print("base = ");
			b = console.nextDouble();
			if(b<0)
				System.out.println("base errata");
		} while (b<0);
		
		do{
			System.out.print("altezza = ");
			h = console.nextDouble();
			if(h<0)
				System.out.println("altezza errata");
		} while(h<0);
		console.close();
		
		p = 2* (b+h);
		s = b*h;
		System.out.println("perimetro = " + p);
	}
}