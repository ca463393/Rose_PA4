import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
   private Set<String> uniqueWords; 

	   public void remove(String dataFile) throws FileNotFoundException {
	       String word;
	       uniqueWords = new HashSet<String>();
	       Scanner scnr =new Scanner(new File(dataFile));
	       while(scnr.hasNext())
	       {
	           word=scnr.next();
	           uniqueWords.add(word);
	           
	       }//end while loop
	       
	       scnr.close();    
	   }//end remove method
	  
  
	   public void Write(String outputFile) throws IOException {
		File f;
		FileWriter fw = null;
		
		f = new File(outputFile);
		//If file already exists then overwrite
		if(f.exists()) {
		fw=new FileWriter(f,false);
		
		Iterator iterator = uniqueWords.iterator();
		
		while(iterator.hasNext()) {
			
		   String string = (String)iterator.next();
		   fw.write(string + "\n"); 
		   
		}//end while loop
		
		fw.close();
		System.out.println("Data Written to File");
		  
		}//end if statement
		
		else {
			//If no file already exists then create a new file
			f.createNewFile();
			fw=new FileWriter(f);
			Iterator iterator = uniqueWords.iterator();
		
		while(iterator.hasNext()) {
			
		   String string = (String)iterator.next();
		   fw.write(string + "\n");    
		   
		}//end while loop
		
		fw.close();
		System.out.println("Data Written to File");
		}//end else statement

   }//end Write method

}