package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com Arquivo
		
		InputStream fis = new FileInputStream("Texto.txt"); //binário
		Reader isr = new InputStreamReader(fis,"windows-1252"); //caracteres
		BufferedReader br = new BufferedReader(isr); //conjunto de caracteres
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
		
	}

}
