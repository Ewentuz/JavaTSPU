/*
 *С помощью цикла вычислите значение выражения 2^n
 */
package LAB3;

/**
 *
 * @author Uroboros
 */
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String args[]) {
        double a = 2;
        System.out.println("Введите степень для числа два:");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n < 0) {
            for (int i = 1; i < (n *-1); i++) {
                a = a * 2;
            }
            System.out.println("Два в степени" + n + " = " + 1 / a);
        } else {
            for (int i = 1; i < n; i++) {
                a = a * 2;
                System.out.println("Два в степени" + n + " = " + a);
            }
        }
    }
}
