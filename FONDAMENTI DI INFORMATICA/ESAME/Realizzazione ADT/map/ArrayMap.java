public class ArrayMap implements Map{

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

	public ArrayMap(){
		p = new Pair[2];
		makeEmpty();
	}
	public void makeEmpty(){
		pSize=0;
	}
	public boolean isEmpty(){
		return (pSize==0);
	}


	public Object put(Object key, Object value){

		if(key==null || value==null){
			throw new IllegalArgumentException();
		}

		Object obj = remove(key);

		if(pSize==p.length){
			p = resize(p,p.length*2);
		}

		p[pSize] = new Pair(key,value);
		pSize++;

		return obj;
	}

	public Object remove(Object key){
		for(int i=0;i<pSize;i++){
			if((p[i].getKey()).equals(key)){
				Object obj = p[i].getValue();
				p[i] = p[pSize-1];
				pSize--;
				return obj;
			}
		}
		return null;
	}

	public Object get(Object key){
		for(int i=0;i<pSize;i++){
			if(p[i].getKey().equals(key)){
				Object obj = p[i].getValue();
				return obj;
			}
		}
		return null;
	}

	public Object[] keys(){
		Object[] x = new Object[pSize];
		for(int i=0;i<pSize;i++){
			x[i] = p[i].getKey();
		}
		return x;
	}

	private static Pair[] resize(Pair[] oldArray, int newSize){
		Pair[] x = new Pair[newSize];
		System.arraycopy(oldArray,0,x,0,oldArray.length);
		return x;
	}

}