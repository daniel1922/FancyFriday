import java.util.Scanner;

/**
 * 
 */
/**
 * @author Daniel
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFancyFriday, inputSunny, inputRaining;
		boolean fancyFriday = false;
		boolean sunny = false;
		boolean raining = false;
		// Get input from the user
			Scanner input = new Scanner(System.in);
			System.out.println("Is it fancy Friday?");
			inputFancyFriday = input.nextLine(); //whatever users types gets inputed going to to next line
			
			System.out.println("Is it sunny?");
			inputSunny = input.nextLine();
			
			System.out.println("Is it raining?");
			inputRaining = input.nextLine();
			
			//Test if the variables are working properly
			System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRaining +" ");
			
		// Set condition variables based on input
			if(inputFancyFriday.equalsIgnoreCase("yes")){
				fancyFriday = true;
			}
			if(inputSunny.equalsIgnoreCase("yes")){
				sunny = true;
			}
			if(inputRaining.equalsIgnoreCase("yes")){
				raining = true;
			}
			//Test if the variables are working properly
			System.out.println(fancyFriday + " " + sunny + " " + raining +" ");
			
		// use if statement to decide what to wear
	}

}
