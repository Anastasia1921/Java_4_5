package ru.myHomePack;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа");
        Scanner in = new Scanner(System.in);
        //1
        int a =in.nextInt();
        int b =in.nextInt();
        long  l = streamSum(a, b);
        System.out.printf("Сумма введенных чисел: %d\n", l);
        //2
        a = 10_000_000;
        b = 1_000_000_000;
        l = streamSum2(a, b);
        System.out.printf("Сумма чисел от 10000000 до 1000000000: %d\n", l);
    }
    // вариант 1
    public static long streamSum(int a, int b)
    {
        return LongStream.range(a, b).sum();
    }
    //вариант 2
    public static long streamSum2(int a, int b)
    {
        return LongStream.range(a, b).reduce(0, (x, y) -> x + y);
    }

}