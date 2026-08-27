//Sergio Sulozeqi 2101753
public class Sportello extends FixedCircularArrayQueue{

	protected int size;
	
	public Sportello(){
		super();
		size=0;
	}

	public void enqueue(Object obj){
		super.enqueue(obj);
		size++;
	}


	public int getSize(){
		return size;
	}

	public Object dequeue(){
		int n=(int)getFront();
		n--;
		if(n==0){
			size--;
			return super.dequeue();
		}
		else{
			v[front]=n;
			return null;
		}
		
	}

	public String toString(){
		return size +  " clienti: " + super.toString();
	}

}
