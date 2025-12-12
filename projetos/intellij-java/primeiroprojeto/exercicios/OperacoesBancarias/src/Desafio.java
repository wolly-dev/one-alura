import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Inicializando dados do cliente
        String cliente = "Wolly";
        String tipoConta = "Corrente";

        BigDecimal saldo = new BigDecimal("1599.99");
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        String saldoFormatado = nf.format(saldo);
        //Inicializando dados do cliente

        //Printando e decorando informações
        String decoracao = "*".repeat(45);

        System.out.println(decoracao);
        System.out.println("Dados iniciais do cliente: \n");
        System.out.printf("" +
                "Nome do cliente: %s\n" +
                "Tipo de conta: %s\n" +
                "Saldo atual: %s\n", cliente, tipoConta, saldoFormatado);
        System.out.println(decoracao);
        //Printado e decorando informações

        //Menu de operações
        System.out.println("\nOperações:\n");

        String menuOperacoes = """
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opçao desejada: """;
        //Menu de Operações

        //Operações
        int opcao = 0;
        while (opcao != 4){
            System.out.printf(menuOperacoes);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1: // Visualizar Saldo
                    System.out.println("\nSeu saldo: " + saldoFormatado + "\n");
                    break;
                case 2: // Receber valor
                    System.out.println("Que valor deseja receber? \n");
                    BigDecimal receberValor = leitura.nextBigDecimal();

                    //Somando e reformatando
                    saldo = saldo.add(receberValor);
                    saldoFormatado = nf.format(saldo);
                    //Somando e reformatando

                    System.out.println("Novo saldo: " + saldo + "\n");
                    break;
                case 3: // Enviar valor
                    System.out.println("Para quem deseja transferir?");
                    leitura.nextLine();
                    String clienteEnviar = leitura.nextLine();

                    System.out.println("E que valor deseja transferir?");
                    BigDecimal enviarValor = leitura.nextBigDecimal();

                    // Verificando se o valor não é maior que o disponível
                    while (enviarValor.compareTo(saldo) > 0) {
                        System.out.println("Impossível prosseguir com a transação. Insira um valor válido! ");
                        System.out.println("Que valor deseja transferir?");
                        enviarValor = leitura.nextBigDecimal();
                    }
                    // Verificando se o valor não é maior que o disponível

                    //Subtraindo e reformatando
                    saldo = saldo.subtract(enviarValor);
                    saldoFormatado = nf.format(saldo);
                    //Subtraindo e reformatando

                    System.out.println("Valor da transação: R$ " + enviarValor);
                    System.out.println("Destinatário da transação: " + clienteEnviar + "\n");

                    System.out.println("Novo saldo: " + saldoFormatado + "\n");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opçao inválida.");
                    break;
        //Operações
            }
        }
    }
}
