package chapter6.GenericsandCollections;

import java.util.Vector;

class OldContainerTest {
	public static void main(String []agrs){
		@SuppressWarnings({"unchecked"})
		Vector floatValues = new Vector();
		floatValues.add(10.0f);
		floatValues.add(100.0);
		
		for(int i=0;i<floatValues.size();i++){
			//float temp = (Float) floatValues.get(i);
			System.out.println(floatValues.get(i));
		}

	}
}
