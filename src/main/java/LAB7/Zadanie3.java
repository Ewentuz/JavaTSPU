package LAB7;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите число: ");
        int y = input.nextInt();
        int x;
        if (y > 0) {
            x = 1;
            System.out.print("x = " + x);
        } else {
            System.out.print("y < 0, введите число больше 0!");
        }
    }
}
