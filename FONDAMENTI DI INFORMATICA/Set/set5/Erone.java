import java.util.Scanner;
public class Erone{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double l1,l2,l3,area,p;
		System.out.print("Inserisci il primo lato: ");
		l1=input.nextDouble();
		System.out.print("Inserisci il secondolato: ");
		l2=input.nextDouble();
		System.out.print("Inserisci il terzo lato: ");
		l3=input.nextDouble();
		if(l1>=0 && l2>=0 && l3>=0 && l1<=l2+l3 && l2<=l1+l3 && l3<=l1+l2){
			if(l1>=Math.abs(l2-l3) && l2>=Math.abs(l1-l3) && l3>=Math.abs(l1-l2)){
				p=(l1+l2+l3)/2;
				area = Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
				System.out.println("Area del triangolo: " + area);
			}
			else
				System.out.println("I lati inseriti non formano un triangolo");
		}
		else
			System.out.println("I lati inseriti non formano un triangolo");
		
	}
}