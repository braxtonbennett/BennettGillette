/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260hemmorrhage.view;

import hemorrhage.Hemorrhage;
import java.io.PrintWriter;

/**
 *
 * @author Douglas
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Hemorrhage.getOutFile();
    private static final PrintWriter logFile = Hemorrhage.getLogFile();
    public static void display(String className, String errorMessage) {
        
       errorFile.println("--------------------------------------------"
               + "\n - ERROR - " + errorMessage
               + "\n--------------------------------------------");
      
       logFile.println(className+" - "+ errorMessage);
    }
}
