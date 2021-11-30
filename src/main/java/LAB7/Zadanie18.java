package LAB7;

import java.util.Scanner;

public class Zadanie18 {

    public static void main(String[] args) {
        int age, ticketPrice;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        age = input.nextInt();

        ticketPrice = (age >= 16) ? 20 : 10;

        System.out.print("Цена билета: " + ticketPrice);
    }
}
