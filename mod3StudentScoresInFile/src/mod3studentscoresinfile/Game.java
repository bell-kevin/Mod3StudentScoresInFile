/** ****************************************************************************
 * Game.java
 * Kevin Bell
 *
 * This class is associated with HangmanWithDictionaryFile.java
 **************************************************************************** */
package mod3studentscoresinfile;

class Game {

    private char[][] game; // multi-dimensional array
    private String word;
    private int wordLength;

    public Game(String word) {
        wordLength = word.length();
        game = new char[2][wordLength];
        for (int i = 0; i < wordLength; i++) {
            game[0][i] = word.charAt(i);
            game[1][i] = '=';
        } //end for loop
    } // end Game constructor

    public void display() {
        for (int i = 0; i < wordLength; i++) {
            System.out.printf("  %s", game[1][i]);
        } //end for loop
        System.out.println("");
    } //end display method

    public void findLetter(char guess) {
        int count = 0;
        for (int i = 0; i < wordLength; i++) {
            if (guess == game[0][i]) {
                game[1][i] = guess;
                count++;
            } //end if condition
        } //end for loop
        if (count > 0) {
            System.out.printf("Fount it %d times\n", count);
        } else {
            System.out.println("Letter was not found");
        } //end if/else condition
        display();
    } //end findLetter method

    public boolean isGameOver() {
        for (int i = 0; i < wordLength; i++) {
            if (game[0][i] != game[1][i]) {
                return false;
            } // end if condition
        } //end for loop
        return true;
    } //end isGameOver  
} //end class Game
