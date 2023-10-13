import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		//talking input string
		System.out.print("Enter input string : ");
		String inputString = new Scanner(System.in).next();
		
		//initializing output string
		String outputString = "";
		
		//for loop runs till the inputString length
		for(int i = 0; i < inputString.length(); i++) {
			
			//we will append the char to the outputString according to the condition in the ternary operator
			outputString += (Character.isUpperCase(inputString.charAt(i)))
					        ?((inputString.charAt(i) == 'A')?'Y'
						     :(inputString.charAt(i) == 'B')?'Z'
						     :(char)(inputString.charAt(i)-2))
						    :((inputString.charAt(i) == 'a')?'y'
						     :(inputString.charAt(i) == 'b')?'z'
						     :(char)(inputString.charAt(i)-3));
		}
		
		//display output
		System.out.println("Output String : "+ outputString);
	}

}