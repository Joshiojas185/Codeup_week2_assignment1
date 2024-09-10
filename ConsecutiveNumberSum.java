/*
This program finds whether a given number can be expressed as the sum of two or
more consecutive natural numbers. If possible, the program should print all possible
combinations of consecutive natural numbers that sum up to the given number.
Program Owner -> Ojas Joshi
Date -> 09/09/2024
 */
import java.util.Scanner;

public class ConsecutiveNumberSum {
    public static void main(String[] args) {
        System.out.println(Constants.CONSECUTIVE_NUMBER_SUM);
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.INPUT_NUMBER);
        int number = scan.nextInt();
        System.out.print(Constants.DESIRED_OUTPUT);
        consecutiveNumberSum(number) ;
    }
    public static void consecutiveNumberSum(int number){
        int sum = 0;
        System.out.println(" ");
        for(int i = 1 ; i < number ; i++){
            for(int j = i ; j < number ; j++){
                sum = sum + j ;
                if(sum > number){
                    break;
                }
                else if(sum == number){
                    System.out.print("[");
                    for(int k = i; k < j ; k++ ){
                        System.out.print(k+"+");
                    }
                    System.out.print(j +"]");
                    System.out.println(" ");
                }
            }
            sum = 0;
        }
    }

}
