import javax.swing.*;

public class Simple_11 extends JFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame("JTable Example");

        String data[][] = {
            {"101", "Pranav", "CSE"},
            {"102", "Rahul", "IT"},
            {"103", "Arjun", "ECE"},
            {"104", "Kiran", "CSE"}
        };

        String column[] = {"Roll No", "Name", "Branch"};

        JTable jt = new JTable(data, column);

        JScrollPane sp = new JScrollPane(jt);

        f.add(sp);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}