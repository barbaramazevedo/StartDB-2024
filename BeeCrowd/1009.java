import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
     
        String NomeVendedor = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double vendasTotal = scanner.nextDouble();
        double salarioTotal = salarioFixo + (vendasTotal * 0.15);    
    
        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
        scanner.close();
    }

}