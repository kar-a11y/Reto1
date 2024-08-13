package packReto1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
        while (x <= 100) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (x % 3 == 0) {
                System.out.println("fizz");
            } else if (x % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(x);
            }
            
            x++;
            
        }
	}
	
}