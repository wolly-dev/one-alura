public class IdadePessoa {
    private String nome;
    private int idade;

    // Getters //
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    // Getters //

    // Setters //
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    // Setters //

    public String verificarIdade(){
        if (this.idade < 0){
            return "Idade inválida.";
        } else if (this.idade < 18){
            return "Menor de idade.";
        } else {
            return "Maior de idade.";
        }
    }
}
