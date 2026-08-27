public class ArrayAlgs{

	public static void selectionSort(int[] a){
		if(a==null){
			return ;
		}

		for(int i=0; i<a.length-1; i++){
			int pos = findMinFrom(a, i);
			if(pos!=i){
				swap(a,pos,i);
			}
		}
	}

	public static void mergeSort(int[] a){
		if(a==null){
			return ;
		}

		if(a.length<2){   //caso base
			return;
		}

		int mid = a.length/2;

		int[] left = new int[mid];
		System.arraycopy(a,0,left,0,mid);

		int[] right = new int[a.length-mid];
		System.arraycopy(a,mid,right,0,right.length);

		mergeSort(left);
		mergeSort(right);

		merge(a,left,right);

	}

	public static void insertionSort(int[] a){
		if(a==null){
			return;
		}

		for(int i=1;i<a.length;i++){
			for(int j=i-1;j>=0;j--){
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
				}
				else{
					break;
				}
			}
		}
	}

	public static int findMinFrom(int[] a, int inizio){
		int pos = inizio;
		for(int i=inizio+1; i<a.length; i++){
			if(a[i] < a[pos]){
				pos = i;
			}
		}
		return pos;
	}


	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


	public static void merge(int[] a, int[] left, int[] right){
		int i;
		int leftPos=0;
		int rightPos=0;
		int aPos=0;

		while(leftPos<left.length && rightPos<right.length){
			if(left[leftPos] <= right[rightPos]){
				a[aPos] = left[leftPos];
				aPos++;
				leftPos++;
			}
			else{
				a[aPos] = right[rightPos];
				aPos++;
				rightPos++;
			}
		}

		while(leftPos<left.length){
			a[aPos]=left[leftPos];
			aPos++;
			leftPos++;
		}
		while(rightPos<right.length){
			a[aPos]=right[rightPos];
			aPos++;
			rightPos++;
		}
	}
}