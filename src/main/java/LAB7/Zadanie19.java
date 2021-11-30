package LAB7;

import java.util.Scanner;

public class Zadanie19 {

    public static void main(String[] args) {
        Double x, score, income, number, tax, scale;
        Scanner input = new Scanner(System.in);
        int i = 1, j = 0;
        System.out.println("Введите x");
        x = input.nextDouble();

        System.out.println("Введите scale");
        scale = input.nextDouble();

        System.out.println("Введите income");
        income = input.nextDouble();

        System.out.println("Введите number");
        number = input.nextDouble();

        if (x > 10) {
            score = 3 * scale;
        } else {
            score = 4 * scale;
        }
        System.out.println("score = " + score);

        if (income > 10000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.17 + 1000;
        }
        System.out.println("tax = " + tax);

        if (number % 3 == 0) {
            System.out.println("i = " + i);
        } else {
            System.out.println("j = " + j);
        }
    }
}
