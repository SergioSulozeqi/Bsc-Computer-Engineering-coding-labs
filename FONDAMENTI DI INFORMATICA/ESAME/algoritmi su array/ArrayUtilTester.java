import java.util.Scanner;
public class ArrayUtilTester{
	public static void main(String[] args){
		System.out.println("inserire la dimensione dell'array");
		Scanner console = new Scanner(System.in);
		int vSize = console.nextInt();
		System.out.println("inserire il valore massimo che le celle possono contenere");
		int n = console.nextInt();
		int[] v = ArrayUtil.randomIntArray(vSize, n);
		System.out.println(ArrayUtil.printArray(v,vSize));
		System.out.println("valore da inserire:");
		int value = console.nextInt();
		System.out.println("posizione in cui inserirlo:");
		int index1 =  console.nextInt();
		v = ArrayUtil.insert(v,v.length,index1,value);
		System.out.println(ArrayUtil.printArray(v, v.length));
		System.out.println("inserire l'indice della cella da eliminare (ignorando l'ordine)");
		int index2 = console.nextInt();
		v = ArrayUtil.remove(v,v.length,index2);
		System.out.println(ArrayUtil.printArray(v, v.length));
		System.out.println("inserire l'indice della cella da eliminare (considerando l'ordine)");
		int index3 = console.nextInt();
		v = ArrayUtil.removeSorted(v,v.length,index3);
		System.out.println(ArrayUtil.printArray(v, v.length));
		System.out.println("inserire il target");
		int target = console.nextInt();
		int indice = ArrayUtil.find(v,v.length,target);
		System.out.println("il numero " + target + " si trova nella cella " + indice);
		int min = ArrayUtil.findMin(v,v.length);
		int max = ArrayUtil.findMax(v,v.length);
		System.out.println("il valore minimo è " + min);
		System.out.println("il valore massimo è " + max);
	}
}