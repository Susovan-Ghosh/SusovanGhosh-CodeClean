package Program2;

import java.util.Scanner;

public class TotalCost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String materialStandard;
		double totalAreaInSquareFeet;
		boolean isFullyAutomated;

		System.out.printf("Enter material standard :\n");
		materialStandard = sc.nextLine();
		System.out.printf("Enter total area in square feet :\n");
		totalAreaInSquareFeet = sc.nextDouble();
		System.out.printf("Want fully automated(true/false) ?\n");
		isFullyAutomated = sc.nextBoolean();

		House newHouse = new House(materialStandard, totalAreaInSquareFeet, isFullyAutomated);
		System.out.printf("Total cost :%f\n", newHouse.constructionCost());
	}

}