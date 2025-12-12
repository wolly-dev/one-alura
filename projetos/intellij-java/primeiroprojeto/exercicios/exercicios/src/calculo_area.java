import java.util.Scanner;

public class calculo_area {
    public static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Deseja calcular a área de um quadrado ou de um círculo?");
        System.out.println("1 para QUADRADO");
        System.out.println("2 para CÍRCULO");

        int escolha = leitura.nextInt();

        switch (escolha) {
            case 1: // quadrado
                System.out.println("Digite em centímetros o lado do quadrado: ");
                int centimetrosQuadrado = leitura.nextInt();
                double areaQuadrado = Math.pow(centimetrosQuadrado, 2);
                System.out.printf("O quadrado tem %.2fcm de área!", areaQuadrado);
                break;

            case 2: // círculo
                System.out.println("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double area = Math.PI * Math.pow(raio, 2);

                System.out.printf("A área do círculo é %.2fcm!%n", area);
                break;
                //%.2f formata em duas casas decimais. %n é o mesmo que \n no Python.
                //printf e println são diferentes. O primeiro não quebra linha, o segundo sim.
        }
    }
}
