package readMyBook;

public class ACounter {
	
	public static int aCounter(String fileName) {
		
		String[] Book = BookReader.bookReader(fileName);
		int counter = 0;
		
		for (String line: Book) {
			
			String[] lineCount = line.split("a");
			
			counter += lineCount.length - 1;
			
		}
		
		return counter;
	}

}
