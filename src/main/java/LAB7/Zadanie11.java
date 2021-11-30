package LAB7;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " четное");
        }
        if (number % 5 == 0) {
            System.out.println(number + " кратно 5");
        }
    }
}
