public class Condicional {
    static void main() {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notadoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        //Isso aqui é feio de olhar, mas tem um motivo.
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
