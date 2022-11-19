package lottery_project;

import java.util.Random;
import java.util.Scanner;

public class NumberSelection {

	public static int[] GetUserNums() {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int[] UserNums = new int[6];
		System.out.println("Please input your lottery numbers between 1 and 38 inclusive");
		for(int i = 0; i < UserNums.length;i++) {
			while (check == true){
				System.out.println("\n\nInput number " + (i+1));
				try {
					UserNums[i] = sc.nextInt();
				} catch(Exception e) {
					System.out.println("Please enter and integer, not anything else. Thank you.");				
				}
				if (UserNums[i] < 38 & UserNums[i] > 0) {
					check = false;
				}
				else {
					System.out.println("The number you have entered is not in \nthe boundaries, 1 - 38"
							+ " please try again");
				}
				sc.nextLine();
			}check = true;
			
		}
		sc.close();
		return UserNums;
	}
	
	public static int[] GetCompNums() {
		
		Random rand = new Random();
		int [] CompNums = new int[6];
		for (int i = 0; i < CompNums.length; i++) {
			CompNums[i] = rand.nextInt(37) + 1;
		}
		for(int nums: CompNums) {
			System.out.println(nums);
		}
		return CompNums;
	}	
}
