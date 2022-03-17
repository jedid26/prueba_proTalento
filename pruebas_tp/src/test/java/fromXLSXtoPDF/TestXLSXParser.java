package fromXLSXtoPDF;

import java.io.File;
import java.util.Collection;

public class TestXLSXParser {

	public static void main(String[] args) {
		
		String path = "./src/test/java/fromXLSXtoPDF/articulos.xlsx";
		String pathOutput = "./src/test/java/fromXLSXtoPDF/ListadoArticulos.pdf";
		
		//Parseador
		IParser<Collection<Articulos>> xlsxParser = new XLSXFileParser(path); 

		try {
			
			Collection<Articulos> articulos = xlsxParser.parse();
			
			//Generador de PDF
			GeneratePDF generadorPDF = new GeneratePDF();
			generadorPDF.generarPDF(new File(pathOutput), articulos);
			
			System.out.println(articulos);
		} catch (ParseException e) {
			System.err.println(e);
		}
	}

}
