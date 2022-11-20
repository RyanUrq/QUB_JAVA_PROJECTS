/**
 * 
 */
package lottery_project;

/**
 * @author ryan_urq
 *
 */
public class NumbersComparison {
	
	public static int compareNumbers(int[] CompNums, int[] UserNums) {
		int matches = 0;
		System.out.println("Checking for winners...\n");
		for (int i = 0; i < CompNums.length;i++) {
			if (CompNums[i] == UserNums[i]) {
				System.out.println("Winner " + UserNums[i]);
				matches++;
			}
			else {
				System.out.println(UserNums[i] + " not a winner.");
			}
			
		}
		return matches;
	}

}
