package oracleCertified.chapter6.GenericsandCollections;

import java.util.ArrayList;
import java.util.List;

class UtilitiesTest {
	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		System.out.println("The origianl list is : " + intList);
		Utilities.fill(intList, 222);
		System.out.println("The list after calling Utilities.fill() is: " + intList);
		
	}
}
