package Desafios.idioma;

import javax.security.auth.callback.LanguageCallback;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        LanguageCallback idioma = new LanguageCallback();
        System.out.print("Seu sistema está em ");
        System.out.println(idioma);
    }
}
