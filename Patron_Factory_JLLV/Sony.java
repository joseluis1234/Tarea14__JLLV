
package Celulares;

import ico.fes.Mobile.Mobile;

/**
 *
 * @author mario
 */
public class Sony implements Mobile{
    
    private int ramSize;
    private String procesador;
    private String GPU;

    public Sony(int ramSize, String procesador, String GPU) {
        this.ramSize = ramSize;
        this.procesador = procesador;
        this.GPU = GPU;
    }
    
    
    
}
