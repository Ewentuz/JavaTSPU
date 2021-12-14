public class z16 {
	public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i < 4) {
          i++;
          if (i % 3 == 0) 
            break;
            sum += i;
        }
        System.out.println("вывод " + sum);
  }
}