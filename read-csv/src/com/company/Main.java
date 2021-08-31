package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader("src/country.csv"));
            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printCountry(List<String> country) {
        System.out.println("[id="
                + country.get(0)
                + ",Code= " + country.get(1)
                + ", Name= " + country.get(2)
                + "]");
    }
}
