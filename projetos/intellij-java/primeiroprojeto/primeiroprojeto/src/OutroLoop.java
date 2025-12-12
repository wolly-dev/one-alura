import java.util.Scanner; // Scanner para habilitar leitura de input

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Aqui cria um leitor de dados do user. System.in indica que vem do console
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble(); // Este é o input do user

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Total de notas somadas: " + totalDeNotas + ". Média de availiações: " + mediaAvaliacao / totalDeNotas);
    }
}