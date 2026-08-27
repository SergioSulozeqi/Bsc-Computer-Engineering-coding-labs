public class Palindromia{
	public static void main(String[] args){
		if(args.length!=1){
			System.out.println("inserire uno e un solo argomento!");
			System.exit(-1);
		}

		boolean verificato = verifica(args[0]);
		System.out.println(verificato);
	}

	public static boolean verifica(String s){

		boolean done = true;
		
		if(s.length() < 2){
			return true;
		}

		if(s.charAt(0) != s.charAt(s.length()-1)){
			return false;
		}

		return verifica(s.substring(1,s.length()-1));
	}
	
}