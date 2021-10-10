//Для произвольной цифры от 0 до 9 вывести на кон- соль ее значение прописью. Например, для цифры 9 на консоли должна быть напечатана строка «Девять
package LAB5;

/**
 *
 * @author Uroboros
 */
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру:");
        Integer n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            case 6:
                System.out.println("Шесть");
                break;
            case 7:
                System.out.println("Семь");
                break;
            case 8:
                System.out.println("Восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
        }
    }
}
