/**
 * 
 */
package binaryConverter;

import java.util.Scanner;

/**
 * @author ryan_urq
 *
 */
public class Converter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Binary to Decimal converter");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a number and it will be converted into a binary number");
		
		int decimal = sc.nextInt();
		
		String binaryReversed = "";
		String binary = "";
		sc.nextLine();
		
		while (decimal > 0) {
			if (decimal%2 == 1) {
				binaryReversed += "1";
			}
			else {
				binaryReversed += "0";
			}
			decimal = decimal/2;
		}
		
		for (int i = 0;i < binaryReversed.length();i++) {
		
			binary = binaryReversed.charAt(i) + binary;
			
		}
		
		System.out.println(binary);
		sc.close();
		
	}

}
