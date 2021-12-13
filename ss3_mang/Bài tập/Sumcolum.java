package Mang.bai_tap;

import java.util.Scanner;

public class Sumcolum {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int tong = 0 ;
        for (int i = 0; i < m; i++) {
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + tong);
    }
}
