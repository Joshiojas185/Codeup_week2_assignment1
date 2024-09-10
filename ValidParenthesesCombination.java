/*
This program is made to generates all valid combinations of the string pairs of
parentheses. Each combination should be unique and well-formed.
Program Owner -> Ojas Joshi
Date -> 09/09/2024
*/
import java.util.Scanner;
public class ValidParenthesesCombination {
    public static void main(String[] args) {
        System.out.println(Constants.PARENTHESIS_OPERATION);
        System.out.println(Constants.INPUT_STRING);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] result = parenthesisCombination(input);
        System.out.print(Constants.DESIRED_OUTPUT);
        System.out.print("[");
        for(int i = 0 ; i < result.length - 1 ; i++){
            System.out.print( result[i]  + ",");
        }
        System.out.print(result[result.length-1] + "]");
    }
    public static String[] parenthesisCombination(String input){

        StringBuilder spacedString = new StringBuilder();
        for(int i = 0;i < input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                spacedString.append(input.charAt(i));
            }
        }
        input = spacedString.toString();
        int n = input.length();
        String[] stringArray = new String[n + n*(n-1)];
        int index = 0;
        for(int i = 0 ; i < input.length(); i++){
            stringArray[index++] =  (Character.toString(input.charAt(i)));
        }
        for(int i = 0 ; i < input.length(); i++){
            for(int j = 0 ; j < input.length(); j++){
                if(i != j){
                    stringArray[index++] = (input.charAt(i) +
                            Character.toString(input.charAt(j)));
                }
            }
        }
        return stringArray;
    }
}

