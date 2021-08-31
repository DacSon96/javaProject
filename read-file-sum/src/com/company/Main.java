package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dân file");
        String part = scanner.nextLine();

        readFileText(part);

    }

    public static void readFileText(String filePart) {
        try {
            File file = new File(filePart);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader((new FileReader(file)));
            String line ="";
            int sum = 0;
            while ((line = br.readLine())!=null) {
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            System.out.println("Tổng là: "+sum);
            br.close();

        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
    }
}
