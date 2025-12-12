public class metodo_carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de lançamento: " + ano);
    }

    int lancamentoCarro(int ano){
        return 2025 - ano;
    }
}
