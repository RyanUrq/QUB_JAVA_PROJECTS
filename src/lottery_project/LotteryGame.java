package lottery_project;
/**
 * @author ryan_urq
 *
 */
public class LotteryGame {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Lotto checker...");
		
		int[] CompNums = NumberSelection.GetCompNums();
		int[] UserNums = NumberSelection.GetUserNums();
		
		System.out.println("\n\nUser selected:");
		for (int i = 0;i < UserNums.length;i++) {
			if (i < UserNums.length - 1) {
				System.out.print(UserNums[i] + ", ");
			}
			else {
				System.out.println(UserNums[i]);
			}
		}
		System.out.println("\n\nComputer selected:");
		for (int i = 0;i < CompNums.length;i++) {
			if (i < CompNums.length - 1) {
				System.out.print(CompNums[i] + ", ");
			}
			else {
				System.out.println(CompNums[i]);
			}
		}
		
		int matches = NumbersComparison.compareNumbers(CompNums, UserNums);
		FinalResults.resultsChecker(matches);
		
		
	
	}

}
