package aro;

import java.text.DecimalFormat;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Darío de la Iglesia Rodríguez
 */
public class Main {
    public static void main(String[] args) {
        Aro aro = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+aro.obterCoordenadaX()+
                "\nA coordenada Y é "+aro.obterCoordenadaY()+
                "\nO radio é "+aro.obterRadio();
        aro.establecerCoordenadaX(35);
        aro.establecerCoordenadaY(20);
        aro.establecerRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(aro.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(aro.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(aro.obterSuperficie());
        System.out.println(saida);
        
        System.out.println(saida);
        System.exit(0);
    }

}