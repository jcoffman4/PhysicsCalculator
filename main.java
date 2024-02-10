import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
		
		int input = Integer.parseInt(JOptionPane.showInputDialog("Which of the following do you need to solve for: Weight (1)| Velocity (2)| Acceleration (3)| Force (4)| Momentum (5)| Torque (6)| Work (7)| Potential Energy (8)| Kinetic Energy (9)| Power (10)"));
		
		// While loop ensures user inputs number between 1 & 10
		while (input <= 0 || input > 10) {
			input = Integer.parseInt(JOptionPane.showInputDialog("Which of the following do you need to solve for: Weight (1)| Velocity (2)| Acceleration (3)| Force (4)| Momentum (5)| Torque (6)| Work (7)| Potential Energy (8)| Kinetic Energy (9)| Power (10)"));
		}
		
		
		// User chooses option 1: Weight
		if (input == 1) {
			double getMass = Double.parseDouble(JOptionPane.showInputDialog("What is the mass?"));
			double getGravity = Double.parseDouble(JOptionPane.showInputDialog("What is the gravity? (9.8 on earth)"));
			
			JOptionPane.showMessageDialog(null, "The total weight is: " + weight(getMass, getGravity));
		}
		
		// User chooses option 2: Velocity
		if (input == 2) {
			double getDistance = Double.parseDouble(JOptionPane.showInputDialog("What is the distance?"));
			double getTime = Double.parseDouble(JOptionPane.showInputDialog("What is the time?"));
			
			JOptionPane.showMessageDialog(null, "The velocity is: " + velocity(getDistance, getTime));
		}
		
		// User chooses option 3: Acceleration
		if (input == 3) {
			double getVelocity1 = Double.parseDouble(JOptionPane.showInputDialog("What is Velocity 1?"));
			double getVelocity2 = Double.parseDouble(JOptionPane.showInputDialog("What is Velocity 2?"));
			double getTime = Double.parseDouble(JOptionPane.showInputDialog("What is the time?"));
			
			JOptionPane.showMessageDialog(null, "The acceleration is: " + acceleration(getVelocity1, getVelocity2, getTime));
		}
		
		// User chooses option 4: Force
		if (input == 4) {
			double getMass = Double.parseDouble(JOptionPane.showInputDialog("What is the mass?"));
			double getAcceleration = Double.parseDouble(JOptionPane.showInputDialog("What is the acceleration?"));
			
			JOptionPane.showMessageDialog(null, "The force is: " + force(getMass, getAcceleration));
		}
		
		// User chooses option 5: Momentum
		if (input == 5) {
			double getMass = Double.parseDouble(JOptionPane.showInputDialog("What is the mass?"));
			double getVelocity = Double.parseDouble(JOptionPane.showInputDialog("What is the velocity?"));
			
			JOptionPane.showMessageDialog(null, "The momentum is: " + momentum(getMass, getVelocity));
		}
		
		// User chooses option 6: Torque
		if (input == 6) {
			double getForce = Double.parseDouble(JOptionPane.showInputDialog("What is the force?"));
			double getDistance = Double.parseDouble(JOptionPane.showInputDialog("What is the distance?"));
			
			JOptionPane.showMessageDialog(null, "The torque is: " + torque(getForce, getDistance));
		}
		
		// User chooses option 7: Work
		if (input == 7) {
			double getForce = Double.parseDouble(JOptionPane.showInputDialog("What is the force?"));
			double getDisplacement = Double.parseDouble(JOptionPane.showInputDialog("What is the displacement?"));
			
			JOptionPane.showMessageDialog(null, "The work is: " + work(getForce, getDisplacement));
		}
		
		// User chooses option 8: Potential Energy
		if (input == 8) {
			double getMass = Double.parseDouble(JOptionPane.showInputDialog("What is the mass?"));
			double getGravity = Double.parseDouble(JOptionPane.showInputDialog("What is gravity? (9.8 on Earth)"));
			double getHeight = Double.parseDouble(JOptionPane.showInputDialog("What is the height?"));
			
			JOptionPane.showMessageDialog(null, "The potential energy is: " + potentialEnergy(getMass, getGravity, getHeight));
		}
		// User chooses option 9: Kinetic Energy
		if (input == 9) {
			double getMass = Double.parseDouble(JOptionPane.showInputDialog("What is the mass?"));
			double getVelocity = Double.parseDouble(JOptionPane.showInputDialog("What is the velocity?"));
			
			JOptionPane.showMessageDialog(null, "The kinetic energy is: " + kineticEnergy(getMass, getVelocity));
		}
		// User chooses option 10: Power
		if (input == 10) {
			double getWork = Double.parseDouble(JOptionPane.showInputDialog("What is the work?"));
			double getTime = Double.parseDouble(JOptionPane.showInputDialog("What is the time?"));
			
			JOptionPane.showMessageDialog(null, "The power is: " + power(getWork, getTime));
		}
		
	}
	
	
	
	public static double weight(double mass, double gravity) {
		// w = mass * weight
		double weight = mass * gravity;
		return weight;
	}
	
	public static double velocity(double distance, double time) {
		// v = distance / time
		double velocity = distance / time;
		return velocity;
	}
	
	public static double acceleration(double velocity1, double velocity2, double time) {
		// a = (velocity2 - velocity1) / time
		double acceleration = (velocity2 - velocity1) / time;
		return acceleration;
	}
	
	public static double force(double mass, double acceleration) {
		// F = mass * acceleration
		double force = mass * acceleration;
		return force;
	}
	
	public static double momentum(double mass, double velocity) {
		// p = mass * velocity
		double momentum = mass * velocity;
		return momentum;
	}
	
	public static double torque(double force, double axisDistance) {
		// t = force * axisDistance
		double torque = force * axisDistance;
		return torque;
	}
	
	public static double work(double force, double displacement) {
		// W = force * distance
		double work = force * displacement;
		return work;
	}
	
	public static double potentialEnergy(double mass, double gravity, double height) {
		// PE = mass * gravity * height
		double potentialEnergy = (mass * gravity) * height;
		return potentialEnergy;
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		// KE = 1/2mass * velocity^2
		double kineticEnergy = (mass * 1/2) * (velocity * velocity);
		return kineticEnergy;
	}
	
	public static double power(double work, double time) {
		// P = Work / time
		double power = work / time;
		return power;
	}

}
