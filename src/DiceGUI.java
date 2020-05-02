import java.awt.*;
import javax.swing.*;


public class DiceGUI {


    private int WIDTH = 320;
    private int HEIGHT = 75;

 
    private JFrame frame; //Java window
    private myJPanel panel; //Container for stuff in the frame

    private DieDrawing[] dice = new DieDrawing[5];
    private DieDrawing[] hold = new DieDrawing[5];
    public DiceGUI(){
        //4.Instantiate the frame and panel
       

        frame = new JFrame("Your Dice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new myJPanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        //5. Put the panel into the frame content pane
        frame.getContentPane().add(panel);
       
        //6. Set the frame size at or above preferred size
        frame.pack();
       

        frame.setVisible(true);
    }

    public void display(int[] v,int[] x){
        dice[0] = new DieDrawing(v[0], 10, 10,x[0]);
        dice[1] = new DieDrawing(v[1], 70, 10,x[1]);
        dice[2] = new DieDrawing(v[2], 130, 10,x[2]);
        dice[3] = new DieDrawing(v[3], 190, 10,x[3]);
        dice[4] = new DieDrawing(v[4], 250, 10,x[4]);

        panel.repaint();
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
              dice[0].draw(g);
              dice[1].draw(g);
              dice[2].draw(g);
              dice[3].draw(g);
              dice[4].draw(g);
              
            }







            
        }
}