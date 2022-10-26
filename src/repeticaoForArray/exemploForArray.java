package repeticaoForArray;

public class exemploForArray {

    public static void main(String[] args) {

        // Em arreys o índice de elementos inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JÚLIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x ++) {
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }
    }
}
