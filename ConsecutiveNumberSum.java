/*
This program finds whether a given number can be expressed as the sum of two or
more consecutive natural numbers. If possible, the program should print all possible
combinations of consecutive natural numbers that sum up to the given number.
Program Owner -> Ojas Joshi
Date -> 09/09/2024
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConsecutiveNumberSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Constants.inputNumber);
        int number = scan.nextInt();
        System.out.print(Constants.desiredOutput);
        System.out.print(consecutiveNumberSum(number));
    }
    public static List<List<Integer>> consecutiveNumberSum(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int start = 1; start <= n / 2; start++) {
            int sum = 0;
            List<Integer> sequence = new ArrayList<>();
            for (int i = start; sum < n; i++) {
                sum += i;
                sequence.add(i);

                if (sum == n) {
                    if (sequence.size() > 1) {
                        list.add(sequence);
                    }
                    break;
                }
            }
        }

        return list;
    }
}
