package readMyBook;

public class CharCounter {
	public static int charCounter(String fileName) {
		
		String[] Book = BookReader.bookReader(fileName);
		int charCount = 0;
		for (String line: Book) {
			charCount += line.length();
		}
		return charCount;
	}
}
