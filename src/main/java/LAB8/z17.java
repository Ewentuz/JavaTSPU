package LAB8;

import java.util.Scanner;

public class z17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите число");
        Double i = input.nextDouble();
        String num = "";
        String s = num + i;
        s = s.trim();

        System.out.println("Длина строки S=" + s.length());
    }
}
