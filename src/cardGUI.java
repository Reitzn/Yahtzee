import java.awt.*;
import javax.swing.*;

public class cardGUI {
    private JFrame frame; //Java window
    private myJPanel panel; //Container for stuff in the frame
    private static int aline = 336;
    private int[] score= new int[13];
    private int tops = 0;
    private int bonust = 0;
    private int tu = 0;
    private int tb = 0;
    private int all = 0;
     public cardGUI(){
        //4.Instantiate the frame and panel


        frame = new JFrame("Score Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new myJPanel();
        panel.setPreferredSize(new Dimension(400, 800));
        frame.setLocation(aline,0);
        //5. Put the panel into the frame content pane
        frame.getContentPane().add(panel);

        //6. Set the frame size at or above preferred size
        frame.pack();


        frame.setVisible(true);
        aline = aline + 410;
        int n = 0;
                while(n < 13){
                    score[n] = 0;
                    n++;
                }
    }

    public void display(int x,int y){

        score[y] = x;

        tops = score[0]+score[1]+score[2]+score[3]+score[4]+score[5];
        if(tops > 63){
            bonust = 35;
        }
        tu = tops + bonust;
        tb = score[6]+score[7]+score[8]+score[9]+score[10]+score[11]+score[12];

        all = tu + tb;
        
        panel.repaint();
        frame.repaint();
    }
        private class myJPanel extends JPanel{
            //object of this tyoe are JPanels in everyway
            //except we will:

            //override one method
            public void paintComponent(Graphics g){
                //Paint component is automatically called by
                //the rePaint() method

                //Call the original paintComponent for background
                super.paintComponent(g);

                //Add out drawing here
               super.paintComponent(g);
            Font font = new Font("Verdana", Font.BOLD, 18);
            g.setFont(font);

            g.drawRect(10, 10, 375, 775);
            g.drawRect(10, 10, 375, 41);
            g.drawRect(10, 10, 375, 82);
            g.drawRect(10, 10, 375, 123);
            g.drawRect(10, 10, 375, 164);
            g.drawRect(10, 10, 375, 205);
            g.drawRect(10, 10, 375, 246);
            g.drawRect(10, 10, 375, 287);
            g.drawRect(10, 10, 375, 328);
            g.drawRect(10, 10, 375, 375);

            g.drawRect(10, 10, 375, 419);
            g.drawRect(10, 10, 375, 456);
            g.drawRect(10, 10, 375, 493);
            g.drawRect(10, 10, 375, 530);
            g.drawRect(10, 10, 375, 567);
            g.drawRect(10, 10, 375, 604);
            g.drawRect(10, 10, 375, 641);
            g.drawRect(10, 10, 375, 678);
            g.drawRect(10, 10, 375, 715);
            g.drawRect(10, 10, 375, 775);

            g.fillRect(10, 382, 375, 20);

            g.drawRect(335, 10, 50, 375);
            g.drawRect(335, 385, 50, 400);

            g.drawString("Ones: " ,15,46);
            g.drawString("Twos: " ,15,90);
            g.drawString("Threes:" , 15,131);
            g.drawString("Fours:" , 15,172);
            g.drawString("Fives:" , 15,213);
            g.drawString("Sixes:" , 15,254);
            g.drawString("Total Score:" , 15,295);
            g.drawString("Bonus:" , 15,336);
            g.drawString("Total Upper:" , 15,377);

            g.drawString("3 of a Kind:" , 15, 426);
            g.drawString("4 of a Kind:" , 15, 463);
            g.drawString("Full Hose:" , 15, 500);
            g.drawString("Sm. Straight:" , 15, 537);
            g.drawString("Lg. Straight:" , 15, 574);
            g.drawString("Yahtzee:" , 15, 611);
            g.drawString("Chance:" , 15, 648);
            g.drawString("Total Upper:" , 15, 685);
            g.drawString("Total Lower:" , 15, 722);
            g.drawString("Grand Total:" , 15,780 );



            g.drawString("" + score[0], 354,46);
            g.drawString("" + score[1], 354,90);
            g.drawString("" + score[2], 354,131);
            g.drawString("" + score[3], 354,172);
            g.drawString("" + score[4], 354,213);
            g.drawString("" + score[5], 354,254);
            g.drawString("" + tops, 354,295);
            g.drawString("" + bonust, 354,336);
            g.drawString("" + tu, 354,377);
            g.drawString("" + score[6], 354,426);
            g.drawString("" + score[7], 354,463);
            g.drawString("" + score[8], 354,500);
            g.drawString("" + score[9], 354,537);
            g.drawString("" + score[10], 354,574);
            g.drawString("" + score[11], 354,611);
            g.drawString("" + score[12], 354,648);
            g.drawString("" + tu, 354,685);
            g.drawString("" + tb, 354,722);
            g.drawString("" + all, 354,780);



            }
        }
}


