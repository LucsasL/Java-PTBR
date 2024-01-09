package Desafios.idioma;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale pais = Locale.getDefault();


        System.out.print("Seu sistema está em ");

        if (pais.getLanguage() == "pt")
        {
            System.out.println("Português.");
        }
    }
}
