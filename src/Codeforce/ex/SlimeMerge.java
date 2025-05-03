package Codeforce.ex;

import java.util.Scanner;

public class SlimeMerge{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sizes = new int[n];
        for (int i = 0; i < n; i++) {
            sizes[i] = scanner.nextInt();
        }
        System.out.println(minMoves(n));
    }
    public static int minMoves(int n) {
        return n - 2;
    }
}
