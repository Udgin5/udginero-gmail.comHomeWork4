package com.udgin.honework;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */

public class HomeWork41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        int result = sum(number);
        System.out.println("Сумма цифр введённого пользователем целого числа = " + result);
    }

    public static int sum(int number) {
        int result = 0;
        for (int i = number; i != 0; i /= 10) {
            result += i % 10;
        }
        return result;
    }
}

