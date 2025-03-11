public class InstanceMethodExample {
    // Non-static method
    public int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Creating an object of the class
        InstanceMethodExample obj = new InstanceMethodExample();

        // Calling the non-static method using the object
        int result = obj.square(5);
        System.out.println("Square of 5: " + result); // Output: Square of 5: 25
    }
}
