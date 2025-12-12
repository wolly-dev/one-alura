import java.util.Scanner;

public class par_impar {
    public static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Digite um número para verificar se é Par ou Ímpar: ");
        int numero = leitura.nextInt();
        int parImpar = numero % 2;

        String resultado = (parImpar == 0) ? "Número par!" : "Número Ímpar!";
        System.out.println("Para debug: " + parImpar);
        System.out.println(resultado);
    }
}
