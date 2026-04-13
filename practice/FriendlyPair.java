package com.gla.practice;

import java.util.Scanner;

public class FriendlyPair {
    static int getSumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = getSumOfDivisors(num1);
        int sum2 = getSumOfDivisors(num2);
        if (sum1 * num2 == sum2 * num1) {
            System.out.println(num1 + " and " + num2 + " are friendly pairs.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not friendly pairs.");
        }
        sc.close();
    }
}
