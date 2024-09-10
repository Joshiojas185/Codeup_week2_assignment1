/*
This program  takes an unsorted array of digits and a series of integers. It encodes
the highest digits, based on the provided series, into their corresponding ASCII characters.
Program Owner -> Ojas Joshi
Date -> 09/09/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class EncodedASCII {
    public static void main(String[] args) {
        System.out.println(Constants.ENCODED_ASCII_OPERATION);
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.ARRAY_SIZE);
        int size = scan.nextInt();
        char[] arrayOfCharacter = new char[size];
        System.out.println(Constants.INPUT_ELEMENTS_OF_ARRAY);
        for (int i = 0; i < arrayOfCharacter.length; i++) {
            arrayOfCharacter[i] = scan.next().charAt(0);
        }
        System.out.println(Constants.INPUT_SERIES);
        int series = scan.nextInt();
        encodedASCII(arrayOfCharacter,series);
    }
    public static void encodedASCII(char[] arrayOfCharacter, int series){
        Arrays.sort(arrayOfCharacter);
        for(int i = 0 , j = arrayOfCharacter.length-1 ; i< arrayOfCharacter.length/2 ; i++ , j--) {
            char temp = arrayOfCharacter[i];
            arrayOfCharacter[i] = arrayOfCharacter[j];
            arrayOfCharacter[j] = temp;
        }
        StringBuilder result = new StringBuilder();
        String seriesString = String.valueOf(series);
        for(int i = 0; i < seriesString.length(); i++){
            int index = Character.getNumericValue(seriesString.charAt(i)) - 1;
            if (index >= 0 && index < arrayOfCharacter.length) {
                result.append((int)arrayOfCharacter[index]);
            }
        }
        System.out.println(result);
    }
}
