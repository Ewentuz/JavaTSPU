package LAB7;

import java.util.Scanner;

public class Zadanie14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое число:");
        Double num = input.nextDouble();

        boolean b = (num >= 1) && (num <= 100);
        System.out.println("b = " + b);

        b = ((num >= 1) && (num <= 100)) || (num < 0);
        System.out.println("b = " + b);
    }
}
