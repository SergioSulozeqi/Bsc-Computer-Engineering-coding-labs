class FullQueueException extends RuntimeException{}

class EmptyQueueException extends RuntimeException{}

public class FixedArrayQueue implements Queue{

	protected Object[] v;
	protected int front;
	protected int back;

	public FixedArrayQueue(){
		v = new Object[5];
		makeEmpty();
	}

	public void makeEmpty(){
		front=0;
		back=0;
	}

	public boolean isEmpty(){
		return (front==back);
	}

	public void enqueue(Object obj){
		if(back==v.length){
			throw new FullQueueException();
		}
		v[back]=obj;
		back++;
	}

	public Object getFront(){
		if(isEmpty()){
			throw new EmptyQueueException();
		}
		return v[front];
	}

	public Object dequeue(){
		Object obj=getFront();
		front++;
		return obj;
	}
}