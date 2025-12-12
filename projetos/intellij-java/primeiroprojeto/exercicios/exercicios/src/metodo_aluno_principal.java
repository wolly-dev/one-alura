import java.util.Scanner;

public class metodo_aluno_principal {
    static void main(String[] args){
       Scanner leitura = new Scanner(System.in);
       metodo_aluno novoAluno = new metodo_aluno();
       System.out.println("Digite o nome do novo aluno:");
       novoAluno.nomeAluno = leitura.nextLine();
       System.out.println("Idade do aluno:");
       novoAluno.idadeAluno = leitura.nextInt();

       novoAluno.fichaAluno();
    }
}
