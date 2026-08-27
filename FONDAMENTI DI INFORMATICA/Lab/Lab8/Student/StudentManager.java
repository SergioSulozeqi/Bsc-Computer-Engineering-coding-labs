import java.util.Scanner;
public class StudentManager{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        Student[] arr = new Student[1];
        
        while(sc.hasNextLine()){
            String stringa = sc.nextLine();
            if(stringa.equals("")){
            break;
            }
            Scanner scan = new Scanner(stringa);
            if(count==arr.length){
                arr = resize(arr,arr.length*2);
            }
            String nome = scan.next();
            String cognome = scan.next();
            int scritto=0;
            int orale=0;
            
            try{
                scritto = scan.nextInt();
                orale = scan.nextInt();
                arr[count] = new Student(nome,cognome,scritto,orale);
                count++;
            }
            catch(java.util.InputMismatchException e){                
                System.out.println("valori non validi, reinserire tutti i dati dello studente");
                scan.nextLine();
            }
        }
        
        
        while(true){
            System.out.println("inserire il comando che si vuole eseguire(Q o S)");
            String s = sc.next();
            
            if(s.equals("Q")){
                System.exit(-1);
            }
            
            if(s.equals("S")){
                System.out.print("Inserire cognome:");
                String surname = sc.next();
                boolean found = false;
                for(int i=0; i<count; i++){
                    if(surname.equals(arr[i].getCognome())){
                        found=true;
                        System.out.println("media: " + arr[i].media());
                    }
                }
                if(!found){
                    System.out.println("Alunno inesistente");
                }
            }
            
            else{
                System.out.println("comando non corretto");
            }
        }
    }
    
    public static Student[] resize(Student[] a, int length){
        Student[] arr = new Student[length];
        System.arraycopy(a,0,arr,0,a.length);
        return arr;
    }
}
