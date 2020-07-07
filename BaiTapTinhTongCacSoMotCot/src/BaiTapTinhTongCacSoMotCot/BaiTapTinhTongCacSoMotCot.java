package BaiTapTinhTongCacSoMotCot;

import java.util.Scanner;

public class BaiTapTinhTongCacSoMotCot {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        Scanner input= new Scanner(System.in);
        int cotCanTinh=input.nextInt();
        initArray(arr);
        printArray(arr);
        System.out.print("\n\ntong= " + tinhTong(arr, cotCanTinh));
    }
    public static void printArray(int[][] array) {
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int row = 0; row < array.length; row++) {
            System.out.print("\n\n");
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + "\t");
            }
        }
    }
    public static void initArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = (int) (Math.random() * 100);
            }
        }
    }
    public static int tinhTong(int[][] array,int inputCol) {
        int sum=0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if(column==inputCol){
                    sum+=array[row][column];
                }
            }
        }
        return sum;
    }
}
