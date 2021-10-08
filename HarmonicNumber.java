package newProject;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the Harmonic number : ");
	      int noOfTerms = scanner.nextInt();
	        double sum = 0.0;
	        for (int a = 1; a <= noOfTerms; a++) {
	         sum = sum + 1.0 / a;
	     }
	        System.out.println("Sum of Harmonic Series is : ");
	     System.out.println(sum);

	}

}
