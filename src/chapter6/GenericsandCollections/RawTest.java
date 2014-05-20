//This program demonstrates usage of raw types along with generic.
//Avoid mixing raw types with generic types.

package chapter6.GenericsandCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class RawTest {
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.add("First");
		list.add("Second");
		List strList = list;
		for(Iterator<String> itemItr = strList.iterator();itemItr.hasNext();){
			System.out.println("Item : " + itemItr.next());
		}
		
		List<String> strList2 = new LinkedList<String>();
		strList2.add("First");
		strList2.add("Second");
		List list2 = strList2;
		for(Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();){
			System.out.println("Item : " + itemItr.next());
		}
	}
}
