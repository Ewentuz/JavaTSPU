package LAB7;

import java.util.Scanner;

public class Zadanie12 {

    public static void main(String[] args) {
        final int SMS_PER_METER = 100;
        double weight, height, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Ведите вес в килограммах: ");
        weight = input.nextDouble();

        System.out.print("Ведите рост в метрах: ");
        height = input.nextDouble();

        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.print("Недостаточный вес");
        } else if (bmi < 25) {
            System.out.print("Норма");
        } else if (bmi < 30) {
            System.out.print("Избыточный вес");
        } else {
            System.out.print("Ожирение");
        }
    }
}
