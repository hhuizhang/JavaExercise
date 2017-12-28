package chapter6.GenericsandCollections;

import java.util.ArrayList;
import java.util.List;

 class BoundedWildCardUse {
	public static Double sum(List<? extends Number> numList){
		Double result = 0.0;
		for(Number num:numList){
			result += num.doubleValue();
		}
	return result;
	}
	
	public static void main(String []args){
		List<Integer> intList = new ArrayList<Integer>();
		List<Double> douList = new ArrayList<Double>();
		
		for(int i= 0; i< 5; i++){
			intList.add(i);
			douList.add((double)(i*i));
		}
		
		System.out.println("The intList is: " + intList );
		System.out.println("The sum of elements in intList is: " + sum(intList));
		System.out.println("The douList is: " + douList);
		System.out.println("The sum of elements in douList is: " + sum(douList));
	}
}
