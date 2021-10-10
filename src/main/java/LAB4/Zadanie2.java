//Задание №2: Вычислить выражение 1 - 1/2 + 1/3 - 1/4 +...+ 1/9999 - 1/10000 используя оператор условия.
package LAB4;

/**
 *
 * @author Uroboros
 */
public class Zadanie2 {

    public static void main(String args[]) {
        double a = 0;
        for (double i = 1; i < 10001; i++) {
            if (i % 2 == 0) {
                a = a - (1 / i);
            } else {
                a = a + (1 / i);
            }
        }
        System.out.println("Ответ: " + a);
    }
}
