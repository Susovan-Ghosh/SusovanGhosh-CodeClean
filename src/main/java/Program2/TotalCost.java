package Program2;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TotalCost {

	public static void main(String[] args) {

		final Logger logger=LogManager.getLogger(Program2.TotalCost.class);
		Scanner sc = new Scanner(System.in);

		String materialStandard;
		double totalAreaInSquareFeet;
		boolean isFullyAutomated;
		
		logger.info("Enter Information....");
		System.out.printf("Enter material standard :\n");
		materialStandard = sc.nextLine();
		System.out.printf("Enter total area in square feet :\n");
		totalAreaInSquareFeet = sc.nextDouble();
		System.out.printf("Want fully automated(true/false) ?\n");
		isFullyAutomated = sc.nextBoolean();
		logger.warn("Input successful.");

		House newHouse = new House(materialStandard, totalAreaInSquareFeet, isFullyAutomated);
		System.out.printf("Total cost :%f\n", newHouse.constructionCost());
		logger.info("Cost calculated and shown.");
	}

}