package oops_lab.complex;

import java.awt.event.*;
import javax.swing.*;
public class Complex_5 extends JFrame implements MouseListener {
   JLabel l;
    Complex_5() {
        l = new JLabel("Perform Mouse Events", JLabel.CENTER);
        add(l);
        addMouseListener(this);
        setTitle("Mouse Events");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

   @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

   @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

   @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

   @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

   @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new Complex_5();
    }
}
