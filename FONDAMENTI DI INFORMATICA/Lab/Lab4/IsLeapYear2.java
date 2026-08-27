import java.util.Scanner;
public class IsLeapYear2{
	public static void main(String[] args){
		Scanner console=new Scanner(System.in);
		System.out.print("inserire anno: ");
		int anno = console.nextInt();
		if(anno<0){
			System.out.print("inserire un numero positivo");
		}
		else{
			if(anno<1582){
				if(anno%4==0){
					System.out.print("l'anno è bisestile");
				}
				else{
					System.out.print("l'anno non è bisestile");
				}
			}
			else{
				if(anno%4==0 && anno%100!=0 || anno%400==0){
					System.out.print("l'anno è bisestile");
				}
				else{
					System.out.print("l'anno non è bisestile");
				}
			}
		}
	}
}