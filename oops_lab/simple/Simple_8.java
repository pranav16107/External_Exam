import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Simple_8 extends JFrame {

    JLabel l;

    Simple_8() {

        setTitle("Mouse Events");
        setSize(400, 300);
        setLayout(new FlowLayout());

        l = new JLabel("Perform Mouse Events");
        add(l);

        // Mouse events
        addMouseListener(new MouseAdapter() {

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
        });

        // Mouse movement events
        addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {
                l.setText("Mouse Moved");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                l.setText("Mouse Dragged");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Simple_8();
    }
}