package ThucHanhTimGiaTriNhoNhatTrongMangDungPhuongThuc;

public class ThucHanhTimGiaTriNhoNhatTrongMangDungPhuongThuc {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9,-10};
        System.out.println("The smallest element in the array is: " + checkMin(arr));
    }

    public static int checkMin(int[] array){
        int min=array[0];
        int index = 0;
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }
        return array[index];
    }
}
