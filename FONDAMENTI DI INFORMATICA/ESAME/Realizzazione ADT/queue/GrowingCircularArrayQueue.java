public class GrowingCircularArrayQueue extends FixedCircularArrayQueue{

	public void enqueue(Object obj){
		if(increment(back)==front){
			v=resizeCircular(v,v.length*2);
		}
		super.enqueue(obj);
	}

	private  Object[] resizeCircular(Object[] oldArray, int newSize){
		Object[] v = new Object[newSize];
		for(int i=0;i<oldArray.length;i++){
			v[i] = oldArray[i];
		}
		if(back<front){
			System.arraycopy(v,0,v,oldArray.length,back);
			back += oldArray.length;
		}
		return v;
	}
}