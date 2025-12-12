public class metodo_carro_principal {
    public static void main(String[] args){
        metodo_carro meuCarro = new metodo_carro();
        meuCarro.modelo = "Chevrolet Impala";
        meuCarro.ano = 1967;
        meuCarro.cor = "Preto";

        meuCarro.exibirFichaTecnica();
        System.out.println("Carro lançado há " + meuCarro.lancamentoCarro(1967) + " anos.");
        //System.out.println(meuCarro.lancamentoCarro(1967));
    }
}
