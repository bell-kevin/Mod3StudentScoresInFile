/** ****************************************************************************
 * Mod3StudentScoresInFile.java
 * Kevin Bell
 *
 * Input read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
package mod3studentscoresinfile;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Mod3StudentScoresInFile {

    public static void main(String[] args) {
        String filename = "gradebook.txt";
        Path path;
        System.out.println("Module 3 Student Scores by Kevin Bell \n");
        path = Paths.get(filename);
        Scanner computerKeyboardInput = new Scanner(System.in);
        File outputFile = new File("gradebook.txt");
        FileWriter out;
        BufferedWriter writeFile;
        String input, filenameOut = "", filenameIn = "", line = "", name;
        double lowScore, highScore, averageScore, currentScore = 0, score;
        try {
            out = new FileWriter(outputFile);
            writeFile = new BufferedWriter(out);
            for (int i = 0; i < 10; i++) {
                if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8) {
                    System.out.print("Enter student name: ");
                    name = computerKeyboardInput.next();
                    writeFile.write(name);
                    writeFile.newLine();
                } else {
                    System.out.print("Enter test score: ");
                    score = computerKeyboardInput.nextDouble();
                    writeFile.write(String.valueOf(score));
                    writeFile.newLine();
                } // end if/else if condition
            } // end for loop
            writeFile.close();
            out.close();
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Problem writing to file.");
            System.out.println("Exception: " + e.getMessage());
        } // end try/catch block
        File textFile = new File("gradebook.txt"); // load info from text file
        FileReader in;
        BufferedReader readFile;
        String lineOfText = "";
        ArrayList<String> listOfWords = new ArrayList<>();
        try {
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null) {
                listOfWords.add(lineOfText);
            } // end while loop
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.out.println("Exception: " + e.getMessage());
        } // end catch
        for (int i = 0; i < listOfWords.size(); i++) {
            System.out.println(listOfWords.get(i) + " ");
        } // end for loop
        System.out.println("Low score: ");
        System.out.println("High score: ");
        System.out.println("Average score: ");
    } // end main method  
} // end Mod3StudentScoresInFile class
