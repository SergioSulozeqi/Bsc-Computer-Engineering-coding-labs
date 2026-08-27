public class ArrayUtil{

	public static int[] resize(int[] array, int newSize){
		int[] newArray = new int[newSize];
		if(newSize<=array.length){
			for(int i=0;i<newSize;i++){
				newArray[i] = array[i];
			}
		}
		else{
			for(int i=0;i<array.length;i++){
				newArray[i] = array[i];
			}
		}
		array = newArray;
		return array;
	}


	public static double[] resize(double[] array, int newSize){
		double[] newArray = new double[newSize];
		if(newSize<=array.length){
			for(int i=0;i<newSize;i++){
				newArray[i] = array[i];
			}
		}
		else{
			for(int i=0;i<array.length;i++){
				newArray[i] = array[i];
			}
		}
		return newArray;
	}

	public static int[] randomIntArray(int length,int n){
		int[] array = new int[length];
		for(int i=0; i<array.length; i++){
			array[i] = (int)((n+1)*Math.random());
		}
		return array;
	}

	public static String printArray(int[]v,int vSize){
		String s = "[ ";
		for(int i=0;i<vSize;i++){
			s = s + v[i] + " ";
		}
		s = s + "]";
		return s;
	}

	public static int[] remove(int[]v, int vSize, int index){
		v[index] = v[vSize-1];
		vSize--;
		v=resize(v,vSize);
		return v;
	}

	public static int[] removeSorted(int[] v, int vSize, int index){
		for(int i=index; i<vSize-1; i++){
			v[i]=v[i+1];
		}
		vSize--;
		v = resize(v, vSize);
		return v; 
	}
 
	public static int[] insert(int[] v, int vSize, int index, int value){
		vSize++;
		v = resize(v,vSize);
		for(int i=vSize-1; i>index; i--){
			v[i] = v[i-1];
		}
		v[index] = value;
		return v;
	}

	//dovrei lanciare eccezione se viene passato un array vuoto
	public static int findMin(int[] v, int vSize){
		int min = v[0];
		for(int i=0;i<vSize;i++){
			if(v[i] < min){
				min = v[i];
			}
		}
		return min;
	}

	//dovrei lanciare eccezione se viene passato un array vuoto
	public static int findMax(int[] v, int vSize){
		int max = v[0];
		for(int i=0;i<vSize;i++){
			if(v[i] > max){
				max = v[i];
			}
		}
		return max;
	}

	public static int find(int[] v, int vSize, int target){
		int found=-1;
		for(int i=0; i<vSize; i++){
			if(v[i]==target){
				found = i;
				break;
			}
		}
		return found;
	}
}