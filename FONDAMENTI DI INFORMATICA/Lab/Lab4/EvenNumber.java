import java.util.Scanner;

public class EvenNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un numero pari ");
        int n1 = input.nextInt();
        if(n1%2==0){
            System.out.println("bravo");
        }
        else{
            System.out.println("ritenta");
            n1=input.nextInt();
            if(n1%2==0){
                System.out.println("bravo");
            }
            else{
                System.out.println("Sei scarso");
            }
        }
        
    }
}

