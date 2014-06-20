/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import java.util.Random;

/**
 *
 * @author stefan987
 */
public class Computer {
    private int totalBlocks = 0;
    private void easy(){
        System.out.println(totalBlocks);
        int computerChoice = new Random().nextInt(totalBlocks / 2) + 1;
        
        totalBlocks -= computerChoice;
        
        System.out.println(totalBlocks +  " after");
    }
    private void medium(){
        
    }
    
    private void hard(){
        
    }
    
    public int run(int mode,int totalBlocks){
       this.totalBlocks = totalBlocks;
       switch(mode){
           case 1: easy();
               break;
           case 2: medium();
               break;
           case 3: hard();
               break;
       }
       return this.totalBlocks;
       
        
    }
}
