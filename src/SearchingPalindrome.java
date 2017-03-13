/**
 * Created by drkomp on 13.03.2017.
 */
public class SearchingPalindrome {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int iterations = 0;
        System.out.println("Searching maximal palindrome number produced by multiplication of two 3 digits number...");
        SearchingPalindrome spInstance = new SearchingPalindrome();
        int maxNumOne=0;
        int maxNumTwo=0;
        int maxPalindrome = 0;
        int currentProduction;
        for(int numOne = 999; numOne >99;numOne--){
            for(int numTwo = 999;numTwo >99;numTwo--){
                currentProduction = numOne*numTwo;
                iterations++;
                if(spInstance.isPalindrome(currentProduction)){
                    if(maxPalindrome < currentProduction){
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
        System.out.println("Time: "+(System.currentTimeMillis() - startTime));
        System.out.println("Iterations: "+ iterations);
    }

    boolean isPalindrome(int SomeNumber){
        if (SomeNumber < 0 ) {throw new ArithmeticException("Number must be positive");}
        return Integer.toString(SomeNumber).equals(new StringBuffer(Integer.toString(SomeNumber)).reverse().toString());
    }


}
