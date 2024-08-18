package com.techlabs.Test;
import java.util.Scanner;

import com.techlabs.Model.*;
public class SCMQueriesTest {
	public static void main(String[] args) {
		SCMQueries scmconnection = new SCMQueries();
		Scanner scanner = new Scanner(System.in);
		
		scmconnection.connectToDb();
		while(true) {
			System.out.println("Menu");
			System.out.println("1. ");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. ");
			System.out.println("6. ");
			System.out.println("7. ");
			System.out.println("8. ");
			System.out.println("9. ");
			System.out.println("10. ");
			System.out.println("11. Exit");
			
			System.out.println("Enter a Choice");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:scmconnection.query1();
			break;
			case 2:scmconnection.query2();
			break;
			case 3:scmconnection.query3();
			break;
			case 4:scmconnection.query4();
			break;
			case 5:scmconnection.query5();
			break;
			case 6:scmconnection.query6();
			break;
			case 7:scmconnection.query7();
			break;
			case 8:scmconnection.query8();
			break;
			case 9:scmconnection.query9();
			break;
			case 10:scmconnection.query10();
			break;
			case 11:System.out.println("Exiting");
			scmconnection.closeConnection();
			return;
			default:System.out.println("Enter a valid choice");
				
			
			}

		}
	}
}
