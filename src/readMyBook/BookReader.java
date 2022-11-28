/**
 *  File reader
 */
package readMyBook;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class BookReader {


	public static String[] bookReader(String fileName) {
		
		String line;
		String[] toReturn;
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
		
		toReturn = new String[counter];
		
		try {
			// Create file object
			File file = new File(fileName);
			// create file reader object, related to the above file object
			FileReader filereader = new FileReader(file.getName());
			// create buffered reader object
			BufferedReader bufferReader = new BufferedReader(filereader);
			// read contents of file
			line = bufferReader.readLine();
			for (int i = 0; i < toReturn.length; i++) {
				toReturn[i] = line;
				line = bufferReader.readLine();
			}
		} catch (Exception e){ e.printStackTrace();}

		// Returns String array
		return toReturn;

	}

}
