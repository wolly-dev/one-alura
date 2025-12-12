import java.util.Random;
import java.util.Scanner;

public class jogo_adivinhacao {
    public static void main() {
        Scanner leitura = new Scanner(System.in);
        // Chamando o Scanner para leitura de input e salvando em variável para uso posterior.

        int numero = new Random().nextInt(100) + 1;
        System.out.println("Para debug. Número gerado aleatoriamente: " + numero);
        //Gerando número aleatório entre 0 e 100. 101 pois o último número sempre é ignorado, logo, gerará corretamente.

        System.out.println("Olá! Tente adivinhar o número entre 1 e 100 em até 5 tentativas ");

        for (int tentativas = 1; tentativas <= 5; tentativas++) {
            System.out.println("Digite um número entre 1 e 100: ");
            int numeroUsuario = leitura.nextInt();
            // Pedindo input do usuário do Tipo Int e atribuindo à variável.

            if (numeroUsuario != numero && tentativas != 5) {
                System.out.println("Errou! Tente novamente :D número de tentativas: " + tentativas);

                String posicao = (numeroUsuario > numero) ? "Chute mais baixo" : "Chute mais alto";
                System.out.println(posicao);
                // if/else simplificado para dar dica ao usuário.

            } else if (tentativas == 5 && numeroUsuario != numero) {
                System.out.println("Que pena, você chegou ao número máximo de tentativas :(");

            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
                break;
            }
        }
    }
}
