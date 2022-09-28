package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        Divide(5,0);
        Divide(5,5);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        CheckFileExtension(studentFiles.get("Carl"));
//        CheckFileExtension(studentFiles.get("Brad"));
        CheckFileExtension(studentFiles.get("Elizabeth"));
        CheckFileExtension(studentFiles.get("Stefanie"));
    }

    public static int Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Trying to divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName) {
        int totalScore = 0;

        if (fileName.contains(".java")) {
            totalScore++;
        }

        if (fileName == null || fileName == "") {
            try {
                throw new CheckFileException("Missing Assignment?");
            } catch (CheckFileException e) {
                e.printStackTrace();
            }

        }
        return totalScore;
    }
}
