public class Phrase {
    // Amount wrong on
    int chances = 6;

    // The game phrases
    String phrase;
    String codedPhrase;
    String[] splitPhrase;
    String[] splitCoded;
    
    // Gallows
    String line1 = "_______";
    String line2 = "|     |";
    String line3 = "|     ";
    String line4 = "|   ";
    String line5 = "|    ";
    String line6 = "|";

    // Little cowboy
    String chances5 = "0";
    String chances4 = "  |";
    String chances3 = "--|";
    String chances2 = "--";
    String chances1 = "/";
    String chances0 = " \\";
    
    // Game Over Screen
    String lose = "You lose! )-;";
    String crimes = " => What are my crimes!";

    // Constructer
    Phrase(String str) {
        this.phrase = str;
    }

    // Methods
    void splitter() {
        this.splitPhrase = this.phrase.split("");
        this.splitCoded = this.codedPhrase.split("");
    }

    void searcher(String target) {
        boolean checker = false;
        for (int i = 0; i < this.splitPhrase.length; i++) {
            if (target.toLowerCase() == this.splitPhrase[i].toLowerCase()) {
                checker = true;
                splitCoded[i] = splitPhrase[i];
            }
            if (checker == false) {
                this.chances--;
            }
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
                break;
            // Adds head
            case 5:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|     |");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|   --|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 2:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|   --|--");
                System.out.println("|");
                System.out.println("|");
                break;
            case 1:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0");
                System.out.println("|   --|--");
                System.out.println("|    /");
                System.out.println("|");
                break;
            case 0:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0 => What are my crimes!");
                System.out.println("|   --|--");
                System.out.println("|    /\\");
                System.out.println("|");
                break;
        }
    }
}