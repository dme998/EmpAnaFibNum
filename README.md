# Empirical Analysis on Fibonacci Numbers
CMPSCI-3130-001-FA2020 <br> 
Instructor: Dr. Wenjie He <br>
Author: Daniel Eggers <br>
Date: March 16, 2020

## Description
In this project, we compare two algorithms for the Fibonacci Numbers to understand the power of an efficient algorithm. 
The first algorithm is the straightforward recursive algorithm. 
This algorithm contains too much redundant computation, and as a result is extremely inefficient. 
The second algorithm removes all the redundant computation and calculates the Fibonacci numbers iteratively. 

Upon running the program, the user will select one of three options:
* Use Straightforward Recursion to calculate F(n)
* Find n(max), overflow limit
* Use Iterative Solution to calculate F(n) using BigInteger


### Original Specification
In order to get conclusions on various aspects, you may need to write several programs based on the following requirements.

1. (Determine an appropriate problem size for the first method)
Since the first algorithm is extremely slow, it takes too long to calculate a Fibonacci
number of relatively large size. In our first program, we will pass the problem size
(the number n for the Fibonacci number Fn) as a command-line argument. When
you calculate the number, also record the execution time (in seconds) and display
it in the console.
When you do experiments, find the size number n0, such that your execution time
for Fn0
is approximately 1 minute (i.e. 60 seconds) on your machine. Then if the
command-line argument is missing, you use this n0 as the default problem size.
Note: In order to avoid overflow in your calculation, you may need to use the long
integer data type instead of the int data type.
2. (Determine the largest problem size for the long integers)
Even we use the long integers, we will quickly get an overflow when we reach certain
problem size. Write your second program to find that approximate largest problem
size nmax such that Fnmax is still good (without overflow). But if n > nmax, it is
likely to get an overflow.  
Note: Do not use multiple experiments to find this number: nmax. Calculate this
number directly. You can use the formula for the Fibonacci numbers (in terms of
the Golden Ratio) and logarithms for this calculation.
3. (See the huge difference of an efficient algorithm)
Write our third program to implement the efficient algorithm (the iterative solution). When you write the code, try to reduce the storage space by using a few
variables instead of an array in your iterative algorithm (optional, not required).
Since this algorithm is extremely fast, even when you reach that nmax size, the execution time may still be greatly less than one millisecond. To see how large the
problem size this algorithm can handle, we need to go to a much larger data type in
this situation. In Java, we can use BigInteger class to do the calculation. When
you print the execution time, use the number of milliseconds. See how much time
you need to calculate F10000.
You still pass the problem size n as the command-line argument. If n is not provided, use the default value n = 100.

For each of your program, write appropriate messages for the users to understand
what you are doing
