/*

7. 10001st Prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

Source and copyright at: https://projecteuler.net/problem=7

*/
public class 7_10001stPrime{
  
public class HelloWorld{
  public static void main (String []args){
    
    int count = 1;
    int number = 20;
    int answer = 0;
    boolean prime = true;
    System.out.println("count: " + count + " number: " + number + " answer: " + answer + " prime: " + prime);
    for (int i = 3; count <= number; i++){
      for (int j = 2; j < i; j++){
        if ((i % j) == 0){
          prime = false;
          System.out.println("count: " + count + " number: " + number + " answer: " + answer + " prime: " + prime);
          break;
        }
      }
      if (prime == true){
        answer = i;
        count++;
        System.out.println("count: " + count + " number: " + number + " answer: " + answer + " prime: " + prime);
      }
    }
    System.out.println(answer);
  }
}
