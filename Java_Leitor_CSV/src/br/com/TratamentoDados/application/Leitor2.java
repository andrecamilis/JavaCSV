package br.com.TratamentoDados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor2 {

	public static void main(String[] args) {
		
		String path = "DIRETÓRIO DO ARQUIVO";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();	
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
			fr.close();
			br.close();
		}
			catch (IOException e) {
				e.printStackTrace();
			}
			}
		
	}

}
