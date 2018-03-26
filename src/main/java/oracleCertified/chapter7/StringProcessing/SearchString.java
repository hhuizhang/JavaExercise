package oracleCertified.chapter7.StringProcessing;

class SearchString {
	public static void main(String []args){
		String str = "OCPJP";
		String str2 = "I am a student. I am preparing for OCPJP";
		int fromIndex = 0;
		int count = 0;
		System.out.println("Character J occurs at index: " + str.indexOf("J"));
		while(str2.indexOf("am", fromIndex)> -1){
			fromIndex = str2.indexOf("am", fromIndex);
			System.out.println("Substring \"am\" accurs at index: " + fromIndex);
			fromIndex ++;
			count++;
		}
		
		System.out.printf("There are %d \"am\" in the str2", count);
	}
}
