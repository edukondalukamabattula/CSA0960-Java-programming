package sumofnums;
import java.util.Scanner; 

public class SumOfNums {

	 // Class declaration
	    public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        int sum = 0;
	        int count = 0;

	        // Use a do-while loop to sum up 10 integers
	        do {
	            System.out.print("Enter an integer: ");
	            int num = console.nextInt();
	            sum += num; // Add the number to the sum
	            count++;    // Increment the count
	        } while (count < 10); // Continue until 10 integers are entered

	        // Print the total sum
	        System.out.println("The sum of the 10 integers is " + sum);

	        console.close(); // Close the scanner
	    }//end method main
	}//end class SumofNums
