package aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Darío de la Iglesia Rodríguez
 */
public class Aro {

    private static final double LIMITERADIO = 0.0;
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerCoordenadaX(int valorX) {
        coordenadaX=valorX;
    }

    public int obterCoordenadaX() {
        return coordenadaX;
    }

    public void establecerCoordenadaY(int valorY) {
        coordenadaY=valorY;
    }

    public int obterCoordenadaY() {
        return coordenadaY;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + trasladarX;
        coordenadaY=coordenadaY + trasladarY;
    }
}