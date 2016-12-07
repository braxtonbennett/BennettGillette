/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

/**
 *
 * @author Douglas
 */
public class PackControl {
    
    public static long makeCure(long brahmi, long calihari, long henna, long harida) {
        if (brahmi <= 0) {
                return -1;
        }
         if (calihari <= 0) {
                return -1;
        }
          if (henna <= 0) {
                return -1;
        }
           if (harida <= 0) {
                return -1;
        }
            
            
            long cure = (brahmi * 5)+(calihari * 6)+(henna * 10)+(harida * 24);
            
            
            if (cure == 100) {
                return 1;
                
            }
            
      return 2;
    }
    
    public static String verifyCure(String ingredient1, String ingredient2, String ingredient3, String ingredient4){
      return null;  
    }
}
