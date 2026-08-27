import java.util.Scanner;
public class SortThreeString{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String s1,s2,s3;
		System.out.print("inserisci la prima stringa ");
		s1 = console.next();
		System.out.print("inserisci la seconda stringa ");
		s2 = console.next();
		System.out.print("inserisci la terza stringa ");
		s3 = console.next();
		if(s1.compareTo(s2)<=0 && s2.compareTo(s3)<=0){
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		}
		else if(s1.compareTo(s3)<=0 && s3.compareTo(s2)<=0){
			System.out.println(s1);
			System.out.println(s3);
			System.out.println(s2);
		}
		else if(s2.compareTo(s1)<=0 && s1.compareTo(s3)<=0){
			System.out.println(s2);
			System.out.println(s1);
			System.out.println(s3);
		}
		else if(s2.compareTo(s3)<=0 && s3.compareTo(s1)<=0){
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s1);
		}
		else if(s3.compareTo(s1)<=0 && s1.compareTo(s2)<=0){
			System.out.println(s3);
			System.out.println(s1);
			System.out.println(s2);
		}
		else if(s3.compareTo(s2)<=0 && s2.compareTo(s1)<=0){
			System.out.println(s1);
			System.out.println(s3);
			System.out.println(s2);
		}
	}
}