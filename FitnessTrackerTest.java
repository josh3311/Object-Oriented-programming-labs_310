package FitnessTracker;
import java.util.Scanner; 

/**
 * MainFitnessTracker class - Driver class for the FitnessTracker application.
 * This class handles user input and displays fitness tracking results.
 * 
 * @author JoshuaFowah
 * @date 2024-02-16
 */
public class FitnessTrackerTest {
    
    /**
     * Main method to run the fitness tracking application.
     * Collects user input and displays calculated fitness metrics.
     * 
     * @param args Command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FitnessTracker fitness = new FitnessTracker();
        
        // Collecting user input for fitness tracking details
        
        // Prompt for first name
        System.out.println("Enter First Name: ");
        fitness.setFirstName(scan.nextLine());
        
        // Prompt for last name
        System.out.println("Enter Last Name: ");
        fitness.setLastName(scan.nextLine());
        
        // Prompt for gender
        System.out.println("Enter gender (male/female): ");
        fitness.setGender(scan.nextLine());
        
        // Prompt for daily steps
        System.out.println("Enter daily steps: ");
        fitness.setStepTakenDaily(scan.nextInt());
        
        // Prompt for daily calories burned
        System.out.println("Enter Calories Burned: " );
        fitness.setCaloriesBurnedDaily(scan.nextInt());
        
        // Prompt for daily active minutes
        System.out.println("Enter Daily Active Minutes: ");
        fitness.setActiveMinutesDaily(scan.nextInt());
        
        // Prompt for daily maintenance calories
        System.out.println("Enter Daily Maintenance Calories: ");
        fitness.setDailyMaintenanceCalories(scan.nextInt());
        
        // Display user fitness data
        System.out.println("\n--- User Fitness Data ---\n");
        System.out.printf("Name: %s %s%n", fitness.getFirstName(), fitness.getLastName());
        System.out.printf("Gender: %s%n", fitness.getGender());
        System.out.printf("Daily Steps: %d%n", fitness.getStepTakenDaily());
        System.out.printf("Distance Walked: %.2f meters%n", fitness.calculateDistanceWalked());
        System.out.printf("Daily Calories Burned: %d%n", fitness.getCaloriesBurnedDaily());
        System.out.printf("Weekly Active Minutes: %.0f%n", fitness.weeklyActiveMinutes());
        System.out.printf("Fitness Level: %s%n", fitness.displayFitnessData());
        System.out.printf("Daily Calories Deficit/Surplus: %d%n", fitness.calculateCalorieDeficitSurplus());
        
        // Display fitness level criteria for user reference
        System.out.println(" ");
        System.out.println("Fitness Level Criteria:");
        System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
        System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
        System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
        
        // Close the scanner to prevent resource leaks
        scan.close();        
    }
    // End of class MainFitnessTracker    
}
