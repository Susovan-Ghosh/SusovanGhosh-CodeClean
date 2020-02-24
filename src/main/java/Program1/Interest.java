package Program1;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {

	public static void main(String[] args) {
		final Logger logger=LogManager.getLogger(Program1.Interest.class);
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
				logger.info("Into case 1(i.e. Simple Interest)....");
				System.out.format("%s","Enter principle, rate and time(in years) :\n");
				logger.info("Taking inputs....");
				principle=sc.nextDouble();
				rateOfInterest=sc.nextDouble();
				timeInYears=sc.nextInt();
				ic=new InterestCalculation(principle,rateOfInterest,timeInYears);
				System.out.printf("Simple Interest :%f\n",ic.simpleInterest());
				logger.warn("simpleInterest() function called,calculated and shown!");
				break;
			case 2:	
				logger.info("Into case 2(i.e. Compound Interest)....");
				System.out.format("%s","Enter principle, rate and time(in years) :\n");
				logger.info("Taking inputs....");
				principle=sc.nextDouble();
				rateOfInterest=sc.nextDouble();
				timeInYears=sc.nextInt();
				ic=new InterestCalculation(principle,rateOfInterest,timeInYears);
				System.out.printf("Compound Interest :%f\n",ic.compoundInterest());
				logger.warn("compoundInterest() function called,calculated and shown!");
				break;
			case 3:
				logger.fatal("Program terminated..!!");
				System.exit(0);				
			default:
				logger.error("Provide proper choice....");
				System.out.format("%s", "Wrong Choice!\n");
			}
		}
	}

}