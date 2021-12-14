import java.util.Scanner;
public class z11 {
	public static void main(String[] args) {
	    final int sen = -99;
	    int sum, sum1, score;
	    Scanner Scanner = new Scanner(System.in);
	    sum = 0;
	    sum1 = 0;
	    score = 0;
	    do {
	        System.out.println("Введите первое число = ");
	        sum = Scanner.nextInt();
	        System.out.println("Введите второе число = ");
	        sum1 = Scanner.nextInt();
	    } while ((sum % sum1 != 0) && (sum1 % sum != 0));
	      System.out.println("Выход!");
	}
}