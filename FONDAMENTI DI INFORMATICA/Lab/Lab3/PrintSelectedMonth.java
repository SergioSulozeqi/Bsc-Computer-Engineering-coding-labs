import java.util.Scanner;
public class PrintSelectedMonth{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int mese = console.nextInt();
		String mesi = "1 gennaio2 febbraio3 marzo4 aprile5 maggio6 giugno7 luglio8 agosto9 settembre10ottobre11novembre12dicembre13";
		int start = mesi.indexOf(Integer.toString(mese));
		mese+=1;
		int finish = mesi.indexOf(Integer.toString(mese));
		System.out.println(mesi.substring(start+2,finish));
	}
}