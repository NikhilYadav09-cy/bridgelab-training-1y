package com.gla.practice;

public class Replacezero {
    public static void main(String[] args) {
        int num = 102030;
        String str = Integer.toString(num);
        String replacedStr = str.replace('0', '1');
        int result = Integer.parseInt(replacedStr);
        System.out.println("Original: " + num);
        System.out.println("Result: " + result);
    }
}
