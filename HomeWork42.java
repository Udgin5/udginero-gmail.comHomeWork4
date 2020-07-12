package com.udgin.honework;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 * Решить одним способам: с помощью цикла
 */

public class HomeWork42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        Fibonacci(number);
    }

    public static void Fibonacci(int number) {
        int f1 = 1;
        int f2 = 1;
        int FibonacciNumber;
        if (number == 1) {
            System.out.println("0");
        } else if (number == 0) {
            System.out.println("чисел Фибоначчи, меньше 0, не существует");
        } else System.out.println("0 " + f1 + " " + f2 + " ");
        for (int i = 3; i <= number; i++) {
            FibonacciNumber = f1 + f2;
            f1 = f2;
            f2 = FibonacciNumber;
            if (FibonacciNumber < number) {
                System.out.print(FibonacciNumber + " ");
            } else break;
        }
        System.out.println();
    }
}








