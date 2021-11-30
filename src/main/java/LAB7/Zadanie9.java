package LAB7;

import java.util.Scanner;

public class Zadanie9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите x: ");
        int x = input.nextInt();
        System.out.print("Ведите y: ");
        int y = input.nextInt();
        if (x > 2) {
            if (y > 2) {
                int z = x + y;
                System.out.println("z равен " + z);
            } else {
                System.out.println("x равен " + x);
            }
        }
    }
}
