import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        double A = scanner.nextDouble();

        double area = PI * Math.pow(A, 2);

        System.out.printf("A=%.4f%n", area);
                        
    }
}