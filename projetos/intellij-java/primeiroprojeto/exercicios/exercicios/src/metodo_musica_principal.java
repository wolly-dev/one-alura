public class metodo_musica_principal {
    public static void main(String[] args){
        metodo_musica minhaMusica = new metodo_musica();
        minhaMusica.titulo = "Loverboy (Who Got You Smiling Like That)";
        minhaMusica.artista = "A-Wall";
        minhaMusica.duracaoEmMinutos = 5;
        minhaMusica.anoDeLancamento = 2021;

        minhaMusica.fichaTecnicaMusica();
        minhaMusica.avaliar(8);
        minhaMusica.avaliar(5);
        minhaMusica.avaliar(10);
        System.out.println(minhaMusica.somaDasAvaliacoes);
        System.out.println(minhaMusica.totalAvaliacoes);
        System.out.println(minhaMusica.pegarMedia());
    }
}
