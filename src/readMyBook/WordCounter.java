package readMyBook;

public class WordCounter {

	public static int wordCounter(String fileName) {
		
		String[] Book = BookReader.bookReader(fileName);
		int count = 0;
		
		for (String line: Book) {
			
			String[] subString = line.split(" ");
			count += subString.length - 1;
			
		}
		
		return count;
		
		
	}
}
