import java.util.Scanner;
public class NumberLister{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("***STAMPA DEI NUMERI DA 1 A N***");
        System.out.print("N?: ");
        int n = in.nextInt();
        if(n<=0){
            System.out.println("Ingresso non ammesso");
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
