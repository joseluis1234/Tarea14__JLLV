/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.Mobile;

/**
 *
 * @author mario
 */
public class Test {
    
     public static void main(String[] args) {
		Mobile mobile = MobileFactory.createMobile(Mobile.Samsung);
                Mobile mobile1 = MobileFactory.createMobile(Mobile.Iphone);
                Mobile mobile2 = MobileFactory.createMobile(Mobile.Sony);
                Mobile mobile3 = MobileFactory.createMobile(Mobile.Motorola);
                Mobile mobile4 = MobileFactory.createMobile(Mobile.Huawei);
                Mobile mobile5 = MobileFactory.createMobile(Mobile.LG);
                
                System.out.println("Las caracteristicas de Samsung son: " + mobile.Samsung + "\n");
                System.out.println("Las caracteristicas de Iphone son: "+ mobile.Iphone+"\n");
                System.out.println("Las caracteristicas de Sony son: "+ mobile.Sony+"\n");
                System.out.println("Las caracteristicas de Motorola son: "+ mobile.Motorola+"\n");
                System.out.println("Las caracteristicas de Huawei son: "+ mobile.Huawei+"\n");
                System.out.println("Las caracteristicas de LG son: "+ mobile.LG+"\n");
                
                
                

	}
    
}
