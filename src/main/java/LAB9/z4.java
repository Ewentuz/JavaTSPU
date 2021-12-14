import java.util.Scanner;
public class z4
{
	public static void main(String[] args) {
	    int n, i, sum, f;
	    Scanner Scanner = new Scanner(System.in);
	    System.out.println("Введите целое число");
	    n = Scanner.nextInt();
	    i = 0;
	    sum = 0;
	    while (i <= n) {
	        sum = sum + i;
	        i += 1 ;
	    }
	    f = (n * (n + 1))/2;
	    if (sum == f) {
		    System.out.println(f + " = " + sum);
	    }
	}
}