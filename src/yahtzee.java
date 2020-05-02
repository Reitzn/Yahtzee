/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reitzna
 */
import java.util.*;
import javax.swing.JOptionPane;


 
public class yahtzee {

  
    public static void main(String[] args) {



      Player p = new Player();
      Player p2 = new Player();
      int score1 = 0, score2 = 0;
      int fiscor1 = 0, fiscor2 = 0;
      int n = 0;
      int bonus=0, bonus2=0,top=0,top2=0,bot=0,bot2=0;
     String play1;
     String play2;
      play1 = JOptionPane.showInputDialog("Player 1 plese enter your name");
      play2 = JOptionPane.showInputDialog("Player 2 plese enter your name");
              while(n < 13){

//JOptionPane.showMessageDialog(null,"Player1's Turn");
JOptionPane.showMessageDialog(null,"It's " + play1 + "'s Turn");

System.out.println("Player1's Turn");
    p.playerTurn();
    score1 = p.getScore();
    fiscor1 = fiscor1 + score1;

    System.out.println();
    System.out.println();
    JOptionPane.showMessageDialog(null,"It's " + play2 + "'s Turn");
    System.out.println("Player2's Turn");
    p2.playerTurn();
    score2 = p2.getScore();
fiscor1 = fiscor1 + score2;

    JOptionPane.showMessageDialog(null,play1 + "'s Score: "+ score1+"    "+play2 +"'s Score: "+score2);
    System.out.println("Player1's Score:");
    System.out.println(fiscor1);
    System.out.println("Player2's Score:");
    System.out.println(fiscor2);

    n++;
              }
   




    if(fiscor1>fiscor2){
        JOptionPane.showMessageDialog(null,"Player 1 Wins!");
        System.out.println("Player 1 Wins!");
    }else if(score1<score2){
        JOptionPane.showMessageDialog(null,"Player 2 Wins!");
        System.out.println("Player 2 Wins!");
    }else{
         JOptionPane.showMessageDialog(null,"Tie!");
        System.out.println("Tie!");
    }

      
      
    }



}
