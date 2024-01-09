package Desafios.resolução;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
        Dimension res = Toolkit.getDefaultToolkit().getScreenSize();

        double width = res.getWidth();
        double height = res.getHeight();

        System.out.print("A resolução de sua tela é ");
        System.out.println((int) width + " X " + (int) height);
    }
}
