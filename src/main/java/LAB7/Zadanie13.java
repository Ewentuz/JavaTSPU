package LAB7;

import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {
        int x = 1;
        boolean b = (true) && (3 > 4);
        System.out.println("b = " + b);

        b = !(x > 0) && (x > 0);
        System.out.println("b = " + b);

        b = (x > 0) || (x < 0);
        System.out.println("b = " + b);

        b = (x != 0) || (x == 0);
        System.out.println("b = " + b);

        b = (x >= 0) || (x < 0);
        System.out.println("b = " + b);

        b = (x != 1) == !(x == 1);
        System.out.println("b = " + b);
    }
}
