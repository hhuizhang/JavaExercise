package chapter6.GenericsandCollections;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {

	/**
	 * @param args
	 */
	
	public static void printlist(List<?> list){
		for(Object l:list){
			System.out.println("[" + l +"]");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> intList  = new ArrayList<Integer>();
         intList.add(10);
         intList.add(20);
         intList.add(30);
         printlist(intList);
         List<String> strList = new ArrayList<String>();
         strList.add("I ");
         strList.add("am ");
         strList.add("Zhang Hui");
         printlist(strList); 
         
         List<? super Integer> intList1 = new ArrayList<Integer>();
         

	}
	
	

}
