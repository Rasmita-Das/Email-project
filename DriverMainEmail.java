package com.rasmita.main;

import java.util.Scanner;

import com.rasmita.model.Employee;
import com.rasmita.service.CredentialService;

public class DriverMainEmail {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int userInput;
		String dept = "";
		String email = "";
		Employee employee = new Employee("Rasmita", "Das");
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical \n2.Admin \n3.Human Resource \n4.Legal");
		System.out.println("Please Enter Your Choice");
		
		try (Scanner sc = new Scanner(System.in)) {
			int userInput1 = sc.nextInt();

			switch(userInput1) {

			case 1:
				dept = "Technical";
				break;

			case 2:
				dept = "Admin";
				break;

			case 3:
				dept = "Human Resource";
				break;

			case 4:
				dept = "Legal";
				break;

			default:
				System.out.println("Please Select Correct Option");
				break;
			}
		}

		CredentialService cs = new CredentialService();
		email = cs.generateEmailId(employee, dept);
		cs.showCredential(employee, email);
	}

}
