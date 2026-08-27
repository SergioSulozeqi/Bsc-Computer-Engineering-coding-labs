public class BilanciaParentesi{
	public static void main(String[] args){
		String s = "(()))((";
		if(parentesi(s)==0){
			System.out.println("Le parentesi sono bilanciate");
		}
		else{
			System.out.println("Le parentesi NON sono bilanciate");
		}
	}

	public static int parentesi(String s){

		if(s==null){
			throw new IllegalArgumentException();
		}

		if(s.length()<1){
			return 0;
		}

		if(s.charAt(0)=='('){
			return 1 + parentesi(s.substring(1));
		}
		else if(s.charAt(0)==')'){
			return -1 + parentesi(s.substring(1));
		}
		else{
			throw new IllegalArgumentException();
		}
	}
}