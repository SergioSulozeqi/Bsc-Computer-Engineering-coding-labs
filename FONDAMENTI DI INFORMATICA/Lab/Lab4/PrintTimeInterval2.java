import java.util.Scanner;

public class PrintTimeInterval2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ore;
        int min;
        System.out.print("inserire il primo orario ");
        int o1 = input.nextInt();
        System.out.print("inserire il secondo orario ");
        int o2 = input.nextInt();
        int min1 = o1%100;
        int min2 = o2%100;
        int ore1 = o1/100;
        int ore2 = o2/100;
        if(ore1>ore2){
        	ore=(24-ore1) + ore2;
        }
        else 
       		ore = ore2-ore1;
       	if(min1>min2){
        	min=(60-min1)+min2;
            ore--;
        }
        else
        	min = min2-min1;
       

        System.out.println("il tempo trascorso `e: "+ ore + " ore e " + min + " minuti");
    }
}
