import java.util.Scanner;

public class tabuada {
    public static void main() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem-vindo à tabuada de multiplicação! Que número deseja?");
        int numero = leitura.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
