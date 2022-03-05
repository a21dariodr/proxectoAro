/**
 * Probas para a clase Aro
 * @author Darío de la Iglesia Rodríguez
 */
package aro;

import aro.Aro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author profesor
 */
public class AroTest {
    
    public AroTest() {
    }
    
    /**
     * Test of establecerCoordenadaX method, of class Aro.
     */
    @Test
    public void testEstablecerCoordenadaX() {
        System.out.println("establecerCoordenadaX");
        int valorX = 0;
        Aro instance = new Aro();
        instance.establecerCoordenadaX(valorX);
    }

    /**
     * Test of obterCoordenadaX method, of class Aro.
     */
    @Test
    public void testObterCoordenadaX() {
        System.out.println("obterCoordenadaX");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.obterCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test of establecerCoordenadaY method, of class Aro.
     */
    @Test
    public void testEstablecerCoordenadaY() {
        System.out.println("establecerCoordenadaY");
        int valorY = 0;
        Aro instance = new Aro();
        instance.establecerCoordenadaY(valorY);
    }

    /**
     * Test of obterCoordenadaY method, of class Aro.
     */
    @Test
    public void testObterCoordenadaY() {
        System.out.println("obterCoordenadaY");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.obterCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test of establecerRadio method, of class Aro.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Aro instance = new Aro();
        instance.establecerRadio(0.0);
        instance.establecerRadio(0.1);
        instance.establecerRadio(-0.1);
    }

    /**
     * Test of obterRadio method, of class Aro.
     */
    @Test
    public void testObterRadio() {
        System.out.println("obterRadio");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.obterRadio();
        assertEquals(0.1, result,0);

        instance.establecerRadio(0.1);
        result= instance.obterRadio();
        assertEquals(0.1, result,0);

        instance.establecerRadio(-0.1);
        result= instance.obterRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obterDiametro method, of class Aro.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obterCircunferencia method, of class Aro.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obterSuperficie method, of class Aro.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterSuperficie");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of trasladarCentro method, of class Aro.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Aro instance = new Aro();
        int resultx=instance.obterCoordenadaX();
        int resulty=instance.obterCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.obterCoordenadaX();
        int resultny = instance.obterCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
