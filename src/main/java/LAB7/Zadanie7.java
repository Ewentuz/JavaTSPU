package LAB7;

import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите пульс: ");
        int pulse = input.nextInt();
        if (pulse > 56) {
            System.out.print("Продолжайте тренироваться");
        } else {
            System.out.print("Ваше сердце в отличном состоянии");
        }
    }
}
