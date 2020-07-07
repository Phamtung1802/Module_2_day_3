package BaiTapThemPhanTuVaoMang;

import java.util.Scanner;

public class BaiTapThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 12, 7, 8, 0, 0, 0, 0, 0, 0};
        printArray(arr);
        addElement(arr);
        printArray(arr);
    }

    public static void printArray(int[] array) {
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    public static int[] addElement(int[] array) {
        Scanner input = new Scanner(System.in);
        int phanTuMuonThem = 0;
        int index = 0;
        do {
            System.out.println("enter element you want to add");
            phanTuMuonThem = input.nextInt();
            System.out.println("enter index you want to add");
            index = input.nextInt();
            if (index > array.length - 1 && index < 0) System.out.println("index must be within array");
        } while (index > (array.length - 1) && index < 0);
        if (array[index] == 0) {
            array[index] = phanTuMuonThem;
        }
        else {
            int temp = array[index];
            array[index] = phanTuMuonThem;
            for (int i = index+1; i < array.length-1; i+=2) {
               int temp2=array[i];
               int temp3=array[i+1];
               array[i]=temp;
               array[i+1]=temp2;
               temp=temp3;
            }
        }
        return array;
    }
}
