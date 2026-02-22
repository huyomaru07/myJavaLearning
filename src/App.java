public class App {
    public static int countDown(int n) {
        if (n == 0) {
            System.out.println("Blast off!");
        } else {
            System.out.println(n);
            countDown(n - 1);
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
