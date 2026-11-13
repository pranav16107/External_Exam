import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Complex_7 extends JFrame implements ActionListener {
    JRadioButton red, yellow, green;
    JLabel msg;
    ButtonGroup bg;

    public Complex_7() {
        setTitle("Traffic Light");

        msg = new JLabel("", JLabel.CENTER);
        msg.setFont(new Font("Arial", Font.BOLD, 22));
        add(msg, BorderLayout.NORTH);

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        bg = new ButtonGroup();
        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        JPanel panel = new JPanel();
        panel.add(red);
        panel.add(yellow);
        panel.add(green);
        add(panel, BorderLayout.CENTER);

        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (red.isSelected()) {
            msg.setText("Stop");
            msg.setForeground(Color.RED);
        } else if (yellow.isSelected()) {
            msg.setText("Ready");
            msg.setForeground(Color.YELLOW);
        } else if (green.isSelected()) {
            msg.setText("Go");
            msg.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Complex_7();
    }
}