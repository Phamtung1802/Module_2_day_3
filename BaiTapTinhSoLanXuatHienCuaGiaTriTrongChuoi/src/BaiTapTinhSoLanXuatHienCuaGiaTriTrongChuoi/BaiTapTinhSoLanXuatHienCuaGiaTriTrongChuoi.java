package BaiTapTinhSoLanXuatHienCuaGiaTriTrongChuoi;

import java.util.Scanner;

public class BaiTapTinhSoLanXuatHienCuaGiaTriTrongChuoi {
    public static void main(String[] args) {
        int count=0;
        String str="Hello World";
       Scanner input=new Scanner(System.in);
       System.out.println("Enter Character");
       char character=input.next().charAt(0);
       input.nextLine();
       for(int i=0;i< str.length();i++){
           if(character==str.charAt(i)){
             count++;
           }
       }
        System.out.println("Charater "+character+" "+count+" times");
    }
}
