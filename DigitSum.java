/*
This Program continuously takes a number as input and replaces it with the sum of
its digits until the number is reduced to a single digit.
Program Owner -> Ojas Joshi
Date -> 09/09/2024
 */
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(Constants.DIGIT_SUM_OPERATION);
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.INPUT_NUMBER);
        String numberToScan = scan.nextLine();
        if(validNumber(numberToScan)){
            int number = Integer.parseInt(numberToScan);
            System.out.print(Constants.DESIRED_OUTPUT);
            System.out.println(digitSumLoop(number));
        }
        else{
            System.out.println(Constants.INVALID_INPUT);
        }
    }
    public static int digitSumLoop(int number){
        String inputString = String.valueOf(number);
        if(inputString.length() == 1){
            return number;
        }
        while( inputString.length() !=1){
            int result = 0;
            for(int i = 0 ; i < inputString.length() ; i++){
                result = result + Character.getNumericValue(inputString.charAt(i));
            }
            inputString = String.valueOf(result);
        }
        return  Integer.parseInt(inputString) ;
    }
    public static boolean validNumber(String numberToScan){
        for(int i = 0 ; i < numberToScan.length() ; i++){
            if (!Character.isDigit(numberToScan.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
