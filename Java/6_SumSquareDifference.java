/* 
6. Sum Square Difference

The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

Source and copyright at: https://projecteuler.net/problem=6

*/

public class 6_SumSquareDifference{

	public static void main(String args[]) {
	
    		int a = 0;
    		int b = 0;
    		for (int i = 1; i <= 100; i++){
        			a += (i * i);
    		}
    		for (int j = 1; j <=100; j++){
        			b += j;
    		}
    		b = (b*b);
    		System.out.println(b-a);
	}
}
