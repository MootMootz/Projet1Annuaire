package fr.isika.cda24.TPAnnuaire.program;


import java.nio.file.Path;
import java.nio.file.Paths;

import fr.isika.cda24.TPAnnuaire.entitees.Annuaire;

public class exportToPDF {

	Document document = new Document();
	PdfWriter.getInstance(document, new FileOutputStream("listeStagiaires.pdf"));

	document.open();

	PdfPTable table = new PdfPTable(3);
	addTableHeader(table);
	addRows(table);
	addCustomRows(table);

	document.add(table);
	document.close();
}
