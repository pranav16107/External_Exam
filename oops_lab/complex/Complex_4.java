package oops_lab.complex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Complex_4 extends JFrame implements ActionListener {
    JTextField num1, num2, result;
    JButton divide;
    Complex_4() {
        setTitle("Integer Division");
        setSize(300, 250);
        setLayout(new FlowLayout());
        add(new JLabel("Num1:"));
        num1 = new JTextField(10);
        add(num1);
        add(new JLabel("Num2:"));
        num2 = new JTextField(10);
        add(num2);
        add(new JLabel("Result:"));
        result = new JTextField(10);
        result.setEditable(false);
        add(result);
        divide = new JButton("Divide");
        add(divide);
        divide.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            int c = a / b;
            result.setText(String.valueOf(c));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter integers only!");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
        }
    }
    public static void main(String[] args) {
        new Complex_4();
    }
}