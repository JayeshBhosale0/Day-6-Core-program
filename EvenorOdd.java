package newProject;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		 int num;
		    System.out.println("Enter any number:");

		   
		    Scanner input = new Scanner(System.in);
		    num = input.nextInt();

		    if ( num % 2 == 0 )
		        System.out.println("number is even");
		     else
		        System.out.println("number is odd");
	}

}
