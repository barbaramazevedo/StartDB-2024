import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
     
        int codPeca1 = scanner.nextInt();
        int numPeca1 = scanner.nextInt();
        double valorUniPeca1 = scanner.nextDouble();

        int codPeca2 = scanner.nextInt();
        int numPeca2 = scanner.nextInt();
        double valorUniPeca2 = scanner.nextDouble();

        double valor1= (numPeca1 * valorUniPeca1);
        double valor2= (numPeca2 * valorUniPeca2);
        double TOTAL= valor1 + valor2;
    
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);
        scanner.close();
    }

}