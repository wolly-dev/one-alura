public class Pratica1 {
    public static void main (String[] args) {
        // 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double media = (7.5 + 2.3) / 2;
        System.out.println("A média é: " + media);

        // 2. Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.
        double idade = 2.5;
        int idadeInteira = (int) idade;
        System.out.println("A idade é: " + idadeInteira);

        // 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'H';
        String frase = "Esta é a frase de oje. Não tem ";
        System.out.println(frase + letra + ".");

        //4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade
        // e apresente o resultado em uma mensagem.
        double precoProduto = 5.50;
        int quantidade = 3;
        double precoFinal = precoProduto * quantidade;
        System.out.println("O preço final é R$" + precoFinal);

        // 5. Declare uma variável do tipo double valorEmDolares.
        // Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 4.99;
        double dolarCotacao = 5.38;
        double valorEmReais = dolarCotacao * valorEmDolares;
        System.out.println(String.format("O valor $ %s convertido para reais passa a ser R$ %.2f !", valorEmDolares, valorEmReais));

        //6. Declare uma variável do tipo double precoOriginal.
        // Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto
        // e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original
        // e imprima o novo preço com desconto.
        double precoOriginal = 900.00;
        double percentualDesconto = 15.0 / 100 * precoOriginal;
        double precoDescontado = precoOriginal - percentualDesconto;
        System.out.println(String.format("A tatuagem da Holy custou R$%.2f. Com desconto de R$%.2f, passa a custar R$%.2f!", precoOriginal, percentualDesconto, precoDescontado));




    }
}
