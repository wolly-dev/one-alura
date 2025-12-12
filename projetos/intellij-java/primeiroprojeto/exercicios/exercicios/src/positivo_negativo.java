import java.util.Scanner;

public class positivo_negativo {
    public static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é positivo/negativo: ");
        int numero = leitura.nextInt();

        String resultado = (numero > 0) ? "Positivo" : "Negativo";
        System.out.println("O Número é " + resultado + "!");
    }
}
