public class StringArrayStack extends GrowingArrayStack{

	public void push(Object obj){
		if(!(obj instanceof String)){
			throw new IllegalArgumentException();
		}
		super.push(obj);
	}
}