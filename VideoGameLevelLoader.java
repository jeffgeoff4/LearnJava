import java.util.Scanner;

public class VideoGameLevelLoader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Video Game!"); 
        System.out.print("Enter your progress (1, 2, 3, 4, or 5): "); //Display progress level
        int playerProgress = scanner.nextInt();

        // Use a switch statement to determine which level to load next
        switch (playerProgress) {
            case 1:
                System.out.println("Loading Level 1");
                break;
            case 2:
                System.out.println("Loading Level 2");
                break;
            case 3:
                System.out.println("Loading Level 3");
                break;
            case 4:
                System.out.println("Loading Level 4");
                break;
            case 5:
                System.out.println("Congratulations! You've completed all levels.");
                break;
            default:
                System.out.println("Invalid progress. Please enter a valid progress level.");
        }

        scanner.close();
    }
}
