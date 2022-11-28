package readMyBook;

public class Main {

	public static void main(String[] args) {

		String fileName = "Catch 22.txt";
		
		System.out.println("Part1\n");
		
		BookPrinter.printer(fileName);
		
		System.out.println("\nPart2\n");
		
		System.out.println(LineCounter.counter(fileName));
		
		System.out.println("\nPart3\n");
		
		System.out.println(WordCounter.wordCounter(fileName));
		
		System.out.println("\nPart4\n");
		
		
		
	}

}
