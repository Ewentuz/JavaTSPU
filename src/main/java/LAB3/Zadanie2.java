/*
 * Составьте программу расчета факториала для произвольного числа n<10.
 */
package LAB3;

/**
 *
 * @author Uroboros
 */
import java.util.Scanner;
public class Zadanie2 {
    public static void main (String args[]) {
        System.out.println("Введите произвольное число <10 для нахождения его факториала:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = 1;
        for (int i = 1; i < n+1; i++){
            fac = fac * i;
        }
        System.out.println("Факториал числа "+ n +" = "+fac);
    }
}
