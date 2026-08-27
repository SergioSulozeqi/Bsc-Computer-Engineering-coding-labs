class FullQueueException extends RuntimeException{}

class EmptyQueueException extends RuntimeException{}

public class SlowFixedArrayQueue implements Queue{

	protected Object[] v;
	protected int vSize;

	public SlowFixedArrayQueue(){
		v = new Object[2];
		makeEmpty();
	}

	public void makeEmpty(){
		vSize=0;
	}

	public boolean isEmpty(){
		return (vSize==0);
	}

	public void enqueue(Object obj){
		if(vSize==v.length){
			throw new FullQueueException();
		}
		v[vSize]=obj;
		vSize++;
	}

	public Object getFront(){
		if(isEmpty()){
			throw new EmptyQueueException();
		}
		return v[0];
	}

	public Object dequeue(){
		Object obj=getFront();
		vSize--;
		for(int i=0;i<vSize;i++){
			v[i]=v[i+1];
		}
		return obj;
	}
}