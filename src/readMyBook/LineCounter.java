package readMyBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LineCounter {
	
	public static int counter(String fileName) {
		
		
		String line;
		int counter = 0;

		try {
			// Create file object
			File file = new File(fileName);
			// create file reader object, related to the above file object
			FileReader filereader = new FileReader(file.getName());
			// create buffered reader object
			BufferedReader bufferReader = new BufferedReader(filereader);
			// read contents of file
			line = bufferReader.readLine();
			while (line != null) {
				counter++;
				line = bufferReader.readLine();
			}
		}catch (Exception e) {e.printStackTrace();}
		
		return counter;
	}

}
