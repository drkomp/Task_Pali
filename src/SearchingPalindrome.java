/**
 * Created by drkomp on 13.03.2017.
 */
public class SearchingPalindrome {
    public static void main(String[] args) {
        System.out.println("Searching maximal palindrome number produced by multiplication of two 3 digits number...");
        SearchingPalindrome spInstance = new SearchingPalindrome();
        int maxNumOne=0;
        int maxNumTwo=0;
        int maxPalindrome = 0;
        int currentProduction;
        for(int numOne = 999; numOne >0;numOne--){
            for(int numTwo = 999;numTwo >0;numTwo--){
                currentProduction = numOne*numTwo;
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
    }

    boolean isPalindrome(int SomeNumber){
        if (SomeNumber < 0 ) {throw new ArithmeticException("Number must be positive");}
        if (SomeNumber < 10) {return true;}
        int someNumLength = Integer.toString(SomeNumber).length();
        String partOneOfSomeNum = Integer.toString(SomeNumber).substring(0,someNumLength >>> 1);
        String partTwoOfSomeNum = new StringBuffer(Integer.toString(SomeNumber).substring((someNumLength >>> 1) + (someNumLength & 1))).reverse().toString();
        return partOneOfSomeNum.equals(partTwoOfSomeNum);
        //someNumLength >>> 1 is equivalent someNumLength/2
        //someNumLength & 1 is equivalent someNumLength%2

    }
}
