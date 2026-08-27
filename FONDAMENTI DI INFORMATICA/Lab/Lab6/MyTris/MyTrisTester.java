import java.util.Scanner;
public class MyTrisTester{
    public static void main(String[] args){
    	Scanner console = new Scanner(System.in);
        boolean nuovaPartita = false;
        do{
	        MyTris partita = new MyTris();
	        System.out.println("***NUOVA PARTITA DI TRIS***");
	        System.out.println(partita.toString());
	        int i = 0;
	        while(i<9){
	            int giocatore;
	            char c;
	            if(i%2==0){
	                c='X';
	                giocatore=1;
	            }
	            else{
	               c='O';
	               giocatore=2;
	            }
	            System.out.println("*TURNO DEL GIOCATORE " + giocatore + "*");
	            
	            int riga;
	            int colonna;
	            //do{
	                System.out.println("inserire la posizione (riga e colonna)");
	                riga = console.nextInt();
	                colonna = console.nextInt();
	                partita.setCharInPosition(riga,colonna,c);
					//while(!(partita.setCharInPosition(riga,colonna,c)));
-

	            i = partita.getCount();
	            
	            
	            System.out.println(partita.toString());



	            if(partita.isWinning(c)){
	                System.out.println("!!! HA VINTO IL GIOCATORE " + giocatore + " !!!");
	                System.out.println("nuova partita? S/N");
	                String s = console.next();
	                if(s.equals("S")){
	                    nuovaPartita = true;
	                }
	                else{
	                	nuovaPartita = false;
	                }
	                break;
	            }

	            else if(i==9){
	            	System.out.println("!!! PAREGGIO !!!");
	                System.out.println("nuova partita? S/N");
	                String s = console.next();
	                if(s.equals("S")){
	                    nuovaPartita = true;
	                }
	                else{
	                	nuovaPartita = false;
	                }
	                break;
	            }
	            
	        }

	    }while(nuovaPartita);
	    console.close();
	}
}
