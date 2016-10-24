/*

3. Largest Prime Factor

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

Source and copyright at: https://projecteuler.net/problem=3

*/

import java.lang.Math;
public class 3_LargestPrimeFactor{
	public static void main(String []args){
    	long number = 600851475143L;
    	long answer;
    	boolean k = true;
    	boolean stop = true;
    	int i = 2;
        do{
            if ((number % i) == 0){
                answer = number / i;
                for (int j = 2; j <= Math.sqrt(answer); j++){
                    if ((answer % j) == 0){
                        k = false;
                    }
                }
                if (k == true){
                    System.out.println(answer);
                    stop = false;
                }
            }
        i++;  
        k = true;
    	} while (stop == true);
	 }
}	

