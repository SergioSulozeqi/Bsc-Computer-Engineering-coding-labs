public class MyFirstArray{
	public static void main(String[] args){
		int[] array = new int[10];
		for(int i=0;i<array.length;i++){
			array[i]=i;
		}

		//parte a
		System.out.println("lunghezza array: " + array.length);


		System.out.print("array: { ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("}");

		System.out.print("array inverso: { ");
		for(int i=array.length-1;i>=0;i--){
			System.out.print(array[i] + " ");
		}
		System.out.println("}");

		//parte b
		incrementAll(array);

		System.out.print("array incrementato: { ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("}");

		//parte c 
		int n=0;

		System.out.println("n: " + n);

		incrementVar(n);

		System.out.println("n dopo aver chiamato il metodo: " + n);
	}

	public static void incrementAll(int[] a){
		for(int i=0;i<a.length;i++){
			a[i]+=1;
		}
	}

	public static void incrementVar(int value){
		value+=1;
	}
}