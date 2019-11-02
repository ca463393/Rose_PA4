import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
  
private static final String I_FILE = "problem2.txt";
private static final String O_FILE = "unique_word_counts.txt";
  
	public static void main(String[] args) throws IOException {
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		duplicateCounter.count(I_FILE);
		duplicateCounter.write(O_FILE);
	
	}//end main method
}//end class