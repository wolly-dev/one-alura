public class Aluno {
    private String nome;
    private int notas;
    private int totalNotas = 0;

    // Setters //
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNotas(int notas) {
        this.notas += notas;
        totalNotas++;
    }
    // Setters //


    // Getters//
    public String getNome() {
        return nome;
    }
    public int getNotas() {
        return notas;
    }
    public int getTotalNotas() {
        return totalNotas;
    }
    // Getters

    double calcularMedia(){
        double media = notas / totalNotas;
        return media;
    }
}
