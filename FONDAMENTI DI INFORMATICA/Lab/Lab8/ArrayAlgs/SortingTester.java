import java.util.Scanner;
public class SortingTester{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(args[0]);

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];

		//array con valori casuali fra 1 e 100
		for(int i=0;i<n;i++){
			a[i] = (int)(100*Math.random()) + 1;
		}

		System.arraycopy(a,0,b,0,n);
		System.arraycopy(a,0,c,0,n);
		System.arraycopy(a,0,d,0,n);

		long selection0 = System.nanoTime();
		ArrayAlgs.selectionSort(b);
		long selection1 = System.nanoTime();
		long tempoSelection = selection1 - selection0;
		
		long merge0 = System.nanoTime();
		ArrayAlgs.mergeSort(c);
		long merge1 = System.nanoTime();
		long tempoMerge = merge1 - merge0;
		
		long insertion0 = System.nanoTime();
		ArrayAlgs.insertionSort(d);
		long insertion1 = System.nanoTime();
		long tempoInsertion = insertion1 - insertion0;

		if(n<=20){
			System.out.println("array di partenza:");
			for(int i=0; i<n; i++){
				System.out.print(a[i] + " ");
			}
			System.out.print("\n");

			System.out.println("dopo selection sort:");
			for(int i=0; i<n; i++){
				System.out.print(b[i] + " ");
			}
			System.out.print("\n");

			System.out.println("dopo merge sort");
			for(int i=0; i<n; i++){
				System.out.print(c[i] + " ");
			}
			System.out.print("\n");

			System.out.println("dopo insertion sort:");
			for(int i=0; i<n; i++){
				System.out.print(d[i] + " ");
			}
			System.out.print("\n");
		}

		System.out.println("tempo selection sort: " + tempoSelection);
		System.out.println("tempo merge sort: " + tempoMerge);
		System.out.println("tempo insertion sort: " + tempoInsertion);

	}
}