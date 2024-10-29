import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
     
        int NUMBER = scanner.nextInt();
        int qntHoras = scanner.nextInt();
        double valorHora = scanner.nextDouble();
    
        double SALARY = qntHoras * valorHora;
    
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
    
        scanner.close();
    }
}