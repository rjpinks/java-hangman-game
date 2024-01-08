import java.util.Random;

class Main {

    public static void main(String[] args) {
        String[] possiblePhrases = {
            "Let the force be with you",
            "___ ___ _____ __ ____ ___",
            "Here's Chucky",
            "____'_ ______" ,
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

        // make it if so even it subtracts by one while cycling
        
        Random rando = new Random();
        int phraseIndex = rando.nextInt(possiblePhrases.length);
        if (phraseIndex % 2 == 1) { 
            phraseIndex -= 1; 
            System.out.println(phraseIndex);
        }
        String randomPhrase = possiblePhrases[phraseIndex];

        Phrase gamePhrase = new Phrase(randomPhrase);
        gamePhrase.codedPhrase = possiblePhrases[phraseIndex + 1];
    }
}