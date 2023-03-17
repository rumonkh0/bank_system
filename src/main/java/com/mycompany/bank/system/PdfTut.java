/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bank.system;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.property.VerticalAlignment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author rumon
 */
public class PdfTut {

    public static final String DEST = "hello_world.pdf";

    public static void main(String[] args) throws IOException {
        File file = new File(DEST);
        new PdfTut().createPdf(DEST);
        System.out.println("Hello World!");
    }

    public static void createPdf(String dest) throws IOException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);

        //Add paragraph to the document
        try (Document document = new Document(pdf)) {

            //Add paragraph to the document
            //document.add(new Paragraph("Hello World! I am rumon"));
            Table table = new Table(UnitValue.createPercentArray(new float[]{65, 35})).useAllAvailableWidth();
            Table nestedtable = new Table(UnitValue.createPercentArray(new float[]{65, 35})).useAllAvailableWidth();
            Cell title = new Cell();
            title.add("Green bank").setFontColor(Color.GREEN).setBorder(Border.NO_BORDER).setFontSize(50f).setBold().setVerticalAlignment(VerticalAlignment.MIDDLE);
//            title.add("Trust, Deposit, Fast");
            table.addCell(title);
           

            nestedtable.addCell(text("Transaction no.",13f,"left"));
            nestedtable.addCell(text("3213213",13f,"right"));
            nestedtable.addCell(text("date:",13f,"left"));
            nestedtable.addCell(text("13/13/21",13f,"right"));

            table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER).setVerticalAlignment(VerticalAlignment.MIDDLE)).setMarginBottom(10);

            document.add(table);

//            document.add(new Paragraph("\n"));
            Border gb = new SolidBorder(1f);
            Table divider = new Table(UnitValue.createPercentArray(new float[]{100})).useAllAvailableWidth();
            divider.setBorder(gb);
            document.add(divider);

            Paragraph p = new Paragraph("\nAccount details");
            p.setFontSize(24f).setTextAlignment(TextAlignment.CENTER).setBold().setMarginTop(10);
            document.add(p);
            
            Table underline = new Table(UnitValue.createPercentArray(new float[]{50, 50, 50})).useAllAvailableWidth();
            underline.addCell(text("",15f," "));
            underline.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderTop(gb));
            underline.addCell(text("",15f," "));
            document.add(underline.setMargins(-5, 0, 10, 0));
            
             //text("Account ID",15f," ")
            
            //details
            Table accdetail = new Table(UnitValue.createPercentArray(new float[]{50, 50})).useAllAvailableWidth();
            accdetail.addCell(text("Account ID",15f," "));
            accdetail.addCell(new Cell().add("313213654654").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());
            accdetail.addCell(text("Account ID",15f," "));
            accdetail.addCell(new Cell().add("Dhaka").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());
            accdetail.addCell(text("Account ID",15f," "));
            accdetail.addCell(new Cell().add("Rumon Khan").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());
            accdetail.addCell(text("Account ID",15f," "));
            accdetail.addCell(new Cell().add("01716814563").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());
            accdetail.addCell(text("Account ID",15f," "));
            accdetail.addCell(new Cell().add("Shewrapara").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());

            document.add(accdetail);

            Paragraph t = new Paragraph("\nTransaction details");
            t.setFontSize(24f).setTextAlignment(TextAlignment.CENTER).setBold().setMargins(10, 0, 10, 0);
            document.add(t);
            
            Table underline2 = new Table(UnitValue.createPercentArray(new float[]{50, 70, 50})).useAllAvailableWidth();
            underline2.addCell(text("",15f," "));
            underline2.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderTop(gb));
            underline2.addCell(text("",15f," "));
            document.add(underline2.setMargins(-5, 0, 10, 0));

            //details
            Table transdetail = new Table(UnitValue.createPercentArray(new float[]{50, 50})).useAllAvailableWidth();
            transdetail.addCell(new Cell().add("Money send to").setFontSize(15f).setBold());
            transdetail.addCell(new Cell().add("(Selim Reza) 313213654654").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());
            transdetail.addCell(new Cell().add("Branch").setFontSize(15f).setBold());
            transdetail.addCell(new Cell().add("Dhaka").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());
            transdetail.addCell(new Cell().add("Amount").setFontSize(15f).setBold());
            transdetail.addCell(new Cell().add("5000" + "TK").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());

            document.add(transdetail);

            Paragraph b = new Paragraph("\nBalance statement");
            b.setFontSize(24f).setTextAlignment(TextAlignment.CENTER).setBold().setMargins(10, 0, 10, 0);
            document.add(b);
            Table underline3 = new Table(UnitValue.createPercentArray(new float[]{50, 70, 50})).useAllAvailableWidth();
            underline3.addCell(text("",15f," "));
            underline3.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderTop(gb));
            underline3.addCell(text("",15f," "));
            document.add(underline3.setMargins(-5, 0, 10, 0));

            //details
            Table baldetail = new Table(UnitValue.createPercentArray(new float[]{50, 50})).useAllAvailableWidth();
            baldetail.addCell(new Cell().add("Prev balance").setFontSize(15f).setBold());
            baldetail.addCell(new Cell().add("500" + "TK").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());
            baldetail.addCell(new Cell().add("Sent").setFontSize(15f).setBold());
            baldetail.addCell(new Cell().add("500" + "TK").setTextAlignment(TextAlignment.RIGHT).setFontSize(15f).setBold());

            document.add(baldetail);

            Border bb = new SolidBorder(0.6f);
            Table bar = new Table(UnitValue.createPercentArray(new float[]{100})).useAllAvailableWidth();
            divider.setBorder(bb);
            document.add(bar);

            Table result = new Table(UnitValue.createPercentArray(new float[]{50, 50, 50})).useAllAvailableWidth();
            result.addCell(text("",15f," "));
            result.addCell(new Cell().add("Current balance").setBorder(Border.NO_BORDER).setFontSize(15f).setTextAlignment(TextAlignment.RIGHT));
            result.addCell(new Cell().add("C100" + "TK").setBorder(Border.NO_BORDER).setFontSize(15f).setTextAlignment(TextAlignment.RIGHT));
            document.add(result);
            //Close document
            document.close();
        }
    }

    static Cell text(String text, float size, String aling) {
        if (aling.equals("right")) {
            return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.RIGHT);
        } else {
            return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.LEFT);
        }

    }
}
