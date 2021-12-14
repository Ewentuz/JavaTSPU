public class z8 {
	public static void main(String[] args) {
	    int i, j;
	    double chi;
	    chi = 9870;
	    for (i=1; chi <= 30000; ++i){
	        chi += 0.1 * chi;
	    }
	    System.out.println("Численность перевалит за " + (int)chi + " через " +i);
	}
}