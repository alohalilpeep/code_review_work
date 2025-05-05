public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int step1 = add(5, 3);      // 5 + 3 = 8
        int step2 = dif(10, 6);     // 10 - 6 = 4
        int step3 = times(step1, step2); // 8 * 4 = 32
        int result = div(step3, 2);  // 32 / 2 = 16
        return result;
    }
}