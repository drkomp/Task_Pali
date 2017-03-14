/**
 * Created by drkomp on 13.03.2017.
 */
public class Searching_two {
       public static void main (String[]args){
            long startTime = System.currentTimeMillis();
            int iterations = 0;
            System.out.println("Searching maximal palindrome number produced by multiplication of two 3 digits number...");
            SearchingPalindrome spInstance = new SearchingPalindrome();
            int maxNumOne = 0;
            int maxNumTwo = 0;
            int maxPalindrome = 0;
            int currentProduction;
            for (int numOne = 999; numOne > 99; numOne--) {

                for (int numTwo = numOne; numTwo > 99; numTwo--) {
                    currentProduction = numOne * numTwo;
                    iterations++;
                    if(maxPalindrome > currentProduction)break;
                    if (spInstance.isPalindrome(currentProduction)) {
                        if (maxPalindrome < currentProduction) {
                            maxPalindrome = currentProduction;
                            maxNumOne = numOne;
                            maxNumTwo = numTwo;
                        }
                    }
                }
            }
            System.out.println("Maximum palindrome number is: " + maxPalindrome);
            System.out.println("First multiplier is: " + maxNumOne);
            System.out.println("Second multiplier is: " + maxNumTwo);
            System.out.println("Time: " + (System.currentTimeMillis() - startTime));
            System.out.println("Iterations: " + iterations);
        }

        boolean isPalindrome(int someNumber){
            int reversed = 0;
            int tmp = someNumber;
            while (tmp>0){
                reversed = reversed*10 + tmp%10;
                tmp /= 10;
            }
            return someNumber == reversed;
    }
}
