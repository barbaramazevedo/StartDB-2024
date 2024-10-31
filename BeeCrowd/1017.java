import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int tempo = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        double distancia = velocidadeMedia * tempo;
        double rendimentoLitros = distancia/12;
        

        System.out.printf("%.3f%n", rendimentoLitros);

        scanner.close();                
    }
}