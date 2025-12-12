import java.util.Scanner;

public class igual_diferente {
    public static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = leitura.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = leitura.nextInt();

        String maiorDiferente = String.format(
            n1 > n2 ? "%d É maior que %d !" :
            n1 < n2 ? "%d É menor que %d !" :
            "%d é igual a %d !", n1, n2);

        System.out.println(maiorDiferente);

//        Observação:

// %d	       inteiro (decimal)	        int x = 10; → "Número: %d"
// %s	       String	                    String nome = "João"; → "Nome: %s"
// %f	       float/double	                double preco = 19.99; → "Preço: %.2f"
// %x	       hexadecimal	                int cor = 255; → "Cor: %x"
// %c	       caractere	                char letra = 'A'; → "Letra: %c"
// %b	       boolean	boolean             ativo = true; → "Ativo: %b"
    }
}
