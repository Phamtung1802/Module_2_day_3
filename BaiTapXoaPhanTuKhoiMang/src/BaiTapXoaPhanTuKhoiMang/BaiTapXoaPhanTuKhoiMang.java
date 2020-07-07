package BaiTapXoaPhanTuKhoiMang;

import java.util.Scanner;

public class BaiTapXoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 12, 7, 8, 1, 6, 9, -10, 12, 3};
        printArray(arr);
        DeleteElement(arr);
        printArray(arr);

    }

    public static void printArray(int[] array) {
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    public static boolean check(int[] array, int ele) {
        boolean a=false;
        for (int j = 0; j < array.length; j++) {
            if(ele==array[j]){
                a=true;
            }
        }
        return a;
    }

    public static int[] DeleteElement(int[] array) {
        Scanner input = new Scanner(System.in);
        int phanTuMuonXoa = 0;
        do {
            System.out.println("enter element you want to delete");
            phanTuMuonXoa = input.nextInt();
            if (check(array,phanTuMuonXoa)==false) System.out.println("element must be within array");
        } while (check(array,phanTuMuonXoa)==false);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == phanTuMuonXoa) {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for(int j=i+1;j<array.length;j++) {
                if (array[i] == 0) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
