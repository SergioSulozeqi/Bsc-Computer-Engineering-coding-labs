public class ArrayMultiMap{

	private Pair[] p;
	private int pSize;

	public ArrayMultiMap(){
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
		Object[] x = new Object[pSize];
		for(int i=0;i<pSize;i++){
			x[i] = p[i].getKey();
		}
		return x;
	}

	public Object find(Object key){

		for(int i=0;i<pSize;i++){
			if(key.equals(p[i].getKey())){
				return p[i].getValue();
			}
		}
		return null;

	}

	public Object[] findAll(Object key){

		Object[] x = new Object[pSize];
		int xSize=0;

		for(int i=0;i<pSize;i++){
			if(key.equals(p[i].getKey())){
				x[xSize] = p[i].getValue();
				xSize++;
			}
		}

		Object[] y = new Object[xSize];
		System.arraycopy(x,0,y,0,xSize);

		return y;

	}

	public Object remove(Object key){

		for(int i=0;i<pSize;i++){
			if(key.equals(p[i].getKey())){
				Object obj = p[i].getValue();
				p[i] = p[pSize-1];
				pSize--;
				return obj;
			}
		}

		return null;
	}

	public Object[] removeAll(Object key){

		Object[] x = new Object[pSize];
		int xSize=0;

		for(int i=0;i<pSize;i++){
			if(key.equals(p[i].getKey())){
				x[xSize] = p[i].getValue();
				xSize++;
				p[i] = p[pSize-1];
				pSize--;
				i--;
			}
		}

		return null;
	}

	public void insert(Object key, Object value){

		if(key==null || value == null){
			throw new IllegalArgumentException();
		}

		if(pSize==p.length){
			p = resize(p,p.length*2);
		}

		p[pSize] = new Pair(key,value);
		pSize++;
	}

	private static Pair[] resize(Pair[] p, int newSize){
		Pair[] x = new Pair[newSize];
		System.arraycopy(p,0,x,0,p.length);
		return x;
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