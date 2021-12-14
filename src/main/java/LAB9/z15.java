public class z15 {
	public static void main(String[] args) {
		int balance = 10;
        while (true) {
            if (balance < 9)
            break;
        balance = balance - 9;
        }
       System.out.println("Остаток равен " + balance);
	     System.out.println("---------------");
        
        balance = 10;
        while (true) {
          if (balance < 9)
          continue;
        balance = balance - 9;
        System.out.println("Остаток равен " + balance);
        }
	}
}