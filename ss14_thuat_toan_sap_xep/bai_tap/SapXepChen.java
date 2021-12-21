package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class SapXepChen {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--){
                array [k +1] = array[k];
            }
            array[k +1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int myArray [] = {1, 6, 7, 8, 9, 2, 4};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
