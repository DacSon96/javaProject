package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file cần copy");
        String source = scanner.nextLine();
        System.out.println("Nhập đích đến");
        String des = scanner.nextLine();

        File sourceFile = new File(source);
        File desFile = new File(des);

        try {
            copyFileUsingStream(sourceFile,desFile);
        } catch (IOException e) {
            System.out.println("không copy được file");
            System.out.println(e.getMessage());
        }
        // write your code here
    }
    private static void copyFileUsingJava7File(File source,File des) throws IOException {
        Files.copy(source.toPath(),des.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File des) throws IOException {
        InputStream is =null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(des);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
