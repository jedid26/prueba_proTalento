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
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
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
				System.out.println(e.getMessage());
			}
			documento.open();
			
			//Primera pagina 
			//TITULO
			Chunk chunk = new Chunk("Practica adicional semana 13", chapterFont);
			chunk.setBackground(BaseColor.WHITE);
			
			//Primer capítulo
			Chapter chapter = new Chapter(new Paragraph(chunk), 1);
			chapter.setNumberDepth(0);
			
			
			Section seccionArticulos = chapter.addSection("Articulos");
			List lista = new List(List.UNORDERED);
			ListItem item = new ListItem();
			item.setAlignment(Element.ALIGN_LEFT);
			
			for (Articulos art : articulos) {
				item.add("\nTITULO: "+ art.getTitulo() + " CODIGO: " + art.getCodigo()+" PRECIO: "+art.getPrecio()
							+" STOCK: "+art.getStock()+" MARCA ID: "+art.getMarcaId()+" CATEGORIA: "+art.getCategoriaId()+ " FECHA CREACION:" +art.getFechaCreacion() +"\n"+"\n");
			}
			lista.add(item);
			
			seccionArticulos.add(lista); 
			documento.add(chapter);
			documento.close();
			System.out.println("Documento PDF generado");
		} catch (DocumentException e) {
			System.out.println("Error al generar el documento: "+ e);
		}
		
		
		
		
	}
}
