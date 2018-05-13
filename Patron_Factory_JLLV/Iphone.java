
package Celulares;

import ico.fes.Mobile.Mobile;

/**
 *
 * @author mario
 */
public class Iphone implements Mobile{
    private int ramSize;
    private String procesador;
    private String GPU;

    public Iphone(int ramSize, String procesador, String GPU) {
        this.ramSize = ramSize;
        this.procesador = procesador;
        this.GPU = GPU;
    }
    
    
}
