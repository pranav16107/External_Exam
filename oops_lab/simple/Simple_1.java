// Write a Java program to print the sum of all elements of an array
public class Simple_1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all array elements: " + sum);
    }
}