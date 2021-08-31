package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
       selectionSort(list);
       for (double pt : list) {
           System.out.print(pt+"  ");
       }
    }
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length ; i++) {
            double curentMin = list[i];
            int curentMinIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (curentMin>list[j]) {
                    curentMin = list[j];
                    curentMinIndex = j;
                }
            }
            if (curentMin != list[i]) {
                double temp = list[i];
                list[i] = curentMin;
                list[curentMinIndex] = temp;
            }
        }
    }
}
