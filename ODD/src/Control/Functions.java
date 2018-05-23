/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Account;
import Model.Box;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Guimarães
 */
public class Functions {

    public static void generatePDFCapeToBox(Account acc, Box box) throws FileNotFoundException, DocumentException {
        String path = System.getProperty("user.home") + "/Desktop/Box " + box.getName() + " - " + acc.getName() + ".pdf";
        Document document = new Document(PageSize.LETTER);
        PdfWriter.getInstance(document, new FileOutputStream(path));
        document.open();
        document.addAuthor("ODDSystem");
        document.addCreator("ODDSystem");
        document.addSubject("ODDSystem - To oganize your documents");
        document.addCreationDate();
        document.addTitle("Box - " + box.getName());

        HTMLWorker htmlWorker = new HTMLWorker(document);

        String frase;
        try {
            frase = "<html>"
                    + "<head> <meta charset=\"utf-8\"> </head>"
                    + "<body>";
            for (int i = 1; i <= 10; i++) {
                frase += " <table BORDER RULES=rows border=1 style=\"  width:100%; \">\n"
                        + "<tr> "
                        + "<th align=center><strong>Name</strong></th> "
                        + "<th align=center><strong>Description</strong></th> "
                        + "<th align=center><strong>Owner</strong></th> "
                        + "</tr> "
                        + "<tr> "
                        + "<td align=center>" + box.getName() + "</th> "
                        + "<td align=center>" + box.getDescription() + "</th> "
                        + "<td align=center>" + acc.getName() + "</th> "
                        + "</tr>";
                frase += "</table> </br></br></br></br>";
            }
            frase += "</body></html>";
            htmlWorker.parse(new StringReader(frase));
            document.close();
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(new File(path));
                } catch (Exception e) {
                    Warnings.wrngSomethingWentWrong(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generatePDFToBoxsDocments(Account acc, Box box) throws FileNotFoundException, DocumentException {
        String path = System.getProperty("user.home") + "/Desktop/Documents in the Box " + box.getName() + " - " + acc.getName() + ".pdf";
        Document document = new Document(PageSize.LETTER);
        PdfWriter.getInstance(document, new FileOutputStream(path));
        document.open();
        document.addAuthor("ODDSystem");
        document.addCreator("ODDSystem");
        document.addSubject("ODDSystem - To oganize your documents");
        document.addCreationDate();
        document.addTitle("Box - " + box.getName());

        HTMLWorker htmlWorker = new HTMLWorker(document);

        String frase;
        try {
            frase = "<html>"
                    + "<head> <meta charset=\"utf-8\"> </head>"
                    + "<body>";
            frase += "<h1 align=center>Box:" + box.getName() + "</h1>";
            frase += "<h3 align=center>" + acc.getName() + "</h3>";
            frase += " <table BORDER RULES=rows border=1 style=\"  width:100%; \">\n"
                    + "<tr> "
                    + "<th align=center><strong>Id</strong></th> "
                    + "<th align=center><strong>Name</strong></th> "
                    + "<th align=center><strong>Type</strong></th> "
                    + "</tr> ";

            for (Model.Document doc : box.getDocuments()) {
                frase += "<tr> "
                        + "<td align=center>" + doc.getId() + "</th> "
                        + "<td align=center>" + doc.getName() + "</th> "
                        + "<td align=center>" + doc.getType() + "</th> "
                        + "</tr>";
            }

            frase += "</table> </br></br></br></br>";
            frase += "</body></html>";
            htmlWorker.parse(new StringReader(frase));
            document.close();
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(new File(path));
                } catch (Exception e) {
                    Warnings.wrngSomethingWentWrong(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void generatePDFAllBoxs(ArrayList<Box> boxes, Account acc) throws FileNotFoundException, DocumentException {
        String path = System.getProperty("user.home") + "/Desktop/All Boxes - " + acc.getName() + ".pdf";
        Document document = new Document(PageSize.LETTER);
        PdfWriter.getInstance(document, new FileOutputStream(path));
        document.open();
        document.addAuthor("ODDSystem");
        document.addCreator("ODDSystem");
        document.addSubject("ODDSystem - To oganize your documents");
        document.addCreationDate();
        document.addTitle("All Boxes - " + acc.getName());

        HTMLWorker htmlWorker = new HTMLWorker(document);

        String frase;
        try {
            frase = "<html>"
                    + "<head> <meta charset=\"utf-8\"> </head>"
                    + "<body>";
            frase += "<h1 align=center>All Boxes</h1>";
            frase += "<h3 align=center>" + acc.getName() + "</h3>";
            frase += " <table BORDER RULES=rows border=1 style=\"  width:100%; \">\n"
                    + "<tr> "
                    + "<th align=center><strong>Id</strong></th> "
                    + "<th align=center><strong>Name</strong></th> "
                    + "<th align=center><strong>Description</strong></th> "
                    + "</tr> ";

            for (Box box: boxes) {
                frase += "<tr> "
                        + "<td align=center>" + box.getId() + "</th> "
                        + "<td align=center>" + box.getName() + "</th> "
                        + "<td align=center>" + box.getDescription() + "</th> "
                        + "</tr>";
            }

            frase += "</table> </br></br></br></br>";
            frase += "</body></html>";
            htmlWorker.parse(new StringReader(frase));
            document.close();
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(new File(path));
                } catch (Exception e) {
                    Warnings.wrngSomethingWentWrong(e);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
