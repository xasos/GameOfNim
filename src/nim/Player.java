/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author stefan987
 */
public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    

    public static int getTurn() {
        return new Random().nextInt(3) + 1;
    }

    //@return returns the total blocks
    public int doTurn(int tBlocks) {
        int totalBlocks = tBlocks;
        JOptionPane.showMessageDialog(null, name + ", it is your turn.");
        String input = JOptionPane.showInputDialog("How many blocks do you choose?");
        while (!NimRunner.isInputANumber(input)) {
            input = JOptionPane.showInputDialog("Please enter a valid number. Now, how many blocks do you choose?");
        }
        int playerChoice = Integer.parseInt(input);

        if (playerChoice <= (totalBlocks / 2)) {
            totalBlocks -= playerChoice;
            JOptionPane.showMessageDialog(null, "There are now " + totalBlocks + " blocks");
        } else {
            JOptionPane.showMessageDialog(null, "You must choose 1/2 or less of the blocks!\n"
                    + "Please try again.");
        }
        return totalBlocks;
    }
}
