package fundamentals.operators;

public class ChallengeLogic {

	public static void main(String[] args) {
		
		// TuesdayWork (V or F)
		// ThursdayWork (V or F)
		
		boolean work1 = false;
		boolean work2 = false;
		
		boolean buyTv50 = work1 && work2;
		boolean buyTv32 = work1 ^ work2;
		boolean iceCream = buyTv50 || buyTv32;
		boolean stayAtHome = !iceCream;

		System.out.println("Buy 50\" inch TV?  " + buyTv50);
		System.out.println("Buy 35\" inch TV?  " + buyTv32);
		System.out.println("Buy ice Cream?  " + iceCream);
		System.out.println("Stay at home?  " + stayAtHome);
		
		
	}
	
}
