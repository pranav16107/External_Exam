
package oops_lab.complex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Complex_6 extends JFrame implements ActionListener {
    JTextField display;
    double n1, n2;
    char op;
    public Complex_6() {
        setTitle("Simple Calculator");
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        String buttons[] = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "%", "=", "C"
        };
        for (String b : buttons) {
            JButton btn = new JButton(b);
            panel.add(btn);
            btn.addActionListener(this);
        }
        add(panel, BorderLayout.CENTER);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        try {
            if (s.matches("[0-9]")) {
                display.setText(display.getText() + s);
            }
            else if (s.equals("C")) {
                display.setText("");
            }
            else if (s.equals("=")) {
                n2 = Double.parseDouble(display.getText());
                switch (op) {
                    case '+':
                        display.setText("" + (n1 + n2));
                        break;
                    case '-':
                        display.setText("" + (n1 - n2));
                        break;
                    case '*':
                        display.setText("" + (n1 * n2));
                        break;
                    case '%':
                        if (n2 == 0)
                            throw new ArithmeticException();
                        display.setText("" + (n1 / n2));
                        break;
                }
            }
            else {
                n1 = Double.parseDouble(display.getText());
                op = s.charAt(0);
                display.setText("");
            }
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a number first!");
            display.setText("");
        }
        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
            display.setText("");
        }
    }
    public static void main(String[] args) {
        new Complex_6();
    }
}
