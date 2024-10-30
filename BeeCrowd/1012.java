import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double areaTriangRet = (A * C)/2;
        double areaCirc = PI * Math.pow(C, 2.0);
        double areaTrap = ((A + B) * C)/2;
        double areaQuad = Math.pow(B, 2.0);
        double areaRet = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangRet);
        System.out.printf("CIRCULO: %.3f%n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
        System.out.printf("QUADRADO: %.3f%n", areaQuad);
        System.out.printf("RETANGULO: %.3f%n", areaRet);
        scanner.close();                
    }
}