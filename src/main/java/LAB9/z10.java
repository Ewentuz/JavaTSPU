import java.util.Scanner;
public class z10 {
	public static void main(String[] args) {
	    final int sen = -99;
	    int sum, sum1, score;
	    Scanner Scanner = new Scanner(System.in);
	    //System.out.println("Введите целое число");
	    //int n = Scanner.nextInt();
	    sum = 0;
	    sum1 = 0;
	    score = 0;
	    while (score != sen) {
	        System.out.println("Введите число или " + sen + " для выхода: ");
	        score = Scanner.nextInt();
	        if (score >= 0) sum += score;
	        if (score < 0 && score != sen) sum1 += score;
	    }
	    System.out.println("Сумма полож = " + sum + " Сумма отр = " + sum1);
        
	}
}