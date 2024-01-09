import java.util.Random;
import java.util.Scanner;

public class Phrase {
    // All possible strings + their hidden versions
    String[] possiblePhrases = {
            "Let the force be with you",
            "___ ___ _____ __ ____ ___",
            "Here's Johnny",
            "____'_ ______",
            "Get to the chopper",
            "___ __ ___ _______",
            "Sex Drugs and Rock and Roll",
            "___ _____ ___ ____ ___ ____",
            "Hasta la vista baby",
            "_____ __ _____ ____",
            "Toto, I've a feeling we're not in Kansas anymore",
            "____, _'__ _ _______ __'__ ___ __ ______ _______",
            "A boy's bestfriend is his mother",
            "_ ___'_ __________ __ ___ ______",
            "Keep your friends close but your enemies closer",
            "____ ____ _______ _____ ___ ____ _______ ______",
            "You talking to me",
            "___ _______ __ __",
            "I see dead people",
            "_ ___ ____ ______"
    };

    // Amount wrong on
    int chances = 6;

    // The game phrases
    String phrase;
    String codedPhrase;
    String[] splitPhrase;
    String[] splitCoded;

    // Methods
    void splitter() {
        this.splitPhrase = this.phrase.split("");
        this.splitCoded = this.codedPhrase.split("");
    }

    void searcher(String target) {
        boolean checker = false;
        for (int i = 0; i < this.splitPhrase.length; i++) {
            if (target.toLowerCase().equals(this.splitPhrase[i].toLowerCase())) {
                StringBuilder stringBuilder = new StringBuilder();
                checker = true;
                this.splitCoded[i] = this.splitPhrase[i];

                // this.codedPhrase = String.join(this.codedPhrase);
                // This code returned an empty string bc 'it expects an iterable of strings, not
                // a stingle string'

                // Use StringBuilder to make a new string
                for (String coded : this.splitCoded) {
                    stringBuilder.append(coded);
                }
                this.codedPhrase = stringBuilder.toString();
            }
        }
        if (checker == false) {
            this.chances--;
        }
    }

    void printer(int count) {
        switch (count) {
            // Base gallows
            case 6:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("");
                System.out.println(this.codedPhrase);
                break;
            // Adds head
            case 5:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("");
                System.out.println(this.codedPhrase);
                break;
            case 4:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|     |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("");
                System.out.println(this.codedPhrase);
                break;
            case 3:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|   --|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("");
                System.out.println(this.codedPhrase);
                break;
            case 2:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|   --|--");
                System.out.println("|");
                System.out.println("|");
                System.out.println("");
                System.out.println(this.codedPhrase);
                break;
            case 1:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|   --|--");
                System.out.println("|    /");
                System.out.println("|");
                System.out.println("");
                System.out.println(this.codedPhrase);
                break;
        }
    }

    void launch(Scanner scanner) {
        // Obtains a random string and populates the split strings
        Random rando = new Random();
        int phraseIndex = rando.nextInt(possiblePhrases.length);

        // Ensures that it's a unhidden phrase
        if (phraseIndex % 2 == 1) {
            phraseIndex -= 1;
        }

        // Sets the variables at the top
        this.phrase = possiblePhrases[phraseIndex];
        this.codedPhrase = possiblePhrases[phraseIndex + 1];
        this.splitter();

        // Game begins

        while (true) {
            this.printer(this.chances);

            // Obtain a single letter from a user
            System.out.println("Choose a letter!");
            String userInput = scanner.nextLine();
            int userLength = userInput.length();

            if (userLength == 1) {
                // Search the array for the input
                this.searcher(userInput);
            } else {
                // Force user to only select one character
                while (userLength != 1) {
                    System.out.println("Please only choose one letter");
                    userInput = scanner.nextLine();
                    userLength = userInput.length();
                }
                // Search the array for the input
                this.searcher(userInput);
            }

            if (this.phrase.equals(this.codedPhrase)) {
                break;
            } else if (this.chances == 0) {
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0 => What are my crimes!");
                System.out.println("|   --|--");
                System.out.println("|    / \\");
                System.out.println("|");
                System.out.println("");
                break;
            }
        }
        // See if they want to play again
        if (this.chances > 0) {
            System.out.println(this.codedPhrase);
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println(this.codedPhrase);
            System.out.println("The sun sets heavy on this western town");
        }
    }
}