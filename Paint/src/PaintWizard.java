import java.util.ArrayList;
import java.util.Scanner;

public class PaintWizard {
	
	ArrayList<PaintCan> paintListing = new ArrayList<PaintCan>();
	
	public static void main(String[]args) {
		
		PaintWizard paintManager = new PaintWizard();
		
		PaintCan cheapoMax = new PaintCan("CheapoMax", 200, 19.99);
		PaintCan dulux = new PaintCan("Dulux", 200, 19.99);
		PaintCan averageJoes = new PaintCan("AverageJoes", 200, 19.99);
		
		paintManager.addPaint(cheapoMax);
		paintManager.addPaint(dulux);
		paintManager.addPaint(averageJoes);
		
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter your room size in metres squared :");		
		int inputRoomSize = s.nextInt();		
		s.close();
		
		
		
		
		
		int cheapoMaxCoveragePerPot = 20 * 10;
		int duluxCoveragePerPot = 15 * 20;
		int averageJoesCoveragePerPot = 11 * 15;
		
		double cheapoMaxPrice = 19.99;
		int duluxPricePerPot = 25;
		double averageJoesPricePerPot = 17.99;	
		
		double cheapoPotsNeeded = Math.ceil((inputRoomSize / cheapoMaxCoveragePerPot)); 
		double duluxPotsNeeded = Math.ceil((inputRoomSize / duluxCoveragePerPot)); 
		double averageJoesPotsNeeded = Math.ceil((inputRoomSize / averageJoesCoveragePerPot)); 
		
		double totalCheapoCoverage = (cheapoPotsNeeded * cheapoMaxCoveragePerPot);
		double totalDuluxCoverage = (duluxPotsNeeded * duluxCoveragePerPot);
		double totalAverageJoesCoverage = (averageJoesPotsNeeded * averageJoesCoveragePerPot);
		
		leastWastePaint(totalCheapoCoverage, totalDuluxCoverage, totalAverageJoesCoverage, inputRoomSize);
		cheapestPaintToBuy(cheapoPotsNeeded, duluxPotsNeeded, averageJoesPotsNeeded, averageJoesPricePerPot, duluxPricePerPot, cheapoMaxPrice);
		
		// TURN THIS INTO A MORE REFINED OOP PROGRAM FROM THIS SIMPLE FOUNDATION
	}
	
	private void addPaint(PaintCan PaintCan) {
		paintListing.add(PaintCan);
		
	}

	public static double cheapestPaintToBuy(double cheapoPotsNeeded, double duluxPotsNeeded, double averageJoesPotsNeeded, double averageJoesPricePerPot, int duluxPricePerPot, double cheapoMaxPrice)
	{
		
		double totalCheapoCost = (cheapoPotsNeeded * cheapoMaxPrice); 
		double totalDuluxCost = (cheapoPotsNeeded * duluxPricePerPot); 
		double totalAverageJoeCost = (cheapoPotsNeeded * averageJoesPricePerPot); 
		
		double cheapestPot = Double.min(Double.min(totalCheapoCost, totalAverageJoeCost), totalDuluxCost);				
		
		return cheapestPot;
				
	}
	
	public static double leastWastePaint(double totalCheapoCoverage, double totalDuluxCoverage, double totalAverageJoesCoverage, int inputRoomSize) {
		
		double cheapoCoverLeft = (totalCheapoCoverage - inputRoomSize);
		double duluxCoverLeft = (totalDuluxCoverage - inputRoomSize);
		double averageJoesCoverLeft = (totalAverageJoesCoverage - inputRoomSize);
		
		double cheapoLitresRemaining = (cheapoCoverLeft / 10);
		double duluxLitresRemaining = (duluxCoverLeft / 20);
		double averageJoesLitresRemaining = (averageJoesCoverLeft / 11);
		
		double leastWasteBrand = Double.min(Double.min(averageJoesLitresRemaining, duluxLitresRemaining), cheapoLitresRemaining);
		
		return leastWasteBrand;
		
		
		
	}
	
	
	
}