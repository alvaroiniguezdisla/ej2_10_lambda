package aplicacion;
import java.util.Scanner;
import dominio.ej2_10_lambda;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        System.out.println("Los números pares hasta " + n + " son: " + ej2_10_lambda.listapares(n));
    }

}
