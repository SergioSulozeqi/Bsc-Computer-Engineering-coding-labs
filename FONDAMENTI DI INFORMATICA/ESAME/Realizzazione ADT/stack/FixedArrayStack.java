class FullStackExcpetion extends RuntimeException{}

class EmptyStackException extends RuntimeException{}

public class FixedArrayStack implements Stack{

	protected Object[] v;
	protected int vSize;

	public FixedArrayStack(){
		v = new Object[2];
		makeEmpty();
	}

	public void makeEmpty(){
		vSize=0;
	}

	public boolean isEmpty(){
		return (vSize==0);
	}

	public void push(Object obj){
		if(vSize==v.length){
			throw new FullStackExcpetion();
		}
		v[vSize] = obj;
		vSize++;
	}

	public Object top(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		Object obj = v[vSize-1];
		return obj;
	}
	public Object pop(){
		Object obj = top();
		vSize--;
		return obj;
	}
}