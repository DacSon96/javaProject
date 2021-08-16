package com.company;

public class TriangleClassifier {
    public static double triangleClassifier(double a, double b, double c) {
        if ((a+b<=c)||(a+c<=b)||(c+b<=a)) {
            return 0;// khong phai tam giac
        } else if ((a==b)&&(b==c)) {
            return 1;//tam diac deu
        } else if ((a==c)||(b==c)||(a==b)) {
            return 2;//tam giac can
        } else
            return 3;//tam giac thuong
    }
}
