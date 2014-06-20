/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

/**
 *
 * @author stefan987
 */
public class Logger {
    private static boolean DEBUG = true;
    public static void Log(String whatToLog){
        if(DEBUG){
            System.out.println(whatToLog);
        }
    }
}
