package nim;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class NimRunner 
{
    private void diplayRules(){
        JOptionPane.showMessageDialog(null, "Welcome to the Game of Nim.");
        JOptionPane.showMessageDialog(null, "The rules are as follows:\n"
                + "1. The player must take less than half of the number of blocks left.");
    }
    
    
    public static void main(String[] args) 
    {
        
        NimRunner instanceOfRunner = new NimRunner();
        Nim game = new Nim();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }
        catch(Exception e){
            Logger.Log("FATAL: Set Look and Feel failed!");
            System.exit(1);
        }
        
        instanceOfRunner.diplayRules();
        
        String input = JOptionPane.showInputDialog("How many blocks would you like to start with?");
        int blocks = 0;
        try{
            blocks = Integer.parseInt(input);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            Logger.Log("ERROR: The user didn't put in a number..");
        }
        input = JOptionPane.showInputDialog("Would you like to play against the computer(type 1) or another player(type 2)?");
      
        if (input.equalsIgnoreCase("one") || input.equalsIgnoreCase("1"))
        {
            
            boolean isValidLevel = false;
            String level = JOptionPane.showInputDialog("What difficulty level do you want? (Hard, Easy, or Medium)");
            do {
                
                
                switch(level){
                    case "Hard": game.hard(blocks);
                    
                    isValidLevel = true;
                        break;
                    
                    case"Medium": game.medium();
                    isValidLevel = true;
                        break;
                    case "Easy": 
                        System.out.println("somethign");
                        game.easy(blocks);
                    isValidLevel = true;
                        break;
                }
                
            }
            while(!isValidLevel);
      
        } 
        else 
        {
           game.twoPlayer(blocks);
        }
  
    }
    
    
    //Utility method
    public static boolean isInputANumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
