import java.util.Scanner;

public class Project {
  public static void main(String[] args) {
    final double ROUBLES_PER_DOLLAR = 72.12;
    double cursCD, rubles;
    int digit, amDollrs, n;
    
    Scanner input = new Scanner(System.in);
    do {
      System.out.print("Введите корректное количесвто операций: ");
      n = input.nextInt();
    } while(n <= 0);
    for(int i = 0 ; i < n; i++) {
    System.out.print("Введите сумму в американских долларах:");
        amDollrs = input.nextInt();
    
    System.out.print(amDollrs);
      if (5 <= amDollrs && amDollrs <=20)
        System.out.print(" американских доллоров равны ");
          else {
            digit =  amDollrs % 10;
            if (digit == 1)
             System.out.println(" американский доллор равен ");
             else if(2 <= digit && digit <= 4)
                System.out.println(" американских доллора равны ");
             else
                System.out.println(" американских доллоров равны ");
          }
      rubles = ROUBLES_PER_DOLLAR*amDollrs;
      
      System.out.println((int) (rubles * 100) / 100.0   + " российского рубля.");
    }
  }
}