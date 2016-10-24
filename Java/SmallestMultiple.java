/*
5. Smallest Multiple
 
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class SmallestMultiple{
	public static void main(String args[]) {
        boolean j = true;
        for (int num = 1; ; num++){
            for (int i = 1; i <=20; i++){
                if ((num%i) != 0){
                    j = false;
                }
            }
            if (j == true){
                System.out.println(num);
                break;
            }
            j = true;
        }
    }
}
// Answer = 23,279,250
 
