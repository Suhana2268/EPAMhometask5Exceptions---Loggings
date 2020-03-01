package com.epam.Hometask5;

import java.util.Scanner;
import java.util.logging.Logger;

public class SimpleInterestLogger {
	public static void calInt() {
		Scanner sc = new Scanner(System.in);
		Logger Log = Logger.getLogger(SimpleInterestLogger.class.getName());
		Log.info("Please enter principle amount :");
		try {
			double princpleAmount=sc.nextDouble();
			Log.info("Please enter the time period :");
			double time=sc.nextDouble();
			Log.info("Please enter the rate of interest per year :");
			double rOfI=sc.nextDouble();
			Log.info("Simple Interest is :"+(princpleAmount*time*rOfI)/100);
			Log.info("The Compound Interest is :"+((princpleAmount*Math.pow(1+(rOfI/100),time))-princpleAmount));
			} catch (Exception e) {
				Log.info("Invalid input!\nEnter the valid one!");
				}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestLogger.calInt();

	}

}
