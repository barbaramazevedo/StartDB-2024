import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
       
        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.println(maiorABC + " eh o maior");

        scanner.close();                
    }
}