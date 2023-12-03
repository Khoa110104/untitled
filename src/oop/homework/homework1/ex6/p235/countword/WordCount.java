package oop.homework.homework1.ex6.p235.countword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    // Thực hiện trên đoạn văn bản được nhập vào từ bàn phím
    public static void usingEnterFromKeyboard () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a list of words:");
        String line = scanner.nextLine();
        // Loại bỏ các dấu chấm, dấu phẩy và chuyển các từ về in thường để duyệt
//        line = line.replaceAll("[^a-zA-Z1-9 ]", "").toLowerCase();
        line = line.replaceAll("[^a-zA-Z0-9àáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđĐ ]", "").toLowerCase();
        // Lưu các từ trong văn bản vào mảng
        String[] listWord = line.split(" ");
        // Tạo Map để lưu từ(key) và số lần xuất hiện(value)
        Map<String, Integer> wordAndCount = new HashMap<>();

        // Duyệt từng phần tử trong mảng
        for (int i = 0 ; i < listWord.length;i++) {
            listWord[i] = listWord[i].toLowerCase();
            // Nếu phần tử đã xuất hiện trong Map -> cập nhật tăng value lên 1
            if (wordAndCount.containsKey(listWord[i])) {
                int count = wordAndCount.get(listWord[i]);
                count++;
                wordAndCount.put(listWord[i], count );
                // Nếu phần tử chưa xuất hiện trong Map -> Tạo 1 key là phần tử, value =1
            } else {
                wordAndCount.put(listWord[i], 1);
            }
        }
        System.out.println("Number of occurrences of each word:");
        for (Map.Entry<String, Integer> entry : wordAndCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    // Thực hiện trên đoạn văn bản được lấy từ file
    public static void usingReadFile () {
        Scanner scanner = new Scanner(System.in);
        // Nhập vào địa chỉ file cần làm việc
        System.out.print("Enter the path of the file you want to do: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            // Tạo Map để lưu từ(key) và số lần xuất hiện(value)
            Map<String, Integer> wordCounts = new HashMap<>();

            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                // Loại bỏ các dấu câu
//                word = word.replaceAll("[^a-zA-Z1-9]", "").toLowerCase();
                word = word.replaceAll("[^a-zA-Z0-9àáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđĐ ]", "").toLowerCase();

                // Nếu phần tử đã xuất hiện trong Map -> cập nhật tăng value lên 1
                if (wordCounts.containsKey(word)) {
                    int count = wordCounts.get(word);
                    count++;
                    wordCounts.put(word, count);
                    // Nếu phần tử chưa xuất hiện trong Map -> Tạo 1 key là phần tử, value =1

                } else {
                    wordCounts.put(word, 1);
                }
            }

            System.out.println("Word Counts:");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            // Nếu lỗi địa chỉ file sẽ in ra lỗi
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file: " + e.getMessage());
        }
    }
}