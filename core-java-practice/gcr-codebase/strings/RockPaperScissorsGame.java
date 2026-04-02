import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        // Try-with-resources automatically closes the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfGames = scanner.nextInt();
            scanner.nextLine();

            String[][] results = new String[numberOfGames][4];
            int userWins = 0, computerWins = 0;

            // Play the specified number of games
            for (int i = 0; i < numberOfGames; i++) {
                String userChoice = scanner.nextLine().toLowerCase();
                String computerChoice = getComputerChoice();
                String winner = determineWinner(userChoice, computerChoice);

                if (winner.equals("User")) userWins++;
                else if (winner.equals("Computer")) computerWins++;

                // Store game results
                results[i][0] = String.valueOf(i + 1);
                results[i][1] = userChoice;
                results[i][2] = computerChoice;
                results[i][3] = winner;
            }

            // Calculate and display statistics
            String[][] stats = calculateStatistics(userWins, computerWins, numberOfGames);
            displayResults(results, stats);
        } // Scanner is automatically closed here
    }

    // Generates a random computer choice
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }

    // Determines the winner of a single round
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Calculates win percentages and statistics
    public static String[][] calculateStatistics(int userWins, int computerWins, int totalGames) {
        int draws = totalGames - (userWins + computerWins);
        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;
        double drawPercent = (draws * 100.0) / totalGames;

        String[][] stats = {
            {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", compPercent)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercent)}
        };

        return stats;
    }

    // Displays game results and statistics
    public static void displayResults(String[][] results, String[][] stats) {
    }
}
