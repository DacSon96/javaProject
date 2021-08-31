package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file:");
        String filePart = scanner.nextLine();
        List<Integer> numbers = readFileText(filePart);
        int max =findMax(numbers);
        writeFile(filePart,max);

    }

    public static List<Integer> readFileText(String filePart) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePart);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine())!=null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
        System.err.println("File không tồn tại hoặc nội dung có lỗi");
    }
        return numbers;
}
    public static void writeFile(String filePart, int max) {
        try {
            FileWriter write  = new FileWriter(filePart,true);
            BufferedWriter bufferedWriter = new BufferedWriter(write);
            bufferedWriter.write("\nGiá trị lớn nhất là: "+max);
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
