package LAB7;

import java.util.Scanner;

public class Zadanie17 {

    public static void main(String[] args) {
        double weight, height, age;
        boolean b;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        age = input.nextDouble();

        System.out.print("Введите вес в килограммах: ");
        weight = input.nextDouble();

        System.out.print("Введите рост в метрах: ");
        height = input.nextDouble();

        b = (age < 13) && (age < 18);
        System.out.println("b - " + b);

        b = (weight > 23) || (height > 152);
        System.out.println("b - " + b);

        b = (weight > 23) ^ (height > 152);
        System.out.print("b - " + b);
    }
}
