import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        int size, min, max;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        size = scanner.nextInt();
        Integer arr[] = new Integer[size];
        System.out.printf("수를 입력하세요: ");
        Scanner intscanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = intscanner.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < size; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        for (int i = 1; i < size; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}
