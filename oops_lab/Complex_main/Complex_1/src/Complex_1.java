import java.util.*;
public class Complex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read expression and remove '='
        System.out.print("Enter expression: ");
        String s = sc.nextLine().replace("=", "");
        double result = 0, num;
        char op = '+';
        // Read the expression character by character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check for a digit or decimal point
            if (Character.isDigit(c) || c == '.') {
                int j = i;
                // Read all digits and the decimal point
                while (i < s.length() &&
                       (Character.isDigit(s.charAt(i)) ||
                        s.charAt(i) == '.')) {
                    i++;
                }
                // Convert the extracted number into double
                num = Double.parseDouble(s.substring(j, i));
                i--;
                // Perform the stored operation
                if (op == '+') result += num;
                if (op == '-') result -= num;
                if (op == '*') result *= num;
                if (op == '/') result /= num;
            } else {
                // Store the operator for the next number
                op = c;
            }
        }
        // Display the final answer
        System.out.println("Result = " + result);
        sc.close();
    }
}