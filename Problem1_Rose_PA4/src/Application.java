import java.io.IOException;
import java.io.*;

public class Application {

   public static void main(String[] args) throws Exception {
       DuplicateRemover duplicateRemover = new DuplicateRemover();
      
       duplicateRemover.remove("problem1.txt");
       duplicateRemover.Write("unique_words.txt");
    
   }//end main method
}//end class