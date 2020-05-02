/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reitzna
 */
import java.util.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Dice {
int sc  = 0;
private int[] dice = new int[5];
private int[] hold = new int[5];
private int[] score = new int[13];
private boolean[] used = new boolean[13];
private int[] us = new int[13];
private int[] score2 = new int[13];
private int ni;


private static DiceGUI gui = new DiceGUI();


    public Dice(){
        int z=0;
        while (z < 13){
            us[z] =0;
            z++;
        }
        
        
        
        Random r = new Random();
        dice[0]=r.nextInt(6) + 1;
        dice[1]=r.nextInt(6) + 1;
        dice[2]=r.nextInt(6) + 1;
        dice[3]=r.nextInt(6) + 1;
        dice[4]=r.nextInt(6) + 1;

        hold[0] = 0;
        hold[1] = 0;
        hold[2] = 0;
        hold[3] = 0;
        hold[4] = 0;
        
    }
    public void roll(){
       for(int x = 0;x < 5; x++){
           if(hold[x] == 0){
            Random r = new Random();
            dice[x] =r.nextInt(6)+1;
           }

       }
       gui.display(dice,hold);
       

    }
    public int score(){

        for(int index = 1; index < 5; index++){
            int key = dice[index];
            int position = index;

            while (position > 0 && dice[position-1]>key){
               dice[position] = dice[position -1];
               position--;
            }
           dice[position] = key;
           
        }

       gui.display(dice,hold);
       
       int z=0;
       while(z<13){
           score[z] =0;
           z++;
       }

        for(int y =0; y<13; y++){
            if(used[y] == false){
                if(y<6){
                    for(int x = 0; x < 5; x++){
                        if(dice[x] == y + 1){
                            score[y] = score[y] + y + 1;
                        }
                    }
                }
                    //Three of a kind
                    if(y == 6){
                        if(dice[0] == dice[1] && dice[1] == dice[2]){
                            score[y] = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];

                        }else if(dice[1] == dice[2] && dice[2] == dice[3]){
                            score[y] = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];

                        }else if(dice[2] == dice[3] && dice[3] == dice[4]){
                             score[y] = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];

                        }
                    }

                    //Four of a kind
                    if(y == 7){
                       if(dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3]){
                           score[y] = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];

                       }else if(dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4]){
                           score[y] = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];

                       }
                    }

                     //Full House
                    if (y == 8){
                        if(dice[0] == dice[1] && dice[2] == dice[3] && dice[3] == dice[4]){
                            score[y] = 25;
                        }else if(dice[0] == dice[1] && dice[1] == dice[2] && dice[3] == dice[4]){
                            score[y] = 25;

                        }
                    }


                     //Small strate
                       if(y == 9){
                           int count = 0;
                           for(int x =0; x < 4; x++){
                               if(dice[x] +1 == dice[x+1]){
                                   count++;
                               }else if (dice[x] +2 == dice[x+1]){
                                   break;
                               }

                           }

                           if(count >= 3){
                               score[y] = 30;
                           }
                       }



               //Large starte
                if(y == 10){
                    if(dice[0] + 1 ==dice[1] && dice[1] + 1 == dice[2] && dice[2] + 1 == dice[3] && dice[3] + 1 == dice[4]){
                        score[y] = 40;
                    }
                }
                //Yahtzee
                if(y == 11){
                    if(dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4]){
                        score[y] = 50;
                    }
                }
                //Chans
                if(y == 12){
                    score[y] = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];
                }

                       }



                }

        int x = 0;
        String temp;

                z=0;
                while(z < 8){
              temp = JOptionPane.showInputDialog("1. Aces: " + score[0] + "\n" + "2. Twos: " + score[1] + "\n" + "3. Threes: " + score[2] + "\n" + "4. Fours: " + score[3] + "\n" + "5. Fives: " + score[4] + "\n" + "6. Sixes: " + score[5] + "\n" + "7. 3 of a kind: " + score[6] + "\n" + "8. 4 of a kind: " + score[7] + "\n" + "9. Full House: " + score[8] + "\n" + "10. Small Straight: " + score[9] + "\n" + "11. Large Straight: " + score[10] + "\n" + "12. YAHTZEE: " + score[11] + "\n" + "13. Chance: " + score[12]);
                 x=Integer.parseInt(temp);
                 if(x<1 || x>13){
                    JOptionPane.showMessageDialog(null,"Option is not avalable");
                 }else if(us[x-1] == 0){
                      z = 10;
                 }else{
                     JOptionPane.showMessageDialog(null,"Option has alredy been used");
                 }

                }
            
        x--;
           int sc = score[x];
           ni = x;
           
           us[x] =1;
           

        return sc;

    }
    public int n(){


        return ni;
    }
    public String toString(){
        return dice[0]+  "\t" + dice[1] + "\t" + dice[2] + "\t" + dice[3] + "\t" + dice[4];
    }
    public void holdDie(int x){
       if(hold[x] == 0){
        hold[x] = 1;
       }else if(hold[x] == 1){
           hold[x] = 0;
       }
       gui.display(dice,hold);
    }

    public void resetDie(){
        Random r = new Random();
        dice[0]=r.nextInt(6) + 1;
        dice[1]=r.nextInt(6) + 1;
        dice[2]=r.nextInt(6) + 1;
        dice[3]=r.nextInt(6) + 1;
        dice[4]=r.nextInt(6) + 1;

        hold[0] = 0;
        hold[1] = 0;
        hold[2] = 0;
        hold[3] = 0;
        hold[4] = 0;
    }


}
