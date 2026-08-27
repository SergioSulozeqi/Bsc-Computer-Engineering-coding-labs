public class CifreNumero{
	public static void main(String[] args){
		final int NUMERO = 3;
		int cifraTre = NUMERO%10;
		int num = NUMERO/10;
		int cifraDue = num%10;
		num = num/10;
		int cifraUno = num%10;
		System.out.println(cifraUno + " " + cifraDue + " " + cifraTre);
	}
}