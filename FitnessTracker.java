package FitnessTracker;

/**
 * FitnessTracker.java
 * This Fitness Tracker tracks the user's daily steps, 
 * distance walked weekly, daily calories burned, weekly active minutes,
 * fitness level, and daily calorie surplus/deficit.  
 * 
 * @author JoshuaFowah
 * Student Number: 041127959
 * Course: CST8284 313
 * @since 2024-02-16 
 */
public class FitnessTracker {

    // Attributes representing user fitness data
    private String firstName;
    private String lastName;
    private String Gender;
    private int stepTakenDaily;
    private int caloriesBurnedDaily;
    private int activeMinutesDaily;
    private int dailyMaintenanceCalories;

    /**
     * Constructor to initialize a FitnessTracker object with all attributes.
     * 
     * @param firstName User's first name
     * @param lastName User's last name
     * @param Gender User's gender
     * @param stepTakenDaily Number of steps taken daily
     * @param caloriesBurnedDaily Calories burned daily
     * @param activeMinutesDaily Active minutes per day
     * @param dailyMaintenanceCalories User's daily maintenance calories
     */
    public FitnessTracker(String firstName, String lastName, String Gender, int stepTakenDaily, int caloriesBurnedDaily, int activeMinutesDaily, int dailyMaintenanceCalories) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Gender = Gender;
        this.stepTakenDaily = stepTakenDaily;
        this.caloriesBurnedDaily = caloriesBurnedDaily;
        this.activeMinutesDaily = activeMinutesDaily;
        this.dailyMaintenanceCalories = dailyMaintenanceCalories;
    }

    /**
     * Default constructor
     */
    public FitnessTracker() {
    }

    // Getter and setter methods for each attribute
    // These allow controlled access and modification of the private attributes

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getStepTakenDaily() {
        return stepTakenDaily;
    }

    public void setStepTakenDaily(int stepTakenDaily) {
        this.stepTakenDaily = stepTakenDaily;
    }

    public int getCaloriesBurnedDaily() {
        return caloriesBurnedDaily;
    }

    public void setCaloriesBurnedDaily(int caloriesBurnedDaily) {
        this.caloriesBurnedDaily = caloriesBurnedDaily;
    }

    public int getActiveMinutesDaily() {
        return activeMinutesDaily;
    }

    public void setActiveMinutesDaily(int activeMinutesDaily) {
        this.activeMinutesDaily = activeMinutesDaily;
    }

    public int getDailyMaintenanceCalories() {
        return dailyMaintenanceCalories;
    }

    public void setDailyMaintenanceCalories(int dailyMaintenanceCalories) {
        this.dailyMaintenanceCalories = dailyMaintenanceCalories;
    }

    /**
     * Calculates the distance walked daily based on the user's gender.
     * 
     * @return The total distance walked in meters.
     */
    public double calculateDistanceWalked() {
        if (Gender.equalsIgnoreCase("male")) {
            double maleLengthMeters = 0.8;
            return stepTakenDaily * maleLengthMeters;
        } else if (Gender.equalsIgnoreCase("female")) {
            double femaleLengthMeters = 0.7;
            return stepTakenDaily * femaleLengthMeters;
        } else {
            return 0;
        }
    }

    /**
     * Calculates the total weekly active minutes based on daily activity.
     * 
     * @return The total active minutes in a week.
     */
    public double weeklyActiveMinutes() {
        int weekDays = 7;
        return activeMinutesDaily * weekDays;
    }

    /**
     * Determines the user's fitness level based on weekly active minutes and daily calorie burn.
     * 
     * @return A string representing the fitness level: "Active", "Moderately Active", or "Sedentary".
     */
    public String displayFitnessData() {
        double weeklyActive = weeklyActiveMinutes();

        if (weeklyActive > 150 && caloriesBurnedDaily > 2000) {
            return "Active";
        } else if ((weeklyActive >= 75 && weeklyActive <= 150) || (caloriesBurnedDaily >= 1000 && caloriesBurnedDaily <= 2000)) {
            return "Moderately Active";
        } else {
            return "Sedentary";
        }
    }

    /**
     * Calculates the user's daily calorie surplus or deficit.
     * 
     * @return The difference between maintenance calories and burned calories.
     */
    public int calculateCalorieDeficitSurplus() {
        return dailyMaintenanceCalories - caloriesBurnedDaily;
    }
}
