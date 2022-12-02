package readMyBook;

public class NameCounter {
	
	public static int nameCounter(String fileName) {
		
		String Book[] = BookReader.bookReader(fileName);
		String YoLines = "";
		for (String line: Book) {
			if (line.contains("Yossarian")) {
				YoLines = YoLines + " " + line;
			}
		}
		
		String[] YoArray = YoLines.split("Yossarian");
		
		return (YoArray.length - 1);
		
	}

}
