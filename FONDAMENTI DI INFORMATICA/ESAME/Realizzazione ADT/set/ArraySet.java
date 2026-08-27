import java.util.*;
public class ArraySet implements Set{

	private Object[] v;
	private int vSize;

	public ArraySet(){
		v = new Object[10];
		makeEmpty();
	}

	public void makeEmpty(){
		vSize=0;
	}

	public boolean isEmpty(){
		return (vSize==0);
	}

	public boolean contains(Object obj){
		for(int i=0; i<vSize; i++){
			if(v[i].equals(obj)){
				return true;
			}
		}
		return false;
	}

	public void add(Object obj){
		if(!contains(obj)){
			if(vSize==v.length){
				v=resize(v,v.length*2);
			}
			v[vSize]=obj;
			vSize++;
		}
	}

	public Object[] toArray(){
		Object[] x = new Object[vSize];
		System.arraycopy(v,0,x,0,vSize);
		return x;
	}

	private static Object[] resize(Object[] oldArray, int newSize){
		Object[] x = new Object[newSize];
		System.arraycopy(oldArray,0,x,0,oldArray.length);
		return x;
	}

	public static Set union(Set s1, Set s2){
		Set x = new ArraySet();
		Object[] v = s1.toArray();
		for(int i=0;i<v.length;i++){
			x.add(v[i]);
		}
		v=s2.toArray();
		for(int i=0;i<v.length;i++){
			x.add(v[i]);
		}
		return x;
	}

	public static Set intersection(Set s1, Set s2){
		Set x = new ArraySet();
		Object[] v1 = s1.toArray();
		for(int i=0;i<v1.length;i++){
			if(s2.contains(v1[i])){
				x.add(v1[i]);
			}
		}
		return x;
	}

	public static Set substract(Set s1, Set s2){
		Set x = new ArraySet();
		Object[] v1 = s1.toArray();
		for(int i=0;i<v1.length;i++){
			if(!s2.contains(v1[i])){
				x.add(v1[i]);
			}
		}
		return x;
	}
}