public class RuntimeDemo {
    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();

        int a = 10;
        int b = 20;
        long interval = 300;

        int mult = a * b;
        System.out.println("Multiplication of a and b: " + mult);
        Thread.sleep(interval);

        long duration = (System.nanoTime() - start) / 1000000;

        System.out.println(duration + "ms");
    }
}
