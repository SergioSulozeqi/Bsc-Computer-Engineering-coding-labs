import java.util.Scanner;

public class Oroscopo{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("inserire il giorno di nascita: ");
		int giorno = in.nextInt();
		System.out.print("inserire il mese di nascita: ");
		int mese = in.nextInt();
		if(mese<=0 || giorno<=0 || mese>12 || giorno>31){
			System.out.println("formato non valido");
		}
		else if((mese==2 && giorno>29) || (mese==4 && giorno>30) || (mese==6 && giorno>30) || (mese==9 && giorno>30) || (mese==11 && giorno>30)){
			System.out.println("formato non valido");
		}
		else{
			if((mese==3 && giorno>20) || (mese==4 && giorno<21)){
				System.out.println("ARIETE");
				System.out.println("Amore: 1/5");
				System.out.println("Amicizia: 3/5");
				System.out.println("Lavoro: 5/5");
			}
			else if((mese==4 && giorno>20) || (mese==5 && giorno<22)){
				System.out.println("TORO");
				System.out.println("Amore: 2/5");
				System.out.println("Amicizia: 4/5");
				System.out.println("Lavoro: 2/5");
			}
			else if((mese==5 && giorno>21) || (mese==6 && giorno<21)){
				System.out.println("GEMELLI");
				System.out.println("Amore: 4/5");
				System.out.println("Amicizia: 1/5");
				System.out.println("Lavoro: 3/5");
			}
			else if((mese==6 && giorno>20) || (mese==7 && giorno<23)){
				System.out.println("CANCRO");
				System.out.println("Amore: 5/5");
				System.out.println("Amicizia: 3/5");
				System.out.println("Lavoro: 3/5");
			}
			else if((mese==7 && giorno>22) || (mese==8 && giorno<23)){
				System.out.println("LEONE");
				System.out.println("Amore: 3/5");
				System.out.println("Amicizia: 4/5");
				System.out.println("Lavoro: 0/5");
			}
			else if((mese==8 && giorno>22) || (mese==9 && giorno<23)){
				System.out.println("VERGINE");
				System.out.println("Amore: 1/5");
				System.out.println("Amicizia: 2/5");
				System.out.println("Lavoro: 5/5");
			}
			else if((mese==9 && giorno>22) || (mese==10 && giorno<23)){
				System.out.println("BILANCIA");
				System.out.println("Amore: 3/5");
				System.out.println("Amicizia: 3/5");
				System.out.println("Lavoro: 4/5");
			}
			else if((mese==10 && giorno>22) || (mese==11 && giorno<23)){
				System.out.println("SCORPIONE");
				System.out.println("Amore: 4/5");
				System.out.println("Amicizia: 0/5");
				System.out.println("Lavoro: 2/5");
			}
			else if((mese==11 && giorno>22) || (mese==12 && giorno<22)){
				System.out.println("SAGITTARIO");
				System.out.println("Amore: 1/5");
				System.out.println("Amicizia: 5/5");
				System.out.println("Lavoro: 4/5");
			}
			else if((mese==12 && giorno>21) || (mese==1 && giorno<21)){
				System.out.println("CAPRICORNO");
				System.out.println("Amore: 3/5");
				System.out.println("Amicizia: 5/5");
				System.out.println("Lavoro: 2/5");
			}
			else if((mese==1 && giorno>20) || (mese==2 && giorno<19)){
				System.out.println("ACQUARIO");
				System.out.println("Amore: 5/5");
				System.out.println("Amicizia: 3/5");
				System.out.println("Lavoro: 0/5");
			}
			else if((mese==2 && giorno>18) || (mese==3 && giorno<21)){
				System.out.println("TORO");
				System.out.println("Amore: 2/5");
				System.out.println("Amicizia: 4/5");
				System.out.println("Lavoro: 2/5");
			}
		}
	}
}