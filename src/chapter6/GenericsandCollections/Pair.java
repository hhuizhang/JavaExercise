package chapter6.GenericsandCollections;

public class Pair<T1, T2> {
	
	 T1 Object1;
	 T2 Object2;
	 Pair(T1 one, T2 two){
		 Object1 = one;
		 Object2 = two;
	 }
     public T1 getFirst(){
    	 return Object1;
     }
     
     public T2 getSecond(){
    	 return Object2;
     }
}
