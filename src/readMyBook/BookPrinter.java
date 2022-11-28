package readMyBook;

public class BookPrinter {

	public static void printer(String fileName) {
		
		System.out.println("Attempting book read");
		
		String[] Book = BookReader.bookReader(fileName);
		
		for (String Line:Book) {
			System.out.println(Line);
		}

	}

}
