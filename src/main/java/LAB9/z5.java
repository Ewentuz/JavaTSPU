public class z5
{
	public static void main(String[] args) {
	    int odd, sum;
	    int n = 8;
	    sum = 0;
        for (odd = 1; odd < n; odd += 2) {
          sum += odd;
          System.out.println("sum = " + sum + "; odd = " + odd);
        }
	}
}