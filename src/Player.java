/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reitzna
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class Player {
int score = 0,b=0,top=0,topt=0,botom=0;
Dice die = new Dice();
private cardGUI gui2 = new cardGUI();


private int[] score2 = new int[13];

  public Player(){
    score = 0;



  }
  public void playerTurn(){
   Scanner scan = new Scanner (System.in);
 
   die.resetDie();


   int y =0;
   int a = 0;
   String dies;

   while(a < 3){    
   die.roll();
   dies=die.toString();
   System.out.println(dies);
   a++;  
   String temp;
    int x = 0,z = 0;
   System.out.println("Wich dice do you want to hold?");
   // temp = JOptionPane.showInputDialog("Wich dice do you want to hold?" + "  Press 6 when your done");
    //z=Integer.parseInt(temp);
   System.out.println("Press 6 when your done.");
   while (z <= 5){

       int b = 0;
       while(b<6){
    temp = JOptionPane.showInputDialog("Wich dice do you want to hold?" + "  Press 6 to roll dice");
    z=Integer.parseInt(temp);
    if(z<1 || z>6){
        b=0;
        JOptionPane.showMessageDialog(null,"Option is not avalable");
    }else{
        b=9;
    }
       }
   //z = scan.nextInt();
  
   if(z < 6){
   die.holdDie(z - 1);
   }
  } 
   
   /* if(a <= 2){
   System.out.println("Would you like to roll agen?");
   System.out.println("1. Yes");
   System.out.println("2. No");
   y = scan.nextInt();
   if(y == 2){
       a = 6; 
   }
   }
   */
   }
   
}  
  public int getScore(){
      int sc=0, x=0;
      sc = die.score();

      //score = score + sc;

      x = die.n();

      score2[x] = sc;
      
       gui2.display(sc , x);
      
      
      
      top=score2[0]+score2[1]+score2[2]+score2[3]+score2[4]+score2[5];
      botom=score2[6]+score2[7]+score2[8]+score2[9]+score2[10]+score2[11]+score2[12];
      
     if(top > 63){
         b=35;
     }
     topt=top+b;

   score = topt+botom;
    
      


      return score;
  }

  public int compareTo(int x){

      return x;
  }

}

