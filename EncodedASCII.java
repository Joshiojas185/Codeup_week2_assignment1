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
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.arraySize);
        int size = scan.nextInt();
        char[] array = new char[size];
        System.out.println(Constants.inputElementsOfArray);
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.next().charAt(0);
        }
        System.out.println(Constants.inputSeries);
        int series = scan.nextInt();
        encodedASCII(array,series);
    }
    public static void encodedASCII(char[] arr, int series){
        Arrays.sort(arr);
        for(int i = 0,j=arr.length-1;i< arr.length/2 ;i++,j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        StringBuilder result = new StringBuilder();
        String seriesString = String.valueOf(series);
        for(int i = 0; i < seriesString.length(); i++){
            int index = Character.getNumericValue(seriesString.charAt(i)) - 1;
            if (index >= 0 && index < arr.length) {
                result.append((int)arr[index]);
            }
        }

        System.out.println(result);
    }


}
