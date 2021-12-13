package Mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class themphantu {
    public static void main(String[] args) {
    int n, x;
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang arr");
    n = scanner.nextInt();
    int myarr [] = new int [n];

        for (int i = 0; i<myarr.length;i++){
        System.out.print("Nhap phan tu thu "+i+" ");
        myarr[i] = scanner.nextInt();
    }
        System.out.print("Mang vua nhap có các phần tử là \t");
        for (int i = 0; i < myarr.length; i++) {
        System.out.print( myarr[i]+" ");
    }
        System.out.print("\n Nhap X la phan tu can chen: ");
        x = scanner.nextInt();

        System.out.println("nhập vị trí cần chèn ");
        int index = scanner.nextInt();

        myarr = Arrays.copyOf(myarr, n+1);

        for (int i = n - 1; i >= index; i--) myarr[i + 1] = myarr[i];
        myarr[index] = x;
        for (int i = 0; i < myarr.length; i++) {
            System.out.println(myarr[i]);
        }
    }
 }


