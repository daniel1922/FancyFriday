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
		
		String inputContinue;
		boolean userContinue=true;	
		// Get input from the user
			Scanner input = new Scanner(System.in);
			
			
		while(userContinue){	
			System.out.println("Is it fancy Friday?");
			inputFancyFriday = input.nextLine(); //whatever users types gets inputed going to to next line
			
			System.out.println("Is it sunny?");
			inputSunny = input.nextLine();
			
			System.out.println("Is it raining?");
			inputRaining = input.nextLine();
			
			//Test if the variables are working properly
			//System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRaining +" ");
			
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
			//System.out.println(fancyFriday + " " + sunny + " " + raining +" ");
			
		// use if statement to decide what to wear
			if(fancyFriday){
				if(sunny){
					System.out.println("tea gown");
				} else if(raining){
					System.out.println("long gown");
				} else {
				}	System.out.println("power suit");
			} else {
				System.out.println("tshirt and jeans");
			}
		//Ask if you want to continue
			System.out.println("Continue?"); //Asking user if they want to continue
			inputContinue = input.nextLine(); //Taking input from scanner and assigning it 
			if(inputContinue.equals("yes")){ //looking for user response
				userContinue = true;
			} else {
				userContinue = false;
			}
		}//close while loop here	
	}

}
