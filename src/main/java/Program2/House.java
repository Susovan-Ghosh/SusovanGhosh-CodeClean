package Program2;

public class House {
	private String materialStandard;
	private double totalAreaInSquareFeet;
	private boolean isFullyAutomated;
	public House(String materialStandard, double totalAreaInSquareFeet, boolean isFullyAutomated) {
		this.materialStandard = materialStandard;
		this.totalAreaInSquareFeet = totalAreaInSquareFeet;
		this.isFullyAutomated = isFullyAutomated;
	}
	public double constructionCost() {
		if(materialStandard.equalsIgnoreCase("standard"))
			return totalAreaInSquareFeet*1200.0;
		else if(materialStandard.equalsIgnoreCase("above standard"))
			return totalAreaInSquareFeet*1500.0;
		else if(isFullyAutomated && materialStandard.equalsIgnoreCase("high"))
			return totalAreaInSquareFeet*2500.0;
		else
			return totalAreaInSquareFeet*1800.0;
	}
}