import java.io.*;
import java.util.*;

public class Complex_9 {

    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Phone.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String data[] = line.split("\t");
                ht.put(data[0], data[1]);
            }
            br.close();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name or phone number: ");
            String search = sc.nextLine();
            if (ht.containsKey(search)) {
                System.out.println("Phone Number: " + ht.get(search));
            }
            else if (ht.containsValue(search)) {
                for (String name : ht.keySet()) {
                    if (ht.get(name).equals(search)) {
                        System.out.println("Name: " + name);
                        break;
                    }
                }
            }
            else {
                System.out.println("Record not found!");
            }
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}