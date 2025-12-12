public class Aluno_Teste {
    public static void main(String[] args){
        Aluno a = new Aluno();
        a.setNome("Wolly");
        a.setNotas(10);
        a.setNotas(7);
        a.setNotas(2);
        a.setNotas(1);
        System.out.println("Total de notas: " + a.getTotalNotas());

        System.out.println("Média do aluno " + a.getNome() + ":" );
        System.out.println(a.calcularMedia());
    }
}
