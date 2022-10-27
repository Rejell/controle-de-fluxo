package excecao;

import java.text.NumberFormat;
import java.text.ParseException;

public class exemploExcecao2 {

    public static void main(String[] args) {

//        Number valor1 = Double.valueOf("a1.75");
//        System.out.println(valor1);

        Number valor2;

        try {
            valor2 = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor2);
        }

        catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
