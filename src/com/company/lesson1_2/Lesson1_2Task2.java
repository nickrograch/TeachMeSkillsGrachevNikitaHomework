package com.company.lesson1_2;

import java.util.Scanner;

/**
 * 2) Треугольник существует только тогда, когда сумма любых двух его сторон
 * больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
 * стороны предполагаемого треугольника. Требуется сравнить длину каждого
 * отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
 * окажется больше суммы двух других, то треугольника с такими сторонами не
 * существует
 */
public class Lesson1_2Task2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the first side:");
        int firstSide = scanner.nextInt();

        System.out.println("Input the second side:");
        int secondSide = scanner.nextInt();

        System.out.println("Input the third side:");
        int thirdSide = scanner.nextInt();

        if ((firstSide + secondSide) > thirdSide && (firstSide + thirdSide) > secondSide
                && (secondSide + thirdSide) > firstSide){
            System.out.printf("Треугольник со сторонами %d, %d, %d существует", firstSide, secondSide, thirdSide);
        } else {
            System.out.printf("Треугольник со сторонами %d, %d, %d не существует", firstSide, secondSide, thirdSide);
        }
    }
}
