package ssa.tiy.week2.day6.august8.practice;

public class KeithsCarObjectPractice 
{
	private int windows = 8;
	private int doors = 5;
	private boolean runs = true;
	private String make = "Honda";
	private String model = "CRV";
	private String color = "Red";
	private boolean currentlyRunning = false;

	public KeithsCarObjectPractice(int windows, int doors, boolean runs, String make, String model, String color,
			boolean currentlyRunning) 
	{
		super();
		this.windows = windows;
		this.doors = doors;
		this.runs = runs;
		this.make = make;
		this.model = model;
		this.color = color;
		this.currentlyRunning = currentlyRunning;
	}

	public KeithsCarObjectPractice()
	{
		
	}

	public int getWindows() 
	{
		return windows;
	}



	public int getDoors() 
	{
		return doors;
	}



	public boolean isRuns()
	{
		return runs;
	}



	public String getMake() 
	{
		return make;
	}



	public String getModel() 
	{
		return model;
	}



	public String getColor() 
	{
		return color;
	}



	public boolean isCurrentlyRunning() 
	{
		return currentlyRunning;
	}

	

}
