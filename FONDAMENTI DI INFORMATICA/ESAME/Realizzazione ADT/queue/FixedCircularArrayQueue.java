public class FixedCircularArrayQueue extends FixedArrayQueue{

	protected int increment(int index){
		return (index+1)%v.length;
	}

	public void enqueue(Object obj){
		if(increment(back) == front){
			throw new FullQueueException();
		}
		v[back] = obj;
		back = increment(back);
	}

	public Object dequeue(){
		Object obj=getFront();
		front = increment(front);
		return obj;
	}
}