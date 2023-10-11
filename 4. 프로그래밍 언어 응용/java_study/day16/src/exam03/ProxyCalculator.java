package exam03;

public class ProxyCalculator implements Calculator {

    private Calculator cacluator;

    public ProxyCalculator(Calculator calculator) {
        this.cacluator = calculator;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime();
        try {
            long result = cacluator.factorial(num); // 핵심 기능

            return result;
        } finally {
            long etime =System.nanoTime();
            System.out.printf("소요 시간 : %d%n", etime-stime);
        }
    }
}
