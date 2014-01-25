package nim;
import javax.swing.JOptionPane;
import java.util.Random;


public class Nim 
{
    int blocks;
    int pturn;
    String p1name;
    String p2name;
    int computerChoice;
    Random rand = new Random();
    int playerChoice;
    
    public Nim() 
    {
        pturn = rand.nextInt(3) + 1;       
    }
    
    public void twoPlayer() 
    {
        p1name = JOptionPane.showInputDialog("What is player 1's name?");
        p2name = JOptionPane.showInputDialog("What is player 2's name?");
        
        if (pturn == 1) 
        {
            JOptionPane.showMessageDialog(null, p1name + " goes first");
        } 
        
        else 
        {
            JOptionPane.showMessageDialog(null, p2name + " goes first");
        }
    } 
    
    public void hard(int numblocks) 
    {
        blocks = numblocks;
                
        {
            
        }
    }
    
    public void easy(int numblocks) 
    {
        blocks = numblocks;
        
        p1name = JOptionPane.showInputDialog("What is your name?");
        
        if (pturn == 1) 
        {
            JOptionPane.showMessageDialog(null, p1name + " goes first");
        } 
        
        else 
        {
            JOptionPane.showMessageDialog(null, "The computer goes first");
        }
    
        while (blocks>0) //Repeats loop until the number of blocks is zero
        {
            for (int i = 0; i < 10; i++) 
            {
                computerChoice = rand.nextInt(blocks/2) + 1;     
                JOptionPane.showMessageDialog(null, "The computer chooses " + computerChoice + " blocks");
                blocks-=computerChoice; 
                JOptionPane.showMessageDialog(null, "There are now " + blocks + " blocks");
                JOptionPane.showMessageDialog(null, "It is your turn.");
                String input = JOptionPane.showInputDialog("How many blocks do you choose?");
                playerChoice = Integer.parseInt(input);
           
                if (playerChoice <= (blocks/2)) 
                {
                   blocks-=playerChoice;
                   JOptionPane.showMessageDialog(null, "There are now " + blocks + " blocks");
                } 
               
                else 
                {
                    JOptionPane.showMessageDialog(null, "You must choose 1/2 or less of the blocks!\n"
                            + "Please try again.");
                }
             
            
            
            break;
            }
             
        }
    
       
        
    }
    
    public void medium() 
    {
        
    }
  
}

