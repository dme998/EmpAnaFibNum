/* Daniel Eggers
 * CMPSCI-3130-001-FA2020
 * Project 1 - Empirical Analysis on Fibonacci Numbers 
 */

public class FindLargestProblemSize extends EmpAnaFibNum {
	
	/* main method launched by superclass */
	public static void run() {
		System.out.println("Finding nmax:");
		long num1 = 0;  // previous number in sequence
		long num2 = 1;  // next number in sequence
		int n = 0;		// nth integer of Fn, increases to max value that n can reach before overflow
		
		System.out.print("  Calculating...");
		while( !checkOverflow(num1, num2) ) {
			long sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			//System.out.println("  " + sum);
			++n;
		}
		System.out.println("  Done.\n  nmax is " + n + ".\n  Overflow occurs at " + (n + 1) + ".");
		System.out.println("  Press Enter to continue.");
		pressToContinue();
	}
	
	/* returns true if overflow occurs */
	public static boolean checkOverflow(long _num1, long _num2) {
		long _sum = _num1 + _num2;
		if ( 0 < _sum && _sum < Long.MAX_VALUE) {
			return false;
		}
		else {
			return true;
		}
	}
}
