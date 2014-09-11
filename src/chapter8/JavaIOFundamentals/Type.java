package chapter8.JavaIOFundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Type {
	
	public static void main(String [] files){
		
	if(files.length == 0){
			System.err.println("Please input file(s) name as arguments");
			System.exit(-1);
		  }
		
		for(String file:files){

			try {FileReader inputFile = new FileReader(file);
				int ch = 0;
				
	           while((ch = inputFile.read())!= -1){
					 System.out.print((char)ch);
				   }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.err.printf("Cannot open the given file %s", file);
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.err.printf("Error when processing file %s... skipping it", file);
					}
				
				}
				
			}
			
}





	
