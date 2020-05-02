
import java.awt.*;
import javax.swing.*;

public class DieDrawing {

    final int WIDTH = 100;
    int face;
    int sx;
    int sy;
    int sa;
    
    public DieDrawing(int fac, int x, int y, int a){
    face = fac;
    sx = x;
    sy = y;
    sa = a;

    }
    public int setFace(int x){
            x=x;
        return x;
    }
    public void draw(Graphics g){

       if(sa==0){
           g.setColor(Color.black);
       }else{
           g.setColor(Color.red);
       }
      

    g.drawRoundRect(sx, sy, 50, 50, 10, 10);
     // g.drawRect(sx,sy,50,50);

      g.setColor(Color.black);

if(face == 1){
g.fillOval(sx + 23, sy + 23, 7, 7);
}
if(face == 2){
g.fillOval(sx + 15, sy + 15, 7, 7);
g.fillOval(sx + 30, sy + 30, 7, 7);
}
if(face == 3){
g.fillOval(sx + 10, sy + 10, 7, 7);
g.fillOval(sx + 20, sy + 20, 7, 7);
g.fillOval(sx + 30, sy + 30, 7, 7);
}
if(face == 4){
g.fillOval(sx + 10, sy + 10, 7, 7);
g.fillOval(sx + 10, sy + 30, 7, 7);
g.fillOval(sx + 30, sy + 10, 7, 7);
g.fillOval(sx + 30, sy + 30, 7, 7);

}
if(face == 5){
g.fillOval(sx + 10, sy + 10, 7, 7);
g.fillOval(sx + 10, sy + 30, 7, 7);
g.fillOval(sx + 20, sy + 20, 7, 7);
g.fillOval(sx + 30, sy + 10, 7, 7);
g.fillOval(sx + 30, sy + 30, 7, 7);
}
if(face == 6){
g.fillOval(sx + 10, sy + 10, 7, 7);
g.fillOval(sx + 10, sy + 20, 7, 7);
g.fillOval(sx + 10, sy + 30, 7, 7);
g.fillOval(sx + 30, sy + 10, 7, 7);
g.fillOval(sx + 30, sy + 20, 7, 7);
g.fillOval(sx + 30, sy + 30, 7, 7);
}

    }
}
