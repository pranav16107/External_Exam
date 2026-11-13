import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Complex_5 extends JFrame {
    JLabel l;
    Complex_5() {
        setTitle("Mouse Events");
        setSize(300, 250);
        setLayout(new BorderLayout());
        l = new JLabel("Perform Mouse Events", JLabel.CENTER);
        add(l, BorderLayout.CENTER);
        l.addMouseListener(new MouseAdapter() {
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Complex_5();
    }
}
