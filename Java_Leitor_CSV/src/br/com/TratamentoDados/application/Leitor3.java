package br.com.TratamentoDados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.TratamentoDados.teste.Produto;
import br.com.TratamentoDados.dao.*;

public class Leitor3 {

	public static void main(String[] args) throws Exception {
		
		String path = "DIRETORIO DO ARQUIVO";
		ProdutoDAO pdao = new ProdutoDAO();
		
		List<Produto> list = new ArrayList<Produto>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();	
			line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
				
				Produto prod = new Produto(name, price, qte);
				list.add(prod);
				line = br.readLine();
				
			}
			System.out.println("PRODUTOS: ");
			for (Produto p : list) {
				System.out.println(p);
				pdao.registro(p);
				
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
			}
		
	}


	


