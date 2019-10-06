/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Mohamed
 */
public class grapghics extends Applet  {
    
   public  void init ()
    {
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                  
                Graphics g=getGraphics();  
                  g.setColor(Color.white);  
                   g.fillOval(e.getX(),e.getY(),5,5);  
               
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
               setBackground(Color.BLACK);
                
            }
        });
        
        
       
        
        
        
    }
    
}