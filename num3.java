//do some basic compational physics with strings
import java.util.Scanner;

public class ComputationalPhysics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        double g = 9.81; // Acceleration due to gravity (m/s^2)
        double dt = 0.01; // Time step (s)
        
        // Initial conditions
        double initialHeight = 100.0; // Initial height (m)
        double initialVelocity = 0.0; // Initial velocity (m/s)

        // Simulation parameters
        double time = 0.0; // Initial time (s)
        double height = initialHeight; // Initial height (m)
        double velocity = initialVelocity; // Initial velocity (m)

        // Simulation duration
        System.out.print("Enter the duration of the simulation (s): ");
        double duration = scanner.nextDouble();

        // Simulation loop
        while (time < duration) {
            // Calculate the new height and velocity using the Euler method
            double newVelocity = velocity - g * dt;
            double newHeight = height + velocity * dt;

            // Update time, height, and velocity
            time += dt;
            height = newHeight;
            velocity = newVelocity;

            // Print the current state of the particle
            System.out.printf("Time: %.2f s, Height: %.2f m, Velocity: %.2f m/s%n", time, height, velocity);
        }

        scanner.close();
    }
}