import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int distancia = scanner.nextInt();
        int tempoNecessario = distancia * 2;

        System.out.println(tempoNecessario + " minutos");

        scanner.close();                
    }
}