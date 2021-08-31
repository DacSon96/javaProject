package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {4,7,2,6,8,3,1,5};
        showArray(array);
        insertionSort(array);

    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
                showArray(array);
                System.out.println();
            }
            array[pos] = x;
            System.out.println("mang sau 1 vong lap");
            showArray(array);
            System.out.println();
            System.out.println("----------");
        }
    }
    public static void showArray(int[] array) {
        for (int pt : array) {
            System.out.print(pt+"  ");
        }
    }
}
