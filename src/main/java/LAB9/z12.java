public class z12 {
	public static void main(String[] args) {
	    int n=0;
	    for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++){
                n += 1;
                System.out.println(i * j);
            }
            System.out.println(n + " Раз выполнялся цикл");
	}
}