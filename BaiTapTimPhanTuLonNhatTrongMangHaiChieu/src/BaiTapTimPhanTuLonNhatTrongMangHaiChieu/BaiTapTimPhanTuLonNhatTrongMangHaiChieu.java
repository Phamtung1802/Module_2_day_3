package BaiTapTimPhanTuLonNhatTrongMangHaiChieu;

public class BaiTapTimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        initArray(arr);
        printArray(arr);
        System.out.print("\n\nmax= " + findMax(arr));
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

    public static int findMax(int[][] array) {
        int max = array[0][0];
        int maxRow = 0, maxColumn = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > max) {
                    max = array[row][column];
                    maxRow = row;
                    maxColumn = column;
                }
            }

        }
        return max;
    }
}
