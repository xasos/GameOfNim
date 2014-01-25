package nim;

import javax.swing.JOptionPane;

public class NimRunner 
{
    
    public static void main(String[] args) 
    {
        Nim game = new Nim();
        JOptionPane.showMessageDialog(null, "Welcome to the Game of Nim.");
        JOptionPane.showMessageDialog(null, "The rules are as follows:\n"
                + "1. The player must take less than half of the number of blocks left.");
        String input = JOptionPane.showInputDialog("How many blocks would you like to start with?");
        int blocks = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Would you like to play against the computer(type 1) or another player(type 2)?");
      
        if (input.equalsIgnoreCase("one") || input.equalsIgnoreCase("1"))
        {
            String level = JOptionPane.showInputDialog("What difficulty level do you want (Hard, Easy, or Medium)?");
            if (level.equalsIgnoreCase("Hard")) 
            {
                game.hard(blocks);
            }
            else if (level.equalsIgnoreCase("Medium"))
            {
                game.medium();
            }

            else if (level.equalsIgnoreCase("Easy"))
            { 
                game.easy(blocks);
            }

            else
            {
                JOptionPane.showMessageDialog(null, "That is not a specified level. Please re-run program and try again.");
            }
        } 
        else 
        {
           game.twoPlayer();
        }
        
       
             
        
            
    }

}
