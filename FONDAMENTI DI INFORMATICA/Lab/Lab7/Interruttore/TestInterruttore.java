import java.util.Scanner;
public class TestInterruttore{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Interruttore a = new Interruttore();
		Interruttore b = new Interruttore();
		String s = "";
		int n;

		do{

			System.out.println("stato interruttore 1: " + a.printStatus());

			System.out.println("stato interruttore 2: " + b.printStatus());

			if(a.isBulbOn()){
				s = "accesa";
			}
			else{
				s = "spenta";
			}

			System.out.println("stato lampadina: " + s);

			do{
			System.out.println("Inserire 1 o 2 per premere un interruttore oppure 0 per uscire");
			n = sc.nextInt();
			} while(n<0 || n>2);

			if(n==1){
				a.changeStatus();
			}

			else if(n==2){
				b.changeStatus();
			}

		} while(n != 0);

		
		sc.close():
	}
}