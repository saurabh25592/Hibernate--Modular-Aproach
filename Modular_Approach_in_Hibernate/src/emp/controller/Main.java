package emp.controller;

import java.util.Scanner;

import emp.service.Employee_Service;

public class Main {

	public static void main(String[] args) {

		Employee_Service es = new Employee_Service();

		Scanner sc=new Scanner(System.in);
		System.out.println("enter option:");
		int option = sc.nextInt();

		do {
		switch (option) {
		case 1: {
			es.insertData();
			break;
		}

		case 2: {
			es.deleteData();
			break;
		}

		case 3: {
			es.updateData();
			break;
		}

		case 4: {
			es.FletchData();
			System.exit(0);
			break;
		}

		default:
			System.out.println("option not validate............");
		}
		
		}
		while(option!=5);
	}
	
}
