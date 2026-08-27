import java.util.Scanner;
public class SquareTester{
    public static void main(String[] args){
        System.out.println("inserire 2 triple di interi(una per riga)");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int dim1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int dim2 = sc.nextInt();
        
        Square s1 = new Square(x1,y1,dim1);
        Square s2 = new Square(x2,y2,dim2);
        
        if(s1.getArea()<s2.getArea()){
            System.out.println(s1.toString());
            System.out.println(s2.toString());
        }
        else{
            System.out.println(s2.toString());
            System.out.println(s1.toString());
        }
        
         System.out.println("inserire 2 coppie di numeri (una coppia per riga)");
         
         int newWidth1 = sc.nextInt();
         int newHeight1 = sc.nextInt();
         int newWidth2 = sc.nextInt();
         int newHeight2 = sc.nextInt();
         
         try{
         s1.setSize(newWidth1, newHeight1);
         s2.setSize(newWidth2, newHeight2);
         }
         catch(IllegalArgumentException e){
         System.out.println("larghezza e lunghezza devono essere uguali!!");
         System.exit(-1);
         }
         
         if(s1.getArea()<s2.getArea()){
            System.out.println(s1.toString());
            System.out.println(s2.toString());
        }
        else{
            System.out.println(s2.toString());
            System.out.println(s1.toString());
        }
         
         
    }
}
