package oracleCertified.chapter6.GenericsandCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class ListIteratorTest {

	public static boolean palindromeCheck(String palStr){
		boolean result = true;
		String orignalStr = palStr;
		
		List<Character> palindrome = new LinkedList<Character>();
		for(char ch:palStr.toCharArray()){
			palindrome.add(ch);
		}
		
	    ListIterator<Character> iterator = palindrome.listIterator();
	    ListIterator<Character> revIterator = palindrome.listIterator(palindrome.size());
	    
	    while(revIterator.hasPrevious()&& iterator.hasNext()){
	    	if(revIterator.previous() != iterator.next())
	    		result = false;
	    	    break;
	    }
	    
	    if(result)
	    {
	    	System.out.println("The string [ " + orignalStr + " ] is a palindrome.");
	    	return result;
	    }
	    else
	    {
	    	System.out.println("The string [ " + orignalStr + " ] is not a palindrome.");
	    	return result;
	    }
	    
    }
	
	public static void main(String []args){
		String str1 = "12345654321";
		String str2 = "abcdefghaids";
		String str3 = "abcdedcba";
		String str4 = "zhanghui";
		ListIteratorTest.palindromeCheck(str1);
		ListIteratorTest.palindromeCheck(str2);
		ListIteratorTest.palindromeCheck(str3);
		ListIteratorTest.palindromeCheck(str4);
	}
	
}