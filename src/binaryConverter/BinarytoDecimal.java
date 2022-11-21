/**
 * 
 */
package binaryConverter;


import java.util.Scanner;
/**
 * @author ryan_urq
 *
 */
public class BinarytoDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the decimal to binary converter");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input the binary number");
		
		String binary = sc.nextLine();
		
		int decimal = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			int adder = 1;
			if (binary.charAt(i) == '1') {
				for (int j = 1; j <= i; j++) {
					adder *= 2;
				}
			}
			decimal += adder;
		}
		System.out.println(decimal);
		sc.close();
	}

}
