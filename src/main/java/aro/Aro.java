package aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Darío de la Iglesia Rodríguez
 */
public class Aro {
    
    /**
     * Constante que almacena o valor mínimo para o radio dun obxecto de tipo
     * Aro
     */
    private static final double LIMITERADIO = 0.0;
    
    /**
     * Coordenada x do aro
     */
    private int coordenadaX;
    /**
     * Coordenada y do aro
     */
    private int coordenadaY;
    /**
     * Radio do aro
     */
    private double radio;

    /**
     * Constructor baleiro da clase Aro
     * Inicializa os valores de tipo enteiro a 0 e o double a 0.0
     */
    public Aro() {
    }

    /**
     * Constructor parametrizado da clase Aro
     * @param valorX Coordenada x do aro
     * @param valorY Coordenada y do aro
     * @param valorRadio Radio do aro
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Getter do campo coordenadaX
     * @return Valor da coordenada x dun aro
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Setter do campo coordenadaX
     * @param coordenadaX Novo valor para a coordenada x dun aro
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Getter do campo coordenadaY
     * @return Valor da coordenada y dun aro
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Setter do campo coordenadaY
     * @param coordenadaY Novo valor para a coordenada y dun aro
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Getter do campo radio
     * @return Valor do radio dun aro
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Setter do campo radio
     * @param radio Novo valor para o radio dun aro
     */
    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO) ? LIMITERADIO : radio;
    }

    /**
     * Obtén o diámetro dun aro
     * @return Diámetro do aro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Obtén o perímetro (circunferencia) dun aro
     * @return Perímetro do aro
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Obtén a área (superficie) dun aro
     * @return Superficie do aro
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Devolve a información dun aro en forma de cadea de texto
     * @return Cadea de texto que mostra as coordenadas x e y e o radio do aro
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Traslada o centro (coordenadas x e y) dun aro
     * @param trasladarX Desprazamento da coordenada x do aro
     * @param trasladarY Desprazamento da coordenada y do aro
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}