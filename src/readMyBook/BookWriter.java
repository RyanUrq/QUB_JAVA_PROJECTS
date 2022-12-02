package readMyBook;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class BookWriter {
	
	public static void bookWriter(String fileName) {
		
		try {
			File redacted = new File("Catch 22 Redacted.txt");
			FileWriter fw = new FileWriter(redacted.getName());
			BufferedWriter bw = new BufferedWriter(fw);
			
			String[] Book = BookReader.bookReader(fileName);
			
			for (String line: Book) {
				if (line.contains("Yossarian")) {
					String redactedLine = line.replace("Yossarian", "**********");
					bw.write(redactedLine + "\n");
				}
				else {
					bw.write(line + "\n");
				}
			}
			Thread.sleep(100);
			fw.close();
			//bw.close();
		} catch (Exception e) {e.printStackTrace();}
	}

}
