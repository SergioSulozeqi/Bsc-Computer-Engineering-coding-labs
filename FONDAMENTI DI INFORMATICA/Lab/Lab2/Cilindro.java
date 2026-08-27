public class Cilindro{
	public static void main(String[] args){
		double raggio = 10.12;
		double altezza = 10.87;
		final double PI_GRECO = Math.PI;
		double areaBase = raggio * raggio * PI_GRECO;
		double volume = areaBase * altezza;
		System.out.println("***Il volume del cilindro di raggio " + raggio + " e altezza " + altezza + " e' pari a " + volume + "***");
	}
}