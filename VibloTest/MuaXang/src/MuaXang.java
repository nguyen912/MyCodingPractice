import java.util.Scanner;

public class MuaXang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int x, y, k;
        long minPay;

        for (int i = 0; i < line; i++) {
            k = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > y/2) {
                minPay = k%2==0 ? k/2*y :(k-1)/2*y+x;
            }
            else {
                minPay = k*x;
            }
            System.out.println(minPay);
        }
    }
}
