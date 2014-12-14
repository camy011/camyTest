public class EulerMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Euler30.run();
        System.out.println("Solution Time: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
