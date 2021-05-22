/* Daniel Eggers
 * CMPSCI-3130-001-FA2020
 * Project 1 - Empirical Analysis on Fibonacci Numbers 
 */

import java.util.Scanner;

public class EmpAnaFibNum {
	
	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		printHeader();
		int choice = 0;  		 // main menu selection
		boolean bigloop = true;  // main menu loop
		
		do {
			System.out.println("[MAIN MENU]\nSelect Program:"
					+ "\n[0] Exit"
					+ "\n[1] Use Straightforward Recursion to calculate F(n)"
					+ "\n[2] Find n(max), overflow limit"
					+ "\n[3] Use Iterative Solution to calculate F(n) using BigInteger"
			);
			System.out.print("$>");
			choice = input.nextInt();
			
			switch (choice) {
			case 0:
				exitProgram();
				break;
			case 1:
				StraightforwardRecursive.run();
				break;
			case 2:
				FindLargestProblemSize.run();
				break;
				
			case 3:
				InterativeSolution.run();
				break;
	
			default:
				System.out.println();
				input.nextLine();
				break;
			}
		}while(bigloop);

	}	
	
	public static void exitProgram() {
		input.close();
		System.out.println("\nNormal program termination.");
		System.exit(0);
	}
	
	/* Pauses program and waits for Enter */
	protected static void pressToContinue() { 
	    try {
	    	System.in.read();
	    	System.in.skip(System.in.available());
	    }catch(Exception e) {}  
	}
	
	/* About info */
	public static void printHeader() {
		System.out.println("EMPIRICAL ANALYSIS OF FIBONACCI NUMBERS.");
		System.out.println("Author: Daniel Eggers");
		System.out.println("Class: CMPSCI-3130-001-FA2020");
		System.out.println("Instructor: Wenjie He");
		System.out.println();
	}

}
