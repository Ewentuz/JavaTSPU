package LAB7;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите score: ");
        Double score = input.nextDouble();
        Double pay = score;
        if (score > 90) {
            pay = score * 1.03;
        }
        System.out.print("Pay = " + pay);
    }
}
