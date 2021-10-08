package com.company.lesson1_2;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * 1) В переменную записываем число. Надо вывести на экран сколько в этом
 * числе цифр и положительное оно или отрицательное. Например, "это
 * однозначное положительное число". Достаточно будет определить, является ли
 * число однозначным, "двухзначным или трехзначным и более.
 */
public class Lesson1_2Task1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int forCheck;

        System.out.println("Введите число: ");
        forCheck = scanner.nextInt();

        if(forCheck < 0){
            System.out.print("Число отрицательное, ");
        } else if(forCheck > 0) {
            System.out.print("Число положительное, ");
        } else {
            System.out.println("Число 0");
        }

        if (abs(forCheck) > 9 && abs(forCheck) < 100) {
            System.out.println("двухзначное.");
        } else if (abs(forCheck) < 10) {
            System.out.println("однозначное.");
        } else {
            System.out.println("трехзначное и более.");
        }
    }
}
