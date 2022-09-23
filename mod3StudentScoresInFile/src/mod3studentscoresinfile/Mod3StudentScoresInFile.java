/** ****************************************************************************
 * Mod3StudentScoresInFile.java
 * Kevin Bell
 *
 * Input read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
package mod3studentscoresinfile;

import java.io.*;
import java.nio.file.*;
import java.nio.*;
import java.util.*;

public class Mod3StudentScoresInFile {

    public static void main(String[] args) {
        String filename = "gradebook.txt";
        Path path;
        System.out.println("Module 3 Student Scores by Kevin Bell \n");
        path = Paths.get(filename);
        Scanner computerKeyboardInput = new Scanner(System.in);
        if (Files.exists(path)) {
            System.out.println("Files exsists already");
        } else {
            File outputFile = new File("file.txt");
            FileWriter out;
            BufferedWriter writeFile;
            String input;
            try {
                out = new FileWriter(outputFile);
                writeFile = new BufferedWriter(out);
                for (int i = 0; i < 10; i++) {
                    if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8) {
                        System.out.print("Enter student name: ");
                        input = computerKeyboardInput.nextLine();
                        writeFile.write(input);
                        writeFile.newLine();
                    } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9) {
                        System.out.print("Enter test score: ");
                        input = computerKeyboardInput.nextLine();
                        writeFile.write(input);
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
        } // end if/else condition
        // load information from text file
        File textFile = new File("file.txt");
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
        String input;
        char guess;
        //play game
        String response = "y";
        while (response.equalsIgnoreCase("y")) {
            //Get random number so you can call that posion of the array list.
            int randomNumber = (int) (Math.random() * 5 + 1);
            Game game = new Game(listOfWords.get(randomNumber)); //create game
            game.display(); //display the board
            do {
                System.out.print("Guess a letter: ");
                input = computerKeyboardInput.nextLine();
                guess = input.charAt(0);
                game.findLetter(guess); //find letter  
            } while (!game.isGameOver()); //check if game over
            //end game
            System.out.println("Congratulations");
            System.out.print("Do you want to play again? (y or n) ");
            response = computerKeyboardInput.nextLine();
        } // end while loop
    } // end main method  
} // end Mod3StudentScoresInFile class
