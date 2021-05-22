/* Daniel Eggers
 * CMPSCI-3130-001-FA2020
 * Project 1 - Empirical Analysis on Fibonacci Numbers 
 */

public class StraightforwardRecursive extends EmpAnaFibNum {
	
	/* main method launched by superclass */
	public static void run() {
		System.out.print("Running Recursive Algorithm:"
				+ "\n  Enter n for Fibonnaci calculation."
				+ "\n  >$"
		);
		
		int n = input.nextInt();	// n of Fn
		System.out.print("  Calculating...");
		long startTime = System.nanoTime();
		long output = fibo(n);  // start fibonacci algorithm
		System.out.println("  Done.");
		long elapsedTimeNS = (System.nanoTime() - startTime);
		long elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("  Result: " + output + ".");
		System.out.println("  The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("  Press Enter key to continue.");
		pressToContinue();
	}
	
	/* recursive fibonacci calculator, intentionally inefficient */
	public static long fibo(int _n) {
		if (_n <= 0) { 
			return 0;
		}
		if (_n == 1) {
			return 1;
		}
		//System.out.println("  adding term: " + _n);
		return ( fibo(_n-1) + fibo(_n-2) );
	}
}
