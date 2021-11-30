package LAB7;

import java.util.Scanner;

public class Zadanie10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите count: ");
        int count = input.nextInt();
        boolean newLine = count % 10 == 0;
        System.out.print("newLine = " + newLine);
    }
}
