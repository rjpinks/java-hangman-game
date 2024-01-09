import java.util.Scanner;

// Reduce the working product into a method, so I can call again if the user selects y

class Main {
    public static void main(String[] args) {
        Phrase phrase = new Phrase();
        Scanner scanner = new Scanner(System.in);
        
        phrase.launch(scanner);

        System.out.println("Do you want to play again?");
        String again = scanner.nextLine();

        if (again.equals("y")) {
            phrase = new Phrase();
            phrase.launch(scanner);
        } else {
            System.out.println("Thanks for playing!");
        }
        scanner.close();
    }
}