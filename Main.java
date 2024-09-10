/* The functions in this class are:
1. ValidParenthesesCombination.parenthesisCombination(String input): Generates all valid well-formed
   parentheses combinations from the input string.
2. DigitSum.validNumber(String numberToScan): Validates if the input string is a processable number.
3. DigitSum.digitSumLoop(int number): Computes the sum of digits in the given number using a loop.
4. ConsecutiveNumberSum.consecutiveNumberSum(int numberInput): Displays all consecutive number sums equal to the input.
5. CaesarCipher.caesarCipher(String inputString): Encodes the string using Caesar Cipher by shifting characters.
6. EncodedASCII.encodedASCII(char[] array, int series): Shifts the ASCII values of characters by the given series.

These methods provide operations like parentheses validation, digit sum calculation, string encoding, and ASCII manipulation.
Program Owner -> Ojas Joshi
Date -> 09/09/2024
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.WELCOME_MESSAGE);
        System.out.println(Constants.OPERATION_CHOICES);
        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.println(Constants.CHOOSE_OPERATION);
                String choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        //Generates all valid well-formed
                        //parentheses combinations from the input string.
                        System.out.println(Constants.PARENTHESIS_OPERATION);
                        System.out.println(Constants.INPUT_STRING);
                        String input = scan.nextLine();
                        String[] result = ValidParenthesesCombination.parenthesisCombination(input);
                        System.out.print(Constants.DESIRED_OUTPUT);
                        System.out.print("[");
                        for (int i = 0; i < result.length - 1; i++) {
                            System.out.print(result[i] + ",");
                        }
                        System.out.print(result[result.length - 1] + "]");
                        System.out.println(" ");
                        break;

                    case "2":
                        //Computes the sum of digits in the given number using a loop.
                        System.out.println(Constants.DIGIT_SUM_OPERATION);
                        System.out.println(Constants.INPUT_NUMBER);
                        String numberToScan = scan.nextLine();
                        if (DigitSum.validNumber(numberToScan)) {
                            int number = Integer.parseInt(numberToScan);
                            System.out.print(Constants.DESIRED_OUTPUT);
                            System.out.println(DigitSum.digitSumLoop(number));
                        } else {
                            System.out.println(Constants.INVALID_INPUT);
                        }
                        break;

                    case "3":
                        // Displays all consecutive number sums equal to the input.
                        System.out.println(Constants.CONSECUTIVE_NUMBER_SUM);
                        System.out.println(Constants.INPUT_NUMBER);
                        int numberInput = scan.nextInt();
                        scan.nextLine();
                        System.out.print(Constants.DESIRED_OUTPUT);
                        ConsecutiveNumberSum.consecutiveNumberSum(numberInput);
                        break;

                    case "4":
                        //Encodes the string using Caesar Cipher by shifting characters.
                        System.out.println(Constants.CAESAR_CIPHER_OPERATION);
                        System.out.println(Constants.INPUT_STRING);
                        String inputString = scan.nextLine();
                        System.out.print(Constants.ENCODED_STRING);
                        System.out.println(CaesarCipher.caesarCipher(inputString));
                        break;

                    case "5":
                        //Shifts the ASCII values of characters by the given series.
                        System.out.println(Constants.ENCODED_ASCII_OPERATION);
                        System.out.println(Constants.ARRAY_SIZE);
                        int size = scan.nextInt();
                        scan.nextLine();
                        char[] array = new char[size];
                        System.out.println(Constants.INPUT_ELEMENTS_OF_ARRAY);
                        for (int i = 0; i < array.length; i++) {
                            array[i] = scan.next().charAt(0);
                        }
                        System.out.println(Constants.INPUT_SERIES);
                        int series = scan.nextInt();
                        scan.nextLine();
                        System.out.print(Constants.DESIRED_OUTPUT);
                        EncodedASCII.encodedASCII(array, series);
                        break;

                    case "0":
                        System.out.println(Constants.EXIT_MESSAGE);
                        return;

                    default:
                        System.out.println(Constants.INVALID_INPUT);
                        break;
                }
            } catch (Exception e) {
                System.out.println(Constants.ERROR_HANDLING);
                scan.nextLine();
            }
        } while(true);
    }
}


