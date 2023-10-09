package com.td.test.task34;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        String line = initLine();
        String encodedLine = encode(line);
        System.out.println(encodedLine);
        System.out.println(decode(encodedLine));
    }

    public static String initLine() {
        System.out.println("Enter line contains only letters");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        // проверка на наличие только букв в строке
        while (!line.matches("[a-zA-Z]+")) {
            System.out.println("Try again");
            line = scanner.nextLine();
        }
        return line;
    }

    public static String encode(String line) {
        String encodedLine = "";
        // если в строке одна буква, к ней присоединяется "1"
        if (line.length() == 1) {
            encodedLine = line.concat("1");
        } else {
            // переменная count хранит значение i в предыдущей итерации
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (i == 0) {
                    encodedLine = encodedLine.concat(String.valueOf(line.charAt(i)));
                } else {
                    encodedLine = encodedLine.concat((i - count) + "" + line.charAt(i));
                }
                count = i;
                // присваивание i индекса последней повторяющейся буквы
                while (i + 1 != line.length() && line.charAt(i) == line.charAt(i + 1)) {
                    i++;
                }
            }
            // присоединение к строке числа повторов последней буквы
            encodedLine = encodedLine.concat(String.valueOf(line.length() - count));
        }
        return encodedLine;
    }

    public static String decode(String line) {
        String decodedLine = "";
        char currentSymbol = 0;
        for (int i = 0; i < line.length(); i++) {
            if (i % 2 == 0) {
                currentSymbol = line.charAt(i);
                decodedLine = decodedLine.concat(String.valueOf(currentSymbol));
            } else {
                for (int j = 0; j < Integer.parseInt(String.valueOf(line.charAt(i))) - 1; j++) {
                    decodedLine = decodedLine.concat(String.valueOf(currentSymbol));
                }
            }
        }
        return decodedLine;
    }
}
