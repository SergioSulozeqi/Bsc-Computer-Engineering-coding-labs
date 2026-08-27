//Sulozeqi Sergio 2101753
public class PizzaMap extends FixedArrayMap{

	public Object put(Object key, Object value){

		if(!(key instanceof String)){
			throw new IllegalArgumentException();
		}
		
		double prezzo = (double)value;

		Object obj;
		try{
			obj = super.put(key,prezzo);
		}
		catch(FullMapException e){
			p = resize(p,p.length*2);
			obj = super.put(key,prezzo);
		}

		return obj;
	}

	public String printMenu(){
		Pair[] v = new Pair[pSize];
		System.arraycopy(p,0,v,0,pSize);
		mergeSort(v);
		String s = "";
		for(int i=0; i<v.length; i++){
			s += v[i].toString()+"\n";
		}
		return s;
	}

	private Pair[] resize(Pair[] v, int newSize){
		Pair[] newV = new Pair[newSize];
		System.arraycopy(v,0,newV,0,v.length);
		return newV;
	}

	private void mergeSort(Pair[] v){
		if(v==null){
			return ;
		}

		if(v.length<2){
			return;
		}

		int mid = v.length/2;
		Pair[] left = new Pair[mid];
		System.arraycopy(v,0,left,0,mid);

		Pair[] right = new Pair[v.length-mid];
		System.arraycopy(v,mid,right,0,v.length-mid);

		mergeSort(left);
		mergeSort(right);

		merge(v,left,right);

	}

	private void merge(Pair[] v, Pair[] a, Pair[] b){
		int iv=0;
		int ia=0;
		int ib=0;
		while(ia<a.length && ib<b.length){
			if((double)a[ia].getValue() < (double)b[ib].getValue()){
				v[iv++] = a[ia++];
			}
			else{
				v[iv++] = b[ib++];
			}
		}

		while(ia<a.length){
			v[iv++] = a[ia++];
		}

		while(ib<b.length){
			v[iv++] = b[ib++];
		}
	}

}