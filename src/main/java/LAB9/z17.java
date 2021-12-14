public class z17 {
	public static void main(String[] args) {
	      int sum=0, number=0;
	      boolean f = false;
	      while (number < 20 && !f) {
	        sum += number;
	        if (sum >= 100)
	         f = true;
	         else number ++;
	      }
        System.out.println("Число равно " + number);
        System.out.println("Сумма равна " + sum);
        System.out.println("------------------------------- ");
        
        sum=0; number=0;
	      while (number < 20) {
	        number++;
	        if (number == 10 || number == 11)
	        sum += 0;
	        else
        sum += number;
	      }
        System.out.println("Число равно " + number);
        System.out.println("Сумма равна " + sum);
	}
}