package Program1;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principle,rateOfInterest;
		int timeInYears;
		InterestCalculation ic;
		while (true) {
			System.out.format("%s", "1. Simple Interest\n");
			System.out.format("%s", "2. Compound Interest\n");
			System.out.format("%s", "3. Exit\n");
			System.out.format("%s", "Enter choice :\n");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.format("%s","Enter principle, rate and time(in years) :\n");
				principle=sc.nextDouble();
				rateOfInterest=sc.nextDouble();
				timeInYears=sc.nextInt();
				ic=new InterestCalculation(principle,rateOfInterest,timeInYears);
				System.out.printf("Simple Interest :%f\n",ic.simpleInterest());
				break;
			case 2:	
				System.out.format("%s","Enter principle, rate and time(in years) :\n");
				principle=sc.nextDouble();
				rateOfInterest=sc.nextDouble();
				timeInYears=sc.nextInt();
				ic=new InterestCalculation(principle,rateOfInterest,timeInYears);
				System.out.printf("Compound Interest :%f\n",ic.compoundInterest());
				break;
			case 3:
				System.exit(0);
			default:
				System.out.format("%s", "Wrong Choice!\n");
			}
		}
	}

}