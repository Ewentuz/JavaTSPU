package LAB8;

import java.util.Scanner;

public class z16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите число");
        Integer i = input.nextInt();
        String num = "";
        String s = num + i;
        s = s.trim();

        System.out.println("Длина строки S=" + s.length());
    }
}
