package oracleCertified.chapter4.AdvancedClassDesign;

public class Counter {
	
	private static int count;
	
	Counter (){
		count++;
	}
    
	public static void printCount(){
		System.out.println("Number of instance created so far is: " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Counter c1 = new Counter();
        Counter.printCount();
        Counter c2 = new Counter();
        Counter.printCount();
	}

}
