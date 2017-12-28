package chapter11.ExceptionsandAssertions;

public class ChainedException {
	
	public static void foo(){
		
		try{
			String[] str = {"foo","function"};
		    System.out.println("About to throw  ArrayIndexOutOfBoundsException");
		    String strName = str[10];
		}catch(ArrayIndexOutOfBoundsException oob){
		    System.out.println("Wrapping ArrayIndexOutOfBoundsException into a RuntimeException");
		    throw new RuntimeException(oob);
		}
	}
	
	public static void main(String[] args){
		try{
			foo();
		}catch(Exception e){
			System.out.println("The caught exception in main is: " + e.getClass());
			System.out.println("The cause of the exception is: " + e.getCause());
		}
	}
}
