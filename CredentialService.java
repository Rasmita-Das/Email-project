package com.rasmita.service;

import java.util.Random;
import com.rasmita.model.Employee;

public class CredentialService {
	public String generateEmailId(Employee employee, String dept)
	{
		return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase()+"@"+ dept +".gl.com";
	}
	public String generatePassword()
	{
		int len = 8;
		String chars = "0123456789ABCDEFGHIJKLMNOPWRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@*#&$%";
		
		Random rnd = new Random();
		StringBuilder passGen = new StringBuilder(len);

		for(int i=0; i<len; i++)
		{
			passGen.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		return passGen.toString();
	}
	public void showCredential(Employee employee, String email)
	{
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows:");
		System.out.println("Email  --->"+ email);
		System.out.println("Password  ---> "+ generatePassword());
	}
}


