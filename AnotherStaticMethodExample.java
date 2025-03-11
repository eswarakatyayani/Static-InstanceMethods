public class AnotherStaticMethodExample {
    // Now this method is static
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(5); // Now it's valid!
        System.out.println("Square of 5: " + result); // Output: Square of 5: 25
    }
}
