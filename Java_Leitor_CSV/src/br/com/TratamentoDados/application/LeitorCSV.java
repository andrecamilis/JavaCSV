package br.com.TratamentoDados.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LeitorCSV {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\andre\\AppData\\Local\\Temp\\in.txt");
		Scanner sc = null;
		try {
			
			 sc = new Scanner(file);
			 while (sc.hasNextLine()) {
				 String line = sc.nextLine();
				 System.out.println(line);
				 
			 }
			 
			 
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			
		} finally {
			if(sc != null) {sc.close();}
			
		}

	}

}
