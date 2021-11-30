package LAB7;

import java.util.Scanner;

public class Zadanie15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите x:");
        Double x = input.nextDouble();

        boolean b = (Math.abs(x - 5)) < (4.5);
        System.out.println("b = " + b);

        b = (x - 5) <= (4.5);
        System.out.println("b = " + b);

    }
}
