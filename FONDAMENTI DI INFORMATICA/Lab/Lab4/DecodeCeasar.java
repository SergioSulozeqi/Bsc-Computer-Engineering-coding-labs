import java.util.Scanner;
public class DecodeCeasar{
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int c;
	    System.out.print("inserire stringa: ");
	    String s = in.nextLine();
	    System.out.print("inserire l`indice di scorrimento: ");
	    int n = in.nextInt();
	    s = s.toUpperCase();
	    for(int i=0;i<s.length();i++){
	        c = (int)s.charAt(i);
	        if(c>64+n && c<=90){
	            c-=n;
	        }
	        else if(c>64 && c<=(64+n)){
	            int m=c-65;
	            m = n-m;
	            c=91-m;
	        }
	        s = s.substring(0,i) + (char)c + s.substring(i+1);
	    }
	    
	    System.out.println(s);
	}
}
