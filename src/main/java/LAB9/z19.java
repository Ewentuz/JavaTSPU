import java.util.Scanner;
public class z19 {
	public static void main(String[] args) {
	      String s1,s;
	      int low, high;
	      boolean is;
	      Scanner Scanner = new Scanner(System.in);
	      System.out.println("Введите строку без пробелов ");
	      s = Scanner.nextLine();
	      s1 = "";
	      low = 0;
	      high = s.length() - 1;
	      is =true;
	      while (high >= 0) {
	        s1 += s.charAt(high);
	        high--;
	      }
	      System.out.println(s1 + " Обратная срока!");
	}
}