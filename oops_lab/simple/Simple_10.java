import java.io.File;
public class Simple_10 {
    public static void listFiles(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f.getName());
                }
                else if (f.isDirectory()) {
                    listFiles(f);
                }
            }
        }
    }
    public static void main(String[] args) {
        File dir = new File("C:/Users/Student/Documents");
        listFiles(dir);
    }
}