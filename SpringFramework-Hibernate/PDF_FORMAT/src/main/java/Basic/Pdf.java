package Basic;

import java.io.IOException;

import org.apache.fop.area.Page;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Pdf {

	public static void main(String[] args)throws IOException {
	
		PDDocument pdf=new PDDocument();
		pdf.addPage(new PDPage());
		
		pdf.save("C:\\Users\\hk21398\\Documents\\New folder\\file.txt");
		
		System.out.println("File Coberted To PDf");
		
		pdf.close();

		
	}

}
