//Создайте приложение, которое покажет, что для выражения a^n + b^n = c^n (теорема Ферма) нет натуральных решений от 1 до 100 и n>2.
//Убедитесь, что есть решения для n=2, и выведите их в консоль.
package LAB4;

/**
 *
 * @author Uroboros
 */
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите степень:");
        Double n = sc.nextDouble();
        for (double a = 1; a < 101; a++) {
            for (double b = 1; b < 101; b++) {
                if (Math.pow((Math.pow(a, n) + Math.pow(b, n)), 1 / n) % 1 == 0) {
                    System.out.println("a = " + a + " | b = " + b + " | c = " + Math.pow((Math.pow(a, n) + Math.pow(b, n)), 1 / n) + " | n = " + n);
                }
            }
        }
    }
}
