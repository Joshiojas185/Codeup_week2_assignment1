/*
This Program continuously takes a number as input and replaces it with the sum of
its digits until the number is reduced to a single digit.
Program Owner -> Ojas Joshi
Date -> 09/09/2024
 */
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.inputNumber);
        int number = scan.nextInt();
        System.out.print(Constants.desiredOutput);
        System.out.println(digitSumLoop(number));
    }
    public static int digitSumLoop(int number){
        String inputString = String.valueOf(number);
        if(inputString.length()==1){
            return number;
        }
        while(inputString.length() !=1){
            int result = 0;
         for(int i = 0;i<inputString.length();i++){
            result = result + Character.getNumericValue(inputString.charAt(i));
         }
         inputString = String.valueOf(result);
        }
        return  Integer.parseInt(inputString) ;
    }
}
