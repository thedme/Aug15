package com.countryapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReadAndWrite 
{
	Path ourNewPath = Paths.get("\\WS\\newworkspaces\\CountryApp\\src\\com\\countryapp\\countryList1");
	File aNewFile = ourNewPath.toFile();
	ArrayList<String> countries = new ArrayList<>();
	
	public String readCountries(){
		
		
		
		
				try(BufferedReader in = new BufferedReader(new FileReader(aNewFile))) {

			String aCountry;
			while((aCountry = in.readLine()) != null) {
				countries.add(aCountry);
				
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i));
		}
		return null;
	}
		public void writeCountries(String userCountry){
			
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true)))) {
				out.print(userCountry);
				out.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void deleteCountry(){
			countries.get(countries.size() - 1);
			countries.remove(countries.size() - 1);
			System.out.println(countries.remove(countries.size()-1));
		//int cd =	countries.lastIndexOf(countries);
		//countries.remove(countries.indexOf((cd - 1)));
		}
	}
