package Program1;

public class InterestCalculation {
	private double principle,rateOfInterest;
	private int timeInYears;
	public InterestCalculation(double p,double r,int t) {
		principle=p;
		rateOfInterest=r;
		timeInYears=t;
	}
	public double simpleInterest() {
		return (principle*rateOfInterest*timeInYears)/100.0;
	}
	public double compoundInterest() {
		return principle*Math.pow((1+(rateOfInterest/100.0)),timeInYears)-principle;
	}
}