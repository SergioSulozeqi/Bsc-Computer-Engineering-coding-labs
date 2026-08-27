public class GrowingArrayQueue extends FixedArrayQueue{

	public void enqueue(Object obj){
		if(back==v.length){
			v=resize(v,v.length*2);
		}
		super.enqueue(obj);
	}

	private static Object[] resize(Object[] oldArray, int newSize){
		Object[] newArray = new Object[newSize];
		for(int i=0;i<oldArray.length;i++){
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
}