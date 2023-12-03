package oop.homework.homework1.ex5.p126.reverse;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {

//     Đảo ngược các kí tự trong 1 dòng
    public static String reverseLine(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }

    // Đảo ngược đoạn văn bản được nhập vào từ bàn phím
    public static void reverseTextWithInput() {
        ArrayList<String> text = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lines of text (Press Enter on an empty line to end input):");
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            text.add(line);
        }

        //In các dòng theo thứ tự ngược lại
        System.out.println("Text after inversion:");
        for (int i = text.size() - 1; i >= 0; i--) {
            System.out.println(text.get(i));
        }
    }


    // Đảo ngược đoạn văn bản được đọc từ file
    public static void reverseWithReadFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the file you want to reverse: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            StringBuilder reversedText = new StringBuilder();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String reversedLine = reverseLine(line);
                reversedText.append(reversedLine).append("\n");
            }

            System.out.print("Text after inversion:");
            System.out.println(reversedText.reverse());
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file: " + e.getMessage());
        }
    }
}
