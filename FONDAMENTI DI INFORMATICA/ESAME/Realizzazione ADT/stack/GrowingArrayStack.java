public class GrowingArrayStack extends FixedArrayStack{

	public void push(Object obj){
		if(vSize==v.length){
			v = resize(v, v.length*2);
		}
		super.push(obj);

	}

	private static Object[] resize(Object[] oldArray,int newSize){
		Object[] newArray = new Object[newSize];
		for(int i=0;i<oldArray.length;i++){
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
}