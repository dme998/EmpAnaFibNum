/* Daniel Eggers
 * CMPSCI-3130-001-FA2020
 * Project 1 - Empirical Analysis on Fibonacci Numbers 
 */

import java.math.BigInteger;

public class InterativeSolution extends EmpAnaFibNum {
	
	/* main method launched by superclass */
	public static void run() {
		System.out.print("Running Interative Algorithm:"
				+ "\n  Enter n for Fibonnaci calculation."
				+ "\n  >$"
		);
		
		BigInteger bnum1 = BigInteger.ZERO;  // previous number in sequence
		BigInteger bnum2 = BigInteger.ONE;  // next number in sequence
		int n = input.nextInt();  // n of Fn
		System.out.print("  Calculating...");
		long startTime = System.nanoTime();
		BigInteger output = fibo(bnum1, bnum2, n);  // start fibonacci algorithm
		System.out.println("  Done.");
		long elapsedTimeNS = (System.nanoTime() - startTime);
		long elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.printf("  Result: %d.%n", output);
		System.out.println("  The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("  Press Enter key to continue.");
		pressToContinue();
			
	}
	
	/* iterative fibonacci algorithm, efficient */
	public static BigInteger fibo(BigInteger _bnum1, BigInteger _bnum2, int _n) {	
		if (_n <= 1) {
			return BigInteger.valueOf(_n);
		}
		
		BigInteger bsum = BigInteger.ZERO; //initialize
		for(int i = 2; i <= _n; i++) {
			bsum = _bnum1;
			_bnum1 = _bnum2;
			_bnum2 = bsum.add(_bnum1);
		}
		
		return _bnum2;
	}
}
