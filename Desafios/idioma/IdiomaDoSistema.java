package Desafios.idioma;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale pais = new Locale("Português do Brasil", "BR")
        System.out.print("Seu sistema está em ");
        System.out.println(pais.getLanguage());
    }
}
