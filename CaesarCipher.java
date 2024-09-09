/*
This program implements the Caesar Cipher encryption technique
but with a twist. The program should take an input string and a shift pattern array. For
each character in the string, apply the corresponding shift value from the pattern array. If
the pattern array length is shorter than the input string, repeat the pattern.
Program owner -> Ojas Joshi
Date -> 09/09/2024
 */
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(Constants.inputString);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.print(Constants.encodedString);
        System.out.println(caesarCipher(input));
    }
    public static String caesarCipher(String input) {
        StringBuilder output = new StringBuilder();
        int shift = 1;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                shift--;
                output.append(ch);
            } else {
                char shiftedCharacter = ch;

                if ((shift) % 3 == 1) {
                    shiftedCharacter = (char) (ch + 1);
                } else if ((shift) % 3 == 2) {
                    shiftedCharacter = (char) (ch + 2);
                } else if ((shift) % 3 == 0) {
                    shiftedCharacter = (char) (ch + 3);
                }


                if (ch >= 'a' && ch <= 'z' && shiftedCharacter > 'z') {
                    shiftedCharacter = (char) (shiftedCharacter - 26);
                }


                if (ch >= 'A' && ch <= 'Z' && shiftedCharacter > 'Z') {
                    shiftedCharacter = (char) (shiftedCharacter - 26);
                }

                output.append(shiftedCharacter);
            }

            shift++;
        }

        return output.toString();
    }
}