/*
Написать программу, которая будет выполнять следующие действия:

        1. Ввести три числа с клавиатуры x, y, z

        2. Найти и вывести в консоль среднее арифметическое этих чисел

        3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону

        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/

package com.max.idea;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        System.out.print("z = ");
        int z = in.nextInt();

        int[] myArray = {x,y,z};

        double a = (myArray[0]+myArray[1]+myArray[2])/myArray.length;
        System.out.printf("Среднее арифметическое = %f%n",a);

        double b = Math.floor(a/2);
        if (b>3)
            System.out.println("Программа выполнена корректно");


    }
}