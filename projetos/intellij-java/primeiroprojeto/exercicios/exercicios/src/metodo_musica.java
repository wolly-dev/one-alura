public class metodo_musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    int duracaoEmMinutos;
    double somaDasAvaliacoes;
    int totalAvaliacoes;

    void fichaTecnicaMusica(){
        System.out.println("Nome da Música: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos);
    }

    void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegarMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
