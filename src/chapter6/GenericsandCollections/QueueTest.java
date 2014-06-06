package chapter6.GenericsandCollections;

import java.util.LinkedList;
import java.util.Queue;
class QueueTest {
	public static void main(String[] agrs){
		Queue<String> loginSequence = new LinkedList<String>();
		
		loginSequence.add("Harrison");
		loginSequence.add("McCartney");
		loginSequence.add("Starr");
		loginSequence.add("Lenon");
		loginSequence.add("Catherine");
		loginSequence.add("Roy");
		loginSequence.add("Toby");
		loginSequence.add("Ivan");
		
		System.out.println("The login sequence is: " + loginSequence);
		while(!loginSequence.isEmpty()){
			System.out.println("Removing " + loginSequence.remove());
		}
		
	}
}
