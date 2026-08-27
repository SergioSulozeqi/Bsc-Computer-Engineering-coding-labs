public class Circonferenza{
	public static void main(String[] args){
		double raggio = 10.12;
		final double PI_GRECO = 3.14159265358979;
		double crf = 2 * raggio * PI_GRECO;
		System.out.println("***La circonferenza di un cerchio di raggio " + raggio + " e' pari a " + crf + "***");
		double area = PI_GRECO * raggio * raggio;
		System.out.println( "***L'area di un cerchio di raggio " + raggio + " e' pari a " + area + "***");
	}
}