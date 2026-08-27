import java.util.Scanner;
public class Risiko{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);
		System.out.print("Giocatore n. 1?");
		String nome1 = console.next();
		System.out.print("Giocatore n. 2?");
		String nome2 = console.next();
		console.close();

		Player p1 = new Player(nome1);
		Player p2 = new Player(nome2);

		p1.turno();
		p2.turno();

		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.println("lanci ordinati");

		int[] ris1 = p1.sortDice();
		for(int i=0; i<ris1.length; i++){
			System.out.print(ris1[i] + " ");
		}
		System.out.println(nome1);

		int[] ris2 = p2.sortDice();
		for(int i=0; i<ris2.length; i++){
			System.out.print(ris2[i] + " ");
		}
		System.out.println(nome2);

		for(int i=0; i<ris1.length; i++){
			if(ris1[i] > ris2[i]){
				p1.addPoint();
			}
			else if(ris1[i] < ris2[i]){
				p2.addPoint();
			}
		}
		System.out.println(p1.getScore());
		System.out.println(p2.getScore());

		if(p1.getScore().compareTo(p2.getScore())>0){
			System.out.println(p1.getName() + " vince " + p1.getScore() + " a " + p2.getScore());
		}
		else if(p1.getScore().compareTo(p2.getScore())<0){
			System.out.println(p2.getName() + " vince " + p2.getScore() + " a " + p1.getScore());
		}
		else{
			System.out.println(p2.getName() + " vince perchè si è difeso");
		}
	}

}