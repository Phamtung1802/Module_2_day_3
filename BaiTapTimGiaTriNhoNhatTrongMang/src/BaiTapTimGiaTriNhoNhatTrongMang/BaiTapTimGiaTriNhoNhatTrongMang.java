package BaiTapTimGiaTriNhoNhatTrongMang;

import java.util.Scanner;

public class BaiTapTimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + i + " ");
            int ele = scanner.nextInt();
            arr[i] = ele;
        }
        printArray(arr);
        System.out.print("\n\nMin= " + findMin(arr));
    }

    public static void printArray(int[] array) {
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

