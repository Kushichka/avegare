package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	test();
    }

    public static void test2(int a)
    {
        if(a > 100)
        {
            System.out.println("Число больше 100");
        }
        else
        {
            System.out.println("Число меньше 100");
        }
    }

    public static void test()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scan.nextInt();
        System.out.println("Введите второе число");
        int second = scan.nextInt();
        if(second <= first)
        {
            System.out.println("Второе число должно быть больше первого");
            return;
        }
        int sum = 0;
        int a = 0;
        int result;

        while(first <= second)
        {
            sum += first;
            first++;
            a++;
        }
        result = sum/a;
        System.out.println("Среднее арифметическое: " + result);
        test2(result);
    }
}
