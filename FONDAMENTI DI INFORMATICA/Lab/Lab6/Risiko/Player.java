import java.util.Random;
public class Player{
	String nome;
	int tiro1, tiro2, tiro3, punteggio;

	public Player(String aName){
		nome = aName;
		punteggio = 0;
		tiro1 = 0;
		tiro2 = 0;
		tiro3 = 0;
	}

	public String getName(){
		return nome;
	}

	public String getScore(){
		String s = Integer.toString(punteggio);
		return s;
	}

	public void turno(){
		Random r = new Random();
		tiro1 = r.nextInt(7);
		tiro2 = r.nextInt(7);
		tiro3 = r.nextInt(7);
	}

	public int[] sortDice(){
		int[] risultati = new int[3];
		if(tiro1<=tiro2 && tiro2<=tiro3){
			risultati[0] = tiro1;
			risultati[1] = tiro2;
			risultati[2] = tiro3;
		}
		else if(tiro1<=tiro3 && tiro3<=tiro2){
			risultati[0] = tiro1;
			risultati[1] = tiro3;
			risultati[2] = tiro2;
		}
		else if(tiro2<=tiro1 && tiro1<=tiro3){
			risultati[0] = tiro2;
			risultati[1] = tiro1;
			risultati[2] = tiro3;
		}
		else if(tiro2<=tiro3 && tiro3<=tiro1){
			risultati[0] = tiro2;
			risultati[1] = tiro3;
			risultati[2] = tiro1;
		}
		else if(tiro3<=tiro1 && tiro1<=tiro2){
			risultati[0] = tiro3;
			risultati[1] = tiro1;
			risultati[2] = tiro2;
		}
		else if(tiro3<=tiro2 && tiro2<=tiro1){
			risultati[0] = tiro3;
			risultati[1] = tiro2;
			risultati[2] = tiro1;
		}

		return risultati;
	}

	public void addPoint(){
		punteggio++;
	}

	public void resetScore(){
		punteggio=0;
	}

	public String toString(){
		String s = "lanci di " + nome + ": " + tiro1 + " " + tiro2 + " " + tiro3;

		return s;
	}

}