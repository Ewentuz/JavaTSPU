package LAB7;

import java.util.Scanner;

public class Zadanie16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите x:");
        Double x = input.nextDouble();

        boolean b = (x >= 50) && (x <= 100);
        System.out.println("b = " + b);

    }
}
