package advanced.string;

public class StringPerformanceApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String testString = "";

        for (int i = 0; i<=10000; i++){
            testString +=i;
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("It took " + totalTime / 1000000 + "ms");
    }
}
