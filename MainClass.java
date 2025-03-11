public class MathUtils {
    // Static method
    public static int square(int num) {
        return num * num;
    }
}

public class MainClass {
    public static void main(String[] args) {
        int result = MathUtils.square(5); 
        System.out.println("Square of 5: " + result);
    }
}
