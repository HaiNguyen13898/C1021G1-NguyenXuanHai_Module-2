package ss3_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Giatrinhonhat {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap độ dài của mảng ");
        n = scanner.nextInt();
        int myarr[] = new int[n];
        for (int i = 0; i < myarr.length; i++) {
            System.out.print("Nhap phan tu thu " + i + " ");
            myarr[i] = scanner.nextInt();
        }
        System.out.print("Mang vua nhap có các phần tử là \t");
        for (int i = 0; i < myarr.length; i++) {
            System.out.print(myarr[i] + " ");
        }
        int min = myarr[0];
        for (int i = 0; i < myarr.length; i++) {
            if (min > myarr[i]) {
                min = myarr[i];
            }
        }
        System.out.println("giạ trị nhỏ nhất là :" + min);
    }
}
