import java.util.Scanner;

public class fatorial {
    public static void main(){
        Scanner leitura = new Scanner(System.in);

        System.out.printf("Digite o número que deseja ver o fatorial: ");
        int numero = leitura.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é: %d", numero, fatorial);
    }
}
