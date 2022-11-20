/**
 * 
 */
package lottery_project;

/**
 * @author ryan_urq
 *
 */
public class FinalResults {

	public static void resultsChecker(int check) {
		
		System.out.println("\n\nFinal Results: \nYou had " + check + " matches");
		
		switch(check) {
		
		case(0):
			System.out.println("You have dishonoured your cow");
			break;
			
		case(1):
			System.out.println("You have dishonoured your ansestors");
			break;
		
		case(2):
			System.out.println("Not bad, but not great");
			break;
			
		case(3):
			System.out.println("Not bad, pretty okay!");
			break;
			
		case(4):
			System.out.println("Pretty good, only two wrong");
			break;
			
		case(5):
			System.out.println("Ohh, almost had them all right!");
			break;
			
		case(6):
			System.out.println("Well done");
			break;
		
		default:
			System.out.println("You have ended up in the no-mans-land of code, "
					+ "please be better in future.");
		
		}
		
	}
	
}
