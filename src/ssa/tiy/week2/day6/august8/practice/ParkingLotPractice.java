package ssa.tiy.week2.day6.august8.practice;

public class ParkingLotPractice 
{

	public static void main(String[] args) 
	{
		
		KeithsCarObjectPractice hisCar = new KeithsCarObjectPractice();
		
		System.out.println(hisCar.getColor());
		
		CarObjectPractice kavitasCar = new CarObjectPractice(6, 4, true, "Toyota", "Corolla", "Blue", false);
	
		System.out.println(kavitasCar.getColor());
		
		CarObjectPractice erinsCar = new CarObjectPractice(5, 4, true, "Chevy", "Sonic", "White", false);
		
		System.out.println(erinsCar.isRuns());
		
		erinsCar.setRuns(false);
		
		System.out.println(erinsCar.isRuns());
	}

}
