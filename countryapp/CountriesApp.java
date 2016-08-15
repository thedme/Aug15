package com.countryapp;

import java.util.Scanner;

public class CountriesApp {
	private static boolean unitedNations = true;

public static void main(String[] args) {
	Scanner map = new Scanner(System.in);
	String menuChoice = null;
	String countryList = null;
	String userCountry = null;
	while(unitedNations)
	{
	do
	{
		
	
	System.out.println("Please select either 1, 2, 3");
	System.out.println("Display a country(1)\n add a country(2)\n Delete a country(3)");
	menuChoice = map.nextLine();
	}
		while(Validation.isValidMenuChoice(menuChoice));
	
	switch (menuChoice) {
	case "1":
		ReadAndWrite display = new ReadAndWrite();
		countryList = display.readCountries();
		
		break;
	case "2":
		System.out.println("Please enter the country you would like to add");
		userCountry = map.nextLine();
		ReadAndWrite addCountry = new ReadAndWrite();
		 addCountry.writeCountries("\n" +userCountry);
		 ReadAndWrite display2 = new ReadAndWrite();
		 countryList = display2.readCountries();
		
		break;
	case "3":
		System.out.println("Thank you for playing");
		ReadAndWrite del = new ReadAndWrite();
		del.deleteCountry();
		//del.deleteCountry();
		//del.readCountries();
		System.exit(0);
	default:
		break;
	}
}
}
}