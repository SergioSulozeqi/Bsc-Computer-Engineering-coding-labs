import java.util.Scanner;
public class NumberLister3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("***STAMPA DEI NUMERI DA 1 A N***");
        System.out.print("N?: ");
        int n = in.nextInt();
        final int width = 5;
        if(n<=0){
            System.out.println("Ingresso non ammesso");
        }
        for(int i=1;i<=n;i++){
            if(i%10==1){
            System.out.print("\n");
            }
            String s = Integer.toString(i);
            while(s.length()<=width){
                s = " " + s;
            }
            System.out.print(s);
        }
    }
}
