package chapter6.GenericsandCollections;

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {

	static void removeDuplicatesWord(String sentence){
		Set<String> words = new HashSet<String>();
		String orisen = sentence;
		
		//split the sentence into words and try putting them in the set
		for(String word:sentence.split("\\W+")){
			words.add(word);
		}
		
		System.out.println("The orignal sentence is: " + orisen);
		System.out.println("The words used in the sentence is: " + words);
	}
	
	public static void main(String []agrs){
		String sen1 = "Provide quick find (full text search) within appointed field of current filtered report.Default find in all fields of report";
		String sen2 = "2 Grouped display data of all AM/BD subordinates of one AM/BD Mgr";
		String sen3 = "i feel, a feel, a funny feel, a funny feel I feel, if you feel the feel I feel, I feel the feel you feel";
		RemoveDuplicates.removeDuplicatesWord(sen1);
		RemoveDuplicates.removeDuplicatesWord(sen2);
		RemoveDuplicates.removeDuplicatesWord(sen3);
	}
}
