//The example is to demonstrate Singleton design pattern.
//Logger class must be intantiated only once in the application;it is to ensure that the whole of the application makes use of the same logger instance.
package chapter5.ObjectOrientedDesignPrinciples;

public class Logger {
    static int i = 0;
	private Logger(){
		System.out.println("Logger object instantiate");
	}
	
	public static Logger myInstance;
	
	//implementation 1  Lazy Loaded
	//Defect:Works only when the application is single-threaded. 
	/*public static Logger getInstance(){
		if (myInstance == null){
			myInstance = new Logger();
		}
		return myInstance;
	}*/
	
	//implementation 2 Synchronized
	//Works when the application is multiple-threaded
	//Defect: poor performance
	/*public static synchronized Logger getInstance(){
		if (myInstance == null){
			myInstance = new Logger();
		}
		return myInstance;
	}*/
	
	//implementation 3 Static nested Class
	
	private static class LoggerHolder{
		static Logger logger = new Logger();
	}
	
	public static Logger getInstance(){
		return LoggerHolder.logger;
	}
	
	public void log(String s){
		System.err.println(s);
	}
	
}
