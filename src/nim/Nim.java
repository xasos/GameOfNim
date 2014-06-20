package nim;

import javax.swing.JOptionPane;
import java.util.Random;

public class Nim {

    private int totalBlocks;

    public Nim() {
    }

    private String getPlayerNameByTurn(int turn, Player playerOne, Player playerTwo) {
        if (turn == 1) {
            return playerOne.getName();
        } else {
            return playerTwo.getName();
        }
    }

    public void twoPlayer(int blocks) {
        String playerOneName = JOptionPane.showInputDialog("What is player 1's name?");
        String playerTwoName = JOptionPane.showInputDialog("What is player 2's name?");

        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        int turn = Player.getTurn();
        while (totalBlocks > 0) {
            turn = Player.getTurn();
            if (turn == 1) {
                totalBlocks = playerOne.doTurn(blocks);
            } else {
                totalBlocks = playerTwo.doTurn(blocks);
            }
            if (totalBlocks <= 0) {
                String nameOfLoser = getPlayerNameByTurn(turn, playerOne, playerTwo);
                JOptionPane.showMessageDialog(null, nameOfLoser + ", sorry to say but you lose! Better luck next time!");
            }
        }

    }

    public void hard(int numblocks) {
        totalBlocks = numblocks;
        
        //TODO: create hard

    }

    private void displayNumberOfBlocks() {
        JOptionPane.showMessageDialog(null, "There are now " + totalBlocks + " blocks");
    }

    public void easy(int numblocks) {
        totalBlocks = numblocks;

        String mainPlayerName = JOptionPane.showInputDialog("What is your name?");

        Player mainPlayer = new Player(mainPlayerName);
        Computer computer = new Computer();
        if (Player.getTurn() == 1) {
            JOptionPane.showMessageDialog(null, mainPlayer.getName() + " goes first");
        } else {
            JOptionPane.showMessageDialog(null, "The computer goes first");
        }

        while (totalBlocks >= 0) {
            int newTotalBlocks = computer.run(1, totalBlocks);
            JOptionPane.showMessageDialog(null, "The computer chooses " + (totalBlocks - newTotalBlocks) + " blocks");
            totalBlocks = newTotalBlocks;
            displayNumberOfBlocks();
            totalBlocks = mainPlayer.doTurn(totalBlocks);

        }



    }

    public void medium() {
        //TODO: create medium
    }
}
