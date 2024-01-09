import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // All possible strings + their hidden versions
        String[] possiblePhrases = {
                "Let the force be with you",
                "___ ___ _____ __ ____ ___",
                "Here's Chucky",
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

        // Obtains a random string
        Random rando = new Random();
        int phraseIndex = rando.nextInt(possiblePhrases.length);

        // Ensures that it's a unhidden phrase
        if (phraseIndex % 2 == 1) {
            phraseIndex -= 1;
        }
        String randomPhrase = possiblePhrases[phraseIndex];

        // create a Phrase object
        Phrase gamePhrase = new Phrase(randomPhrase);
        gamePhrase.codedPhrase = possiblePhrases[phraseIndex + 1];

        // Game begins
            if (gamePhrase.chances == 6) {
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     ");
                System.out.println("|   ");
                System.out.println("|    ");
                System.out.println("|");

                // Obtain a single letter from a user
                System.out.println("Choose a letter!");
                Scanner scanner = new Scanner(System.in);

                String userInput = scanner.next();
                int userLength = userInput.length();

                // Loops until the user selects a String with a length of 1 (error)
                while (userLength != 1) {
                    System.out.println("Please only choose one letter");
                    userInput = scanner.next();
                    userLength = userInput.length();
                }
            // System.out.println("Play again? (y/n)");
        }
    }
}