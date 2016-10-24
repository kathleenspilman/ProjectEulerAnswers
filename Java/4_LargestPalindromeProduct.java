/*

4. Largest Palindrome Project

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

Source and copyright at: https://projecteuler.net/problem=4

*/

public class 4_LargestPalindromProject{


	public static void main (String [] args){
    
		int temp;
    int answer = 0;
   	int temp2 = 0;
   	int reverse;
      	for (int i = 999 ; i > 99 ; i--){
      		for (int j = 999 ; j > 99 ; j--){
             	reverse = 0;
          		answer = temp = j*i;
          		while(temp != 0 ){
           			reverse = reverse * 10;
                reverse = reverse + (temp%10);
          			temp = temp/10;
          		}
          		if( reverse == answer && answer >= temp2){
                	temp2 = answer;
                 	break;
          		}
           }  
        }
        System.out.println(temp2);
    }
}  
        
    
