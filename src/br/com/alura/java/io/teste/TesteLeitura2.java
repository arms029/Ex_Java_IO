package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		String msg = System.getenv("teste");
		
		System.out.println(msg);
		
		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String valor01 = linhaScanner.next();
			int valor02 = linhaScanner.nextInt();
			int valor03 = linhaScanner.nextInt();
			String valor04 = linhaScanner.next();
			BigDecimal valor05 = linhaScanner.nextBigDecimal();

			System.out.format(new Locale("pt","BR"), "%s - %04d-%08d %20s: R$ %08.02f %n",
					valor01, valor02, valor03, valor04, valor05);

//			String[] valores = linha.split(",");
//			System.out.println(Arrays.deepToString(valores));
		}
		scanner.close();
	}

}
