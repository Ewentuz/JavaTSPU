package LAB7;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите producte: ");
        Double producte = input.nextDouble();
        System.out.print("Ведите x: ");
        Double x = input.nextDouble();
        if (x != 0) {
            producte = producte * x;
        }
        System.out.print("Producte = " + producte);
    }
}
