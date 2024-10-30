import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();
        double consumoMedio = distancia/combustivel;
       
        System.out.printf("%.3f km/l%n", consumoMedio);

        scanner.close();                
    }
}