package repeticaoEach;

public class exemploForEach {

    public static void main(String[] args) {
       String alunos[] = {"FELIPE", "JONAS", "JÚLIA", "MARCOS"};

       // Forma abreviada
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
