import java.util.Scanner;

public class PrintTimeInterval{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("inserire il primo orario ");
        int o1 = input.nextInt();
        System.out.print("inserire il secondo orario (successivo al primo) ");
        int o2 = input.nextInt();
        int min1 = o1%100;
        int min2 = o2%100;
        o1 = o1/100;
        o2 = o2/100;
        int ore1 = o1%100;
        int ore2 = o2%100;
        int ore = Math.abs(ore2-ore1);
        if(min2==0 && min1!=0){
            min2=60;
            ore--;
        }
        int min = Math.abs(min2-min1);
        if(min1>min2){
            ore--;
        }
        
        System.out.println("il tempo trascorso `e: "+ ore + " ore e " + min + " minuti");
    }
}
