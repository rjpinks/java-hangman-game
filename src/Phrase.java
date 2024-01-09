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
        System.out.println("SEARCHER ACTIVATED");
        boolean checker = false;
        for (int i = 0; i < this.splitPhrase.length; i++) {
            System.out.println("FOR ACTIVATED i =" + i + " target = " + target.toLowerCase() + " this.splitPhrase[i] = " + this.splitPhrase[i].toLowerCase());
            if (target.toLowerCase().equals(this.splitPhrase[i].toLowerCase())) {
                System.out.println("FIRST IF ACTIVATED  ");
                StringBuilder stringBuilder = new StringBuilder();
                checker = true;
                this.splitCoded[i] = this.splitPhrase[i];
                // this.codedPhrase = String.join(this.codedPhrase);
                    // This code returned an empty string bc 'it expects an iterable of strings, not a stingle string'

                    // Use StringBuilder to make a new string
                    for (String coded : this.splitCoded) {
                    stringBuilder.append(coded);
                }
                this.codedPhrase = stringBuilder.toString();
                System.out.println("codedPhrase = " + this.codedPhrase);
            }
        }
        if (checker == false) {
            System.out.println("SECOND IF ACTIVATED");
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
            case 0:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     0 => What are my crimes!");
                System.out.println("|   --|--");
                System.out.println("|    /\\");
                System.out.println("|");
                System.out.println("");
                System.out.println(this.codedPhrase);
                break;
        }
    }
}