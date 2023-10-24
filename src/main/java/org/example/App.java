package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Введите 2 целых числа");
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        System.out.println(Calc.sum(x, y));
    }
}
