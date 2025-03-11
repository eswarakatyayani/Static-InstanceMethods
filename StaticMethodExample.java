public class StaticMethodExample {
    // Static method
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Calling static method directly
        int result = StaticMethodExample.square(5);
        System.out.println("Square of 5: " + result); // Output: Square of 5: 25
    }
}
