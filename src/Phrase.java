public class Phrase {
    // amount wrong on
    int chances = 6;
    // the game phrase & blank dashes
    String phrase;
    String codedPhrase;
    // Little cowboy
    String chances5 = "0 => What are my crimes!";
    String chances4 = "  |";
    String chances3 = "--|";
    String chances2 = "--";
    String chances1 = "/";
    String chances0 = " \\";
    // Game Over Screen
    String lose = "You lose! )-;";


    Phrase(String str) {
        this.phrase = str;
    }

    
}