package ssa.tiy.week2.day6.august8.practice;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map;

public class CollectionsPractice 
{

	public static void main(String[] args) 
	{	
		//Set - HashSet
		//List - ArrayList and LinkedList
		//Map - HashMap and TreeMap
		
		// create an array list
		ArrayList alienEggs = new ArrayList();
		System.out.println("Initial size of al: " + alienEggs.size());

		// add elements to the array list
		alienEggs.add("C");
		alienEggs.add("D");
		alienEggs.add("E");
		alienEggs.add("F");
		alienEggs.add("F");
		alienEggs.add("F");
		alienEggs.add(1, "A2");
		System.out.println("Size of al after additions: " + alienEggs.size());

		// display the array list
		System.out.println("Contents of al: " + alienEggs);
		// Remove elements from the array list
		alienEggs.remove("F");
		alienEggs.remove(2);
		System.out.println("Size of al after deletions: " + alienEggs.size());
		System.out.println("Contents of al: " + alienEggs);
		
		HashMap cars = new HashMap();
		
		cars.put("Sonic", "Chevy");
		cars.put("F-150", "Ford");
		cars.put("F-250", "Ford");
		
		HashMap<String, String> zipCodes = new HashMap<>();
		
		zipCodes.put("48158", "Michigan");
		
		System.out.println(cars.get("F-150"));
		
		
		
	}


	
	
	
}
