/**
 *  This compares the user selected numbers and the computer numbers. 
 */
package lottery_project;

/**
 * @author ryan_urq
 *
 */
public class NumbersComparison {
	
	public static int compareNumbers(int[] CompNums, int[] UserNums) {
		// Counter for the matches
		int matches = 0;
		System.out.println("Checking for winners...\n");
		// Compare numbers for each index
		for (int i = 0; i < CompNums.length;i++) {
			if (CompNums[i] == UserNums[i]) {
				System.out.println("Winner " + UserNums[i]);
				matches++;
			}
			else {
				System.out.println(UserNums[i] + " not a winner.");
			}
			
		}
		// Return the number of matches
		return matches;
	}

}
