package BaiTapGopMang;

public class BaiTapGopMang {
    public static void main(String[] args) {
        int[] arr1 = {4, 12, 12, 7, 8, 39, 12, 14, 3, 9, 0};
        int[] arr2 = {4, 3, 1, 3, 6};
        int[] arr3= new int[arr1.length+arr2.length];
        addElementToArray(arr1,arr3,0);
        addElementToArray(arr2,arr3,arr1.length);
        printArray(arr3);
    }

    public static void printArray(int[] array) {
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
    public static void addElementToArray(int[] array1,int[] array2,int FirstIndex) {
        for(int i=0; i<array1.length;i++, FirstIndex++){
            array2[FirstIndex]=array1[i];
        }
    }

}
