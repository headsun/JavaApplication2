/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author vcaccia
 */
public class HelloComponent2 extends JComponent
        implements MouseMotionListener {

    String theMessage;
    int messageX = 125, messageY = 95; // Coordinates of the message

    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {

// Save the mouse coordinates and paint the message.
        messageX = e.getX();
        messageY = e.getY();

        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }
}
