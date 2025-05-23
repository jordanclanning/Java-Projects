import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{

    int id;
    int yVelocity;
    int speed = 10;

    
    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id = id;


    }

    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode()==KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                    
                }
                if (e.getKeyCode()==KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode()==KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    move();
                    
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    move();
                }
            
                break;
        }
        
    }

    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
            if (e.getKeyCode()==KeyEvent.VK_W) {
                setYDirection(-speed);
                move();
                
            }
            if (e.getKeyCode()==KeyEvent.VK_S) {
                setYDirection(speed);
                move();
            }
            break;
        case 2:
            if (e.getKeyCode()==KeyEvent.VK_UP) {
                setYDirection(-speed);
                move();
                
            }
            if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                setYDirection(speed);
                move();
            }
        
            break;
        }

    }
    public void setYDirection(int setYDirection) {
        yVelocity = setYDirection;

    }

    public void move() {
        y = y + yVelocity;

    }

    public void draw(Graphics g) {
        if(id==1)
            g.setColor(Color.ORANGE);

        else 
            g.setColor(Color.blue);

        g.fillRect(x, y, width, height);

    }

}
