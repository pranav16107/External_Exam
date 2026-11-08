package oops_lab.complex;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Complex_8 extends JFrame {

    Complex_8() {
        setTitle("Display Table");

        try {
            BufferedReader br = new BufferedReader(new FileReader("Table.txt"));

            String line;
            JPanel panel = new JPanel();

            String firstLine = br.readLine();
            String data[] = firstLine.split(",");

            panel.setLayout(new GridLayout(0, data.length, 5, 5));

            for (String s : data) {
                panel.add(new JLabel(s, JLabel.CENTER));
            }

            while ((line = br.readLine()) != null) {
                data = line.split(",");

                for (String s : data) {
                    panel.add(new JLabel(s, JLabel.CENTER));
                }
            }

            br.close();

            add(panel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "File not found!");
        }

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Complex_8();
    }
}