package FitnessTracker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for FitnessTracker
 * Tests the calculation methods of the FitnessTracker class
 * 
 * Assumptions:
 * 1. Step length is 0.8 meters for males and 0.7 meters for females
 * 2. Gender input must be either "male" or "female" (case insensitive)
 * 3. Daily maintenance calories should be positive numbers
 * 4. Steps taken should be positive numbers
 * 
 * @author JoshuaFowah
 * @version 1.0
 * @since 2024-02-16
 */
public class FitnessTrackerTest2 {
    
    private FitnessTracker tracker;
    
    /**
     * Sets up the test environment before each test
     * Creates a new FitnessTracker object with sample data
     */
    @Before
    public void setUp() {
        tracker = new FitnessTracker();
        tracker.setFirstName("Amal");
        tracker.setLastName("Ibrahim");
        tracker.setGender("female");
        tracker.setStepTakenDaily(4000);
        tracker.setCaloriesBurnedDaily(3000);
        tracker.setActiveMinutesDaily(120);
        tracker.setDailyMaintenanceCalories(2000);
    }
    /**
     * Tests the calculateDistanceWalked method for a female user
     * Expected to pass (green bar)
     */
    @Test
    public void testCalculateDistanceWalked() {
        double expectedDistance = 4000 * 0.7; // Female step length
        assertEquals(expectedDistance, tracker.calculateDistanceWalked(), 0.01);
    }
    
    /**
     * Tests the calculateCalorieDeficitSurplus method
     * Expected to pass (green bar)
     */
    @Test
    public void testCalculateCalorieDeficitSurplus() {
        int expectedDeficit = 2000 - 3000; // maintenance - burned
        assertEquals(expectedDeficit, tracker.calculateCalorieDeficitSurplus());
    }
    
    /**
     * Tests the calculateDistanceWalked method with incorrect gender
     * Expected to fail (red bar)
     */
    @Test
    public void testCalculateDistanceWalkedFail() {
        tracker.setGender("invalid"); // Setting invalid gender to force failure
        double expectedDistance = 4000 * 0.7;
        assertTrue("Distance calculation should fail with invalid gender", 
                  tracker.calculateDistanceWalked() == expectedDistance);
    }
}