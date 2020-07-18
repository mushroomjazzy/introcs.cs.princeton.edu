public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double result = (1 / Math.pow(i, r));
            sum += result;
        }
        System.out.println(sum);
    }
}