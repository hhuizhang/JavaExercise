package chapter6.GenericsandCollections;

public class BoxPrinter<T> {
    private T obj;
    
    public BoxPrinter(T val){
    	obj = val;
    }
    
    public String toString(){
		return "[" + obj + "]";
	}
    
	public T getValue(){
		return obj;
	}
	
}
