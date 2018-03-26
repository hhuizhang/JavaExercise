package oracleCertified.chapter6.GenericsandCollections;

import java.util.ArrayList;
import java.util.Iterator;


class TestIterator {

	public static void main(String []args){
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=0; i<10;i++){
			num.add(i);
		}
		
		System.out.println("The orignal array list is: " + num);
		Iterator<Integer> numIter = num.iterator();
		while(numIter.hasNext()){
			numIter.next();
			numIter.remove();
		}
		System.out.println("After remove the element of the list is: " + num);
	}

}
