public class SortedArraySortedMap implements SortedMap{


	private class Pair{

		private Object key;
		private Object value;

		private Pair(Object aKey, Object aValue){
			setKey(aKey);
			setValue(aValue);
		}

		private Object getKey(){
			return key;
		}
		private Object getValue(){
			return value;
		}
		private void setKey(Object aKey){
			key = aKey;
		}
		private void setValue(Object aValue){
			value = aValue;
		}
	}


	private Pair[] p;
	private int pSize;

	public SortedArraySortedMap(){
		p = new Pair[2];
		makeEmpty();
	}
	public void makeEmpty(){
		pSize=0;
	}
	public boolean isEmpty(){
		return (pSize==0);
	}

	public int size(){
		return pSize;
	}

	public Object put(Object key, Object value){

		if(!(key instanceof Comparable) || key==null || value==null){
			throw new IllegalArgumentException();
		}

		int pos = binarySearch(p,0,pSize-1,key);

		if(pos>=0){
			Object obj = p[pos].getValue();
			p[pos] = new Pair(key,value);
			return obj;
		}

		if(pSize==p.length){
			p = resize(p,p.length*2);
		}

		int i = pSize-1;
		while(i>=0 && ((Comparable)key).compareTo(p[i].getKey())<0){
			p[i+1] = p[i];
			i--;
		}

		p[i+1] = new Pair(key,value);
		pSize++;

		return null;

	}

	public Object remove(Object key){

		int pos = binarySearch(p,0,pSize-1,key);

		if(pos==-1){
			return null;
		}

		Object obj = p[pos].getValue();
		for(int i=pos;i<=pSize-2;i++){
			p[i]=p[i+1];
		}
		pSize--;
		return obj;
	}

	public Object get(Object key){

		int pos = binarySearch(p,0,pSize-1,key);
		if(pos==-1){
			return null;
		}
		return p[pos].getValue();
	}

	public Object[] keys(){
		return sortedKeys();
	}

	public Comparable[] sortedKeys(){

		Comparable[] x = new Comparable[pSize];
		for(int i=0;i<pSize;i++){
			x[i] = (Comparable)p[i].getKey();
		}
		return x;
	}


	private int binarySearch(Pair[] p,int from,int to, Object target){

		if(from>to){
			return -1;
		}

		int middle = (from+to)/2;
		if(target.equals(p[middle].getKey())){
			return middle;
		}

		if(((Comparable)target).compareTo(p[middle].getKey())<0){
			return binarySearch(p,from,middle-1,target);
		}

		return binarySearch(p,middle+1,to,target);
	}

	private static Pair[] resize(Pair[] oldArray, int newSize){
		Pair[] x = new Pair[newSize];
		System.arraycopy(oldArray,0,x,0,oldArray.length);
		return x;
	}

}