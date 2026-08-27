public class SortedArraySortedMap implements SortedMap{

	private Pair[] p;
	private int pSize;

	public SortedArraySortedMap(){
		p = new Pair[1];
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

	public Object get(Object key){

		if(!(key instanceof Comparable)){
			return null;
		}

		int pos = binSearch(p,0,pSize-1,(Comparable)key);

		if(pos==-1){
			return null;
		}

		return p[pos].getValue();
	}

	public Object remove(Object key){
		
		if(!(key instanceof Comparable)){
			return null;
		}

		int pos = binSearch(p,0,pSize-1,(Comparable)key);

		if(pos==-1){
			return null;
		}

		Object obj = p[pos].getValue();

		pSize--;
		for(int i=pos;i<pSize;i++){
			p[i]=p[i+1];
		}

		return obj;
	}

	public Object put(Object key, Object value){

		if(!(key instanceof Comparable)){
			throw new IllegalArgumentException();
		}

		int pos = binSearch(p,0,pSize-1,(Comparable)key);

		if(pos>=0){
			Object obj = p[pos].getValue();
			p[pos] = new Pair(key,value);
			return obj;	
		}

		if(pSize==p.length){
			p = resize(p,p.length*2);
		}

		int i = pSize-1;
		while(i>=0 && ((Comparable)key).compareTo((Comparable)p[i].getKey())<0){
			p[i+1] = p[i];
			i--;
		}

		p[i+1] = new Pair(key,value);
		pSize++;

		return null;

	}

	private static Pair[] resize(Pair[] p, int newSize){
		Pair[] x = new Pair[newSize];
		System.arraycopy(p,0,x,0,p.length);
		return x;
	}

	private static int binSearch(Pair[] p, int from, int to, Comparable target){

		if(p==null){
			throw new IllegalArgumentException();
		}

		if(from>to){
			return -1;
		}

		int mid = (from+to)/2;

		if(((Comparable)p[mid].getKey()).compareTo(target)==0){
			return mid;
		}

		else if(((Comparable)p[mid].getKey()).compareTo(target)>0){
			return binSearch(p,from,mid-1,target);
		}

		else{
			return binSearch(p,mid+1,to,target);
		}

	}
	
	private class Pair{

		private Object key;
		private Object value;

		private Pair(Object k, Object v){
			key = k;
			value = v;
		}

		private void setKey(Object k){
			key = k;
		}

		private void setValue(Object v){
			value = v;
		}

		private Object getKey(){
			return key;
		}

		private Object getValue(){
			return value;
		}

	}


}