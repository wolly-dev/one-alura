public class Produto {
    private String nome;
    private double preco;


    // Setters //
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    // Setters//

    // Getters //
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    // Getters //

    void aplicarDesconto(int valor){
        double percentualDesconto = valor / 100.0;
        double descontar = percentualDesconto * preco;
        double descontoAplicado = preco - descontar;
        preco = descontoAplicado;
    }
}
