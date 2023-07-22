package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
        System.out.println(Divide(6 , 0));
        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y) throws Error {
        if (y == 0) {
            throw new Error("you cannot divide by zero!");
        }
        return x / y;
        // Write code here!
    }

    public static int CheckFileExtension(String fileName) throws Error {
        int score = 0;
        if (fileName.contains(".java")) {
             score++;
        } else if (!fileName.contains(".java")) {
             score--;

        } else if (fileName.equals("")) {
            score--;
            throw new Error("Cannot be empty");
            // System.out.println("Wrong score");
        }
    return score;
    }
}
