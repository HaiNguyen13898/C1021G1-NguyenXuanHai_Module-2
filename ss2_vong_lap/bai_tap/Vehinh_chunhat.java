package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class Vehinh_chunhat {
    public static void main(String[] args){
        int m, n;
        Scanner scanner =new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
