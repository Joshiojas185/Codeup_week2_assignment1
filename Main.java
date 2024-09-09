/*
Through this class, we can toggle all the other classes and their functions
Program Owner -> Ojas Joshi
Date -> 09/09/2024
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.welcome);
        System.out.println(Constants.operationChoices);
        while(true){
            String choice = scan.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.println(Constants.parenthesisOperation);
                    System.out.println(Constants.inputString);
                    String input = scan.nextLine();
                    String[] result = ValidParenthesis.parenthesisCombination(input);
                    System.out.print(Constants.desiredOutput);
                    System.out.print("[");
                    for (int i = 0; i < result.length - 1; i++) {
                        System.out.print(result[i] + ",");
                    }
                    System.out.print(result[result.length - 1] + "]");
                }
                case "2" -> {
                    System.out.println(Constants.digitSumOperation);
                    System.out.println(Constants.inputNumber);
                    int number = scan.nextInt();
                    System.out.print(Constants.desiredOutput);
                    System.out.println(DigitSum.digitSumLoop(number));
                }
                case "3" -> {
                    System.out.println(Constants.consecutiveNumberSum);
                    System.out.println(Constants.inputNumber);
                    int numberInput = scan.nextInt();
                    System.out.print(Constants.desiredOutput);
                    System.out.print(ConsecutiveNumberSum.consecutiveNumberSum(numberInput));
                }
                case "4" -> {
                    System.out.println(Constants.caesarCipherOperation);
                    System.out.println(Constants.inputString);
                    String inputString = scan.nextLine();
                    System.out.print(Constants.encodedString);
                    System.out.println(CaesarCipher.caesarCipher(inputString));
                }
                case "5" -> {
                    System.out.println(Constants.encodedASCIIoperation);
                    System.out.println(Constants.arraySize);
                    int size = scan.nextInt();
                    char[] array = new char[size];
                    System.out.println(Constants.inputElementsOfArray);
                    for (int i = 0; i < array.length; i++) {
                        array[i] = scan.next().charAt(0);
                    }
                    System.out.println(Constants.inputSeries);
                    int series = scan.nextInt();
                    EncodedASCII.encodedASCII(array, series);
                }
                case "0" -> {
                    System.out.println(Constants.exit);
                }
                default -> System.out.println(Constants.invalidInput);
            }
            if(choice.equals("0")){
                break;
            }
        }
    }
}
