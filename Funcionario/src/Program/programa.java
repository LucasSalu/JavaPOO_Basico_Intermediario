package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Persona;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    Persona persona =  new Persona();
	    
	    
	    persona.name = sc.nextLine();
	    persona.salary = sc.nextDouble();
	    persona.tax = sc.nextDouble();
	    
	    System.out.println(persona);
	    System.out.println("which percentage to increase salary?");
	    double percent = sc.nextDouble();
	    persona.increaseSalary(percent);
        System.out.printf("%.2f",persona.salaryBrute());

	}

}
