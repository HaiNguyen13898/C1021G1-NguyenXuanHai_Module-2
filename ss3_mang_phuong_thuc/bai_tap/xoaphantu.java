package ss3_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);


            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();


        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
