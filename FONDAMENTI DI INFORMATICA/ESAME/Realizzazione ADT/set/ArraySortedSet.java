public class ArraySortedSet implements SortedSet{

	private Comparable[] v;
	private int vSize;

	public ArraySortedSet(){
		v = new Comparable[10];
		makeEmpty();
	}

	public void makeEmpty(){
		vSize=0;
	}

	public boolean isEmpty(){
		return (vSize==0);
	}

	public Object[] toArray(){
		return toSortedArray();
	}

	public Comparable[] toSortedArray(){
		Comparable[] x = new Comparable[vSize];
		System.arraycopy(v,0,x,0,vSize);
		return x;
	}

	public boolean contains(Object obj){
		return binarySearch(v,0,vSize-1,obj);
	}

	public void add(Object obj){
		throw new IllegalArgumentException();
	}

	public void add(Comparable obj){
		if(!contains(obj)){
			if(vSize==v.length){
				v=resize(v,v.length*2);
			}
			v[vSize]=obj;
			vSize++;
			v=insertionSortLast(v,vSize);
		}
	}

	private static Comparable[] resize(Comparable[] oldArray, int newSize){
		Comparable[] x = new Comparable[newSize];
		System.arraycopy(oldArray,0,x,0,oldArray.length);
		return x;
	}

	private static boolean binarySearch(Comparable[] x, int from, int to, Object target){

		if(from>to){
			return false;
		}

		int middle = (from+to)/2;
		if(x[middle].compareTo(target)==0){
			return true;
		}

		if(x[middle].compareTo(target)>0){
			return binarySearch(x,from,middle-1,target);
		}

		return binarySearch(x,middle+1,to,target);
	}

	private static Comparable[] insertionSortLast(Comparable[] x, int xSize){
		for(int i=xSize-2;i>=0;i--){
			if(x[i].compareTo(x[i+1])>0){
				Comparable a = x[i];
				x[i]=x[i+1];
				x[i+1]=a;
			}
			else{
				return x;
			}
		}
		return x;
	}

	public static SortedSet union(SortedSet s1, SortedSet s2){

		SortedSet x = new ArraySortedSet();
		Comparable[] v1 = s1.toSortedArray();
		Comparable[] v2 = s2.toSortedArray();

		int i = 0;
		int j = 0;

		while(i<v1.length && j<v2.length){
			if(v1[i].compareTo(v2[j])<0){
				x.add(v1[i]);
				i++;
			}
			else if(v1[i].compareTo(v2[j])>0){
				x.add(v2[j]);
				j++;
			}
			else{
				x.add(v1[i]);
				i++;
				j++;
			}
		}

		while(i<v1.length){
			x.add(v1[i]);
			i++;
		}
		while(j<v2.length){
			x.add(v2[j]);
			j++;
		}

		return x;
	}

	public static SortedSet intersection(SortedSet s1, SortedSet s2){

		SortedSet x = new ArraySortedSet();
		Comparable[] v1 = s1.toSortedArray();
		Comparable[] v2 = s2.toSortedArray();

		for(int i=0,j=0;i<v1.length;i++){
			while(j<v2.length && v1[i].compareTo(v2[j])>0){
				j++;
			}
			if(j==v2.length){
				break;
			}
			if(v1[i].compareTo(v2[j])==0){
				x.add(v1[i]);
				j++;
			}
		}
		return x;
	}

	public static SortedSet substract(SortedSet s1, SortedSet s2){
		SortedSet x = new ArraySortedSet();
		Comparable[] v1 = s1.toSortedArray();
		Comparable[] v2 = s2.toSortedArray();

		int i;
		int j;
		for(i=0,j=0;i<v1.length;i++){
			while(j<v2.length && v1[i].compareTo(v2[j])>0){
				j++;
			}
			if(j==v2.length){
				break;
			}
			if(v1[i].compareTo(v2[j])!=0){
				x.add(v1[i]);
				j++;
			}
		}

		while(i<v1.length){
			x.add(v1[i]);
			i++;
		}

		return x;
	}
}