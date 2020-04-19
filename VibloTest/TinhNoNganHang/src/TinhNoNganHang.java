import java.util.Scanner;

public class TinhNoNganHang {
    public static double[] calculate(double n, double x, int y, int k) {
        double[] result = new double[2];
        double currentDebt;
        int countMonth = 0;
        for (int i = 1; i <= k; i++) {
            n = n + n * (x/1200) - y;
            if (n <= 0 && y >= n) {
                return result = new double[]{0, 0};
            }
        }
        currentDebt = n;
        do{
            currentDebt = currentDebt + currentDebt* (x/1200) - y;
            countMonth++;
            if (currentDebt <= 0) {
                result = new double[]{n, countMonth};
                return result;
            }
        }
        while (countMonth <= 600);

        return result = new double[]{n, -1};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //so tien vay
        long n = scanner.nextLong();
        //lai suat phan tram theo nam
        double x = scanner.nextDouble();
        //so tien tra trong 1 thang
        int y = scanner.nextInt();

        //so thang da vay
        int k = scanner.nextInt();

        if (calculate(n, x, y, k)[0] > 0) {
            System.out.println((long)Math.ceil(calculate(n, x, y, k)[0]) - 1);
        }
        else {
            System.out.println((long)Math.ceil(calculate(n, x, y, k)[0]));
        }
        System.out.println((int)Math.ceil(calculate(n, x, y, k)[1]));

    }
}
