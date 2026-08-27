import java.util.Scanner;
public class EncodeCeasar{
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
	        if(c>64 && c<=(90-n)){
	            c+=n;
	        }
	        else if(c>(90-n) && c<91){
	            int m=90-c;
	            m = n-m;
	            c=64+m;
	        }
	        s = s.substring(0,i) + (char)c + s.substring(i+1);
	    }
	    
	    System.out.println(s);
	}
}
