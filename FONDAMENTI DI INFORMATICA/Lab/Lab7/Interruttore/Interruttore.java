public class Interruttore{

	//false: interruttore down, true: interruttore up.
	boolean statoInterruttore;

	//flase: lampadina spenta, true: lampadina accesa.
	static boolean statoLampadina = false;

	public Interruttore(){
		statoInterruttore = false;
	}

	public boolean getStatusInterruttore(){
		return statoInterruttore;
	}

	public boolean isBulbOn(){
		return statoLampadina;
	}

	public void changeStatus(){
		statoInterruttore = !(statoInterruttore);
		statoLampadina = !(statoLampadina);
	}

	public String printStatus(){
		if(statoInterruttore){
			return "up";
		}
		return "down";
	}
	
}