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
    public static void main (String args[]) {
        double a = 2;
        System.out.println("Введите степень для числа два:");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n == 0) System.out.print("Два в степени "+ n +" = " + 1);
        else{
            for (int i = 1; i < n+1;  i++){
                a = a * 2;
            }
            if (n>0) System.out.print("Два в степени "+ n +" = " + a);
            else System.out.print("Два в степени "+ n +" = " + 1/a);
        }
    }
}
