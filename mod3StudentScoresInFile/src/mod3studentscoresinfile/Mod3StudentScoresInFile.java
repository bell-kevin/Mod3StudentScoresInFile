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
        String name;
        int count = 5;
        double lowScore, highScore = 0, averageScore = 0, score = 0, sum = 0;
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
        BufferedReader readFile = null;
        String lineOfText;
        ArrayList<String> gradeBook = new ArrayList<>();
        String line1 = null, line3 = null, line5 = null, line7 = null,
                line9 = null;
        try {
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null) {
                gradeBook.add(lineOfText);
            } // end while loop
            readFile.close();
            in.close();
            line1 = Files.readAllLines(Paths.get("gradebook.txt")).get(1);
            line3 = Files.readAllLines(Paths.get("gradebook.txt")).get(3);
            line5 = Files.readAllLines(Paths.get("gradebook.txt")).get(5);
            line7 = Files.readAllLines(Paths.get("gradebook.txt")).get(7);
            line9 = Files.readAllLines(Paths.get("gradebook.txt")).get(9);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.out.println("Exception: " + e.getMessage());
        } // end catch
        for (int i = 0; i < gradeBook.size(); i++) {
            System.out.println(gradeBook.get(i) + " ");
        } // end for loop
        double newLine1 = Double.parseDouble(line1),
                newLine3 = Double.parseDouble(line3),
                newLine5 = Double.parseDouble(line5),
                newLine7 = Double.parseDouble(line7),
                newLine9 = Double.parseDouble(line9);
        sum = newLine5 + newLine1 + newLine3 + newLine7 + newLine9;
        averageScore = sum / count;
        double number = Math.max(newLine1, newLine3),
                highNumber = Math.max(number, newLine5),
                higherNumber = Math.max(highNumber, newLine7),
                highestNumber = Math.max(higherNumber, newLine9);
        highScore = highestNumber;
        double kevin = Math.min(newLine1, newLine3),
                kevin2 = Math.min(kevin, newLine5),
                kevin3 = Math.min(kevin2, newLine7),
                kevin4 = Math.min(kevin3, newLine9);
        lowScore = kevin4;
        System.out.println("Low score: " + lowScore);
        System.out.println("High score: " + highScore);
        System.out.println("Average score: " + averageScore);
    } // end main method  
} // end Mod3StudentScoresInFile class
