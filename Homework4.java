import java.util.Scanner;
class GetGcd{
    int gcd(int m, int n) {
        if (n == 0)
            return m;
        else if (m % n ==0)
            return n;
        else
            m = m % n;
            int temp = m;
            m = n;
            n = temp;
            return gcd(m, n);
    }
}
class GetGcdWhile{
    int gcd(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }
}
public class Homework4 {
    public static void main(String[] args) {
        System.out.printf("두 수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        GetGcd getGcd = new GetGcd();
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", getGcd.gcd(m, n));
    }
}
