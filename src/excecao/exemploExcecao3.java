package excecao;

public class exemploExcecao3 {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras dos correios.");
            // TODO auto-generated catch block
//            e.printStackTrace();
        }
    }

        static String formatarCep (String cep) throws CepInvalidoException {
            if (cep.length() != 8)
                throw new CepInvalidoException();

            // Simulando um cep formatado
            return "23.765-064";
        }
}
