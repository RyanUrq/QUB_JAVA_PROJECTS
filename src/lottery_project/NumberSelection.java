package lottery_project;
/**
* This is both the user selection, and the computer selection
*/
import java.util.Random;
import java.util.Scanner;

public class NumberSelection {

	public static int[] GetUserNums() {
		// User selection
		Scanner sc = new Scanner(System.in);
		// Check to make sure the number is okay for the user to have selected
		boolean check = true;
		int[] UserNums = new int[6];
		System.out.println("Please input your lottery numbers \nbetween 1 and 38 inclusive");
		for(int i = 0; i < UserNums.length;i++) {
			while (check == true){
				System.out.println("\n\nInput number " + (i+1));
				// Try user input, this is to correct for the user possibly putting in a string rather than an int
				try {
					UserNums[i] = sc.nextInt();
				} catch(Exception e) {
					System.out.println("Please enter and integer, not anything else. Thank you.");				
				}
				// Check to make sure the number is within the boundaries
				if (UserNums[i] <= 38 & UserNums[i] > 0) {
					check = false;
				}
				else {
					System.out.println("The number you have entered is not in \nthe boundaries, 1 - 38"
							+ " please try again");
				}
				// Check to make sure the user doesn't select the same number twice
				for (int j = 0; j < UserNums.length; j++) {
					if (j == i) {continue;}
					if (UserNums[i] == UserNums[j]) {
						System.out.println("You have already selected this number, please try again");
						i--;
						break;
					}
				}
				// Clear the scanner
				sc.nextLine();
			}check = true;
			
		}
		sc.close();
		return UserNums;
	}
	
	public static int[] GetCompNums() {
		// Comp selection
		Random rand = new Random();
		int [] CompNums = new int[6];
		// Populate array with random ints, then check to make sure there are no duplicates
		for (int i = 0; i < CompNums.length; i++) {
			CompNums[i] = rand.nextInt(37) + 1;
			for (int j = 0; j < CompNums.length; j++) {
				if (j == i) {continue;}
				if (CompNums[i] == CompNums[j]) {
					i--;
					break;
				}
			}
		}
//		for(int nums: CompNums) {
//			System.out.println(nums);
//		}
		return CompNums;
	}	
}
