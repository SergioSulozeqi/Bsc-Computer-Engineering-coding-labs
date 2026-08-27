class InvalidPositionTableException extends RuntimeException{}

public class ArrayTable100{

	private Object[] v;
	private int count;

	public ArrayTable100(){
		v=new Object[100];
		makeEmpty();
	}

	public void makeEmpty(){
		count=0;
		for(int i=0;i<v.length;i++){
			v[i]=null;
		}
	}
	public boolean isEmpty(){
		return (count==0);
	}
	public void check(int n){
		if(n<0 || n>=v.length){
			throw new InvalidPositionTableException();
		}
	}

	public void insert(int key, Object value){
		check(key);
		if(v[key]==null){
			count++;
			v[key]=value;
		}
		else{
			v[key]=value;
		}
	}

	public void remove(int key){
		check(key);
		if(v[key]!=null){
			v[key]=null;
			count--;
		}
	}

	public Object find(int key){
		check(key);
		return v[key];
	}

}