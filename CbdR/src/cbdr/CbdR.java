/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbdr;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;


/**
 *
 * @author demarchenac
 */
public class CbdR extends JFrame implements WindowListener, ActionListener{
    
    static int cnt = 0;
    
    public CbdR() throws HeadlessException {
        
        
        setSize(160,80);
        setResizable(false);
        setTitle("Pokemon");
        setLocationRelativeTo(null);
        setVisible(true);
        JButton start = new JButton("Start?");
        start.setSize(80, 40);
        add(start);
        start.addActionListener(this);
    
        
        
    }
    
  
    static JFrame mainMenu;
    public static void main(String[] args) {
         mainMenu = new CbdR();        
    }

    @Override
    public void windowOpened(WindowEvent we) {
        }

    @Override
    public void windowClosing(WindowEvent we) {
        }

    @Override
    public void windowClosed(WindowEvent we) {
        
        }

    @Override
    public void windowIconified(WindowEvent we) {
        }

    @Override
    public void windowDeiconified(WindowEvent we) {
        }

    @Override
    public void windowActivated(WindowEvent we) {
        }

    @Override
    public void windowDeactivated(WindowEvent we) {
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        cnt = cnt +1;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ".");
            
            }
            mainMenu.setVisible(false);
            mainMenu = null;
            
            JFrame output1 = new CbdR();
         
            output1.setSize(800,300);
        }
    
}
