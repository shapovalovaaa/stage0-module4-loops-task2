package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 0;
        while (currentNumber <= printToInclusive) {
            System.out.println(factorial(currentNumber));
            currentNumber++;
        }
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
