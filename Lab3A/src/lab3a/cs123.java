package lab3a;
import java.util.Scanner ;


public class cs123 {

	public static void main(String[] args) {
        
		//Prompt for user to enter first and last name
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String a=input.next();
		System.out.print("Enter the last name: ");
		String b=input.next();
		
		//Strings to concatenate using + operator
		
		String c=a+" "+""+b;
		
		//Using charAt() method to get the 3rd character in the string
		
		char d = c.charAt(2);
		
		//Determines the length of the string using the length() method
		
		int e = c.length();
		
		//Results

		System.out.println("The concatenated string is: " +c);
		System.out.println("The length of the concatenated string is: " +e);
		System.out.println("3rd character of the concatenated string: " +d);
  }

}
