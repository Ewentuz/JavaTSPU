import java.util.Scanner;

public class Project {
  public static void main(String[] args) {
    final double  cursJPY = 0.65;
    double japanYen, rubles;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Введите сумму в японских йенах:");
    japanYen = input.nextDouble();
      
      rubles = cursJPY*japanYen;
      
      System.out.println("Cумма в рублях:"  + rubles);
    
  }
}