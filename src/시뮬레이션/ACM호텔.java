package 시뮬레이션;

import java.util.Scanner;

/**
 * 주기성을 가지는 이동 or 배치 - 몫과 나머지
 */
public class ACM호텔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            // O(1)
            // 순서에 대한 연산은 N - 1을 해도 순서가 유지된다
            int distance = (N - 1) / H + 1; // 1호부터 시작하도록 고정 (1을 더해주기)
            int floor = (N - 1) % H + 1;
            System.out.printf("%d%02d\n", floor, distance);
        }
    }
}
