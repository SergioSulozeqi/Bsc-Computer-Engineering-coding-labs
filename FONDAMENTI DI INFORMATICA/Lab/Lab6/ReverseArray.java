import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] args){

		Scanner console= new Scanner(System.in);
		int[] a = new int[2];
		int i = 0;

		System.out.println("inserire numeri interi");
		while(console.hasNextInt()){
			if(i==a.length){
				a = ArrayUtil.resize(a,a.length*2);
			}
			a[i] = console.nextInt();
			i++;
		}
		console.close();
		for(int j=a.length-1;j>=0;j--){
			System.out.print(a[j] + " ");
		}
	}
}