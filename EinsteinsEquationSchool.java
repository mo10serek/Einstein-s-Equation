import java.util.Scanner;

public class EinsteinsEquationSchool {

	public static void main(String[] args) {
		// Create scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the mass to find the energy ");		
		double mass = input.nextDouble();
		
		double energy = mass * 2.998*100000000 * 2.998*100000000;
		
		System.out.print("The energy is " + energy);
	}

}
