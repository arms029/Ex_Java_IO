package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;

public class TesteEscritaFile3 {

	public static void main(String[] args) throws IOException {
		
		long ini = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("Texto.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

//		FileOutputStream fos = new FileOutputStream("Texto2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("Texto3.txt"));
//		PrintStream ps = new PrintStream("Texto4.txt");
		PrintWriter pw = new PrintWriter("Texto4.txt");
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			pw.println(linha);
			pw.flush();
			linha = br.readLine();
		}

		br.close();
		pw.close();

		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - ini) + " milisegundos");
	}

}
