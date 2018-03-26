package oracleCertified.chapter3.JavaClassDesign;

public class DownCast {
       public static void main(String []args){
    	   try {
			Object obj = new StringBuffer("Hello");
			   String str2 = (String)obj;
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
}
