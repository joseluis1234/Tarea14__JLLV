
package ico.fes.Mobile;

import Celulares.Huawei;
import Celulares.Iphone;
import Celulares.LG;
import Celulares.Motorola;
import Celulares.Samsung;
import Celulares.Sony;
import static ico.fes.Mobile.Mobile.Iphone;
import static ico.fes.Mobile.Mobile.Motorola;
import static ico.fes.Mobile.Mobile.Samsung;
import static ico.fes.Mobile.Mobile.Sony;


/**
 *
 * @author mario
 */
public class MobileFactory {
    public static Mobile createMobile(String type){
		if(type.equals(Mobile.Iphone)){
			return new Iphone(3, "A9", "A9 GPu");
		}else if(type.equals(Mobile.Sony)){
			return new Sony(4,"Qualcomm","ARM");
		}else if(type.equals(Mobile.Samsung)){
			return new Samsung(2,"snapdragon","Intel");
		}else if(type.equals(Mobile.Motorola)){
			return new Motorola(3, "A9", "A9 GPu");
		}else if(type.equals(Mobile.Huawei)){
			return new Huawei(3, "A9", "A9 GPu");
		}else if(type.equals(Mobile.LG)){
			return new LG(3, "A9", "A9 GPu");
		}else
                {
			return null;
		}
	}
}
    

