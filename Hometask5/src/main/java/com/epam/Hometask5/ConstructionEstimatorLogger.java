package com.epam.Hometask5;

import java.util.Scanner;
import java.util.logging.Logger;

public class ConstructionEstimatorLogger {
	public static void constructionCost() {
		Scanner sc = new Scanner(System.in);
		Logger log = Logger.getLogger(ConstructionEstimatorLogger.class.getName());
		int choice;
		log.info("  ***Construction Cost Estimator***"+"\t");
		log.info(" ");
		log.info("\t" + "Available materials :"+ "\t");
		log.info("\n1. Construction Standard materials\n2. Construction- Above standard materials\n3. Constructio- High standard materials\n4. Construction- High standard materials and fully automated home");
		log.info("Choose between 1 to 4 options");
		try {
			choice = sc.nextInt();
			double area, price;
			switch(choice) {
			case 1:
				log.info("Please enter the area of house :");
				area = sc.nextDouble();
				price = (1200 * area);
				log.info("The cost to construct the house = " + price + "INR");
				break;
				
			case 2:
				log.info("Please enter the area of house :");
				area = sc.nextDouble();
				price = (1500 * area);
				log.info("The cost to construct the house = " + price + "INR");
				break;
			case 3:
				log.info("Please enter the area of house :");
				area = sc.nextDouble();
				price = (1800 * area);
				log.info("The cost to construct the house = " + price + "INR");
				break;
			case 4:
				log.info("Please enter the area of house :");
				area = sc.nextDouble();
				price = (2500 * area);
				log.info("The cost to construct the house = " + price + "INR");
				break;
			default:
				log.info("Invalid input! Please enter a valid input!");
			
			}
		}
		catch(Exception e) {
			log.info("Invalid input! Please enter the valid one");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructionEstimatorLogger.constructionCost();

	}

}
