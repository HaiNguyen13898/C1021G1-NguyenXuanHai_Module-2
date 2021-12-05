package ss1_intruduction_Java.bai_tap;
import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner sc=new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD ");
        usd=sc.nextDouble();
        double quydoi= vnd*23000;
        System.out.print("Gia tri vnd "+ quydoi);
    }
}
