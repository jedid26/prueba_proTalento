package fromXLSXtoPDF;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Collection;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {
	
	private static final Font chapterFont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.NORMAL);       
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);  
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	
	public void generarPDF(File pdfNewFile, Collection<Articulos> articulos) {
		
		//Creacion del documento y nombre del fichero
		try {
			Document documento = new Document();
			try {
				PdfWriter.getInstance(documento, new FileOutputStream(pdfNewFile));
			} catch (FileNotFoundException e) {
				System.out.println("No hay fichero para crear el PDF" + e);	
			}
			documento.open();
			
			//Primera pagina
			Chunk chunk = new Chunk("Practica adicional semana 13", chapterFont);
			chunk.setBackground(BaseColor.WHITE);
			
			//Primer capítulo
			Chapter chapter = new Chapter(new Paragraph(chunk), 1);
			chapter.setNumberDepth(0);
			
			
			Section paragraphMoreS = chapter.addSection("Atrticulos");
			List lista = new List(List.UNORDERED);
			
			for (Articulos art : articulos) {
				
			}
			
			
			
			documento.close();
			System.out.println("Documento PDF generado");
		} catch (DocumentException e) {
			System.out.println("Error al generar el documento: "+ e);
		}
		
		
		
		
	}
}
