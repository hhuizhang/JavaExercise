package oracleCertified.chapter6.GenericsandCollections;

class BoxPrinter<T> {
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
