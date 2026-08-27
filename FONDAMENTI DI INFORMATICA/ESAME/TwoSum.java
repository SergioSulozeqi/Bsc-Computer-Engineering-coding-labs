import java.util.Scanner;
public class TwoSum{
	public static void main(String[] args){

		if(args.length==0){
			System.out.println("usage: java TwoSum n1,n2,n3,...");
		}
		
		double[] v = new double[args.length];
		for(int i=0;i<args.length;i++){
			try{
				v[i] = Double.parseDouble(args[i]);
			}
			catch(NumberFormatException e){
				System.out.println("Bisogna inserire SOLO numeri reali");
				System.exit(0);
			}
		}

		for(int i=0;i<v.length;i++){
			for(int j=i;j<v.length;j++){
				if(v[i]+v[j]==0){
					System.out.println("( " + v[i] + ","  + v[j] + " )");
				}
			}
		}
	}
}