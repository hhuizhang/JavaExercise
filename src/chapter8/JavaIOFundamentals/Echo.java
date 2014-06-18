package chapter8.JavaIOFundamentals;

import java.io.Console;

class Echo {

	public static void main(String []agrs){
		Console console = System.console();
		if(console == null){
			System.out.println("Cannot retrive console object - are you running your application from an IDE? Existing the application...");
			System.exit(-1);
		}
		
		console.printf(console.readLine());
	}
}
