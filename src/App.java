public class App {
    public static int countDown(int n) {
        if (n == 0) {
            System.out.println("Blast off!");
        } else {
            System.out.println(n);
            countDown(n - 1);
            System.out.println(n);
        }
        return n;
    }
    public static int removeEven(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        int count = removeEven(arr, index + 1);
        if (arr[index] % 2 == 0) {
            return count + 1;
        } else {
            return count;

        }
        Systrrm.out.println('HELLO WORLD');
    }
    

    public static void main(String[] args) throws Exception {
        System.out.println(countDown(5));
    }
}
