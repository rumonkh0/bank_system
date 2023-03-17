/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rumon
 */
public class PdfWithdraw {

    static int transno = 0;
    
    LocalDateTime dt = LocalDateTime.now();
    DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter t = DateTimeFormatter.ofPattern("hh:mm a");
    String date = dt.format(d);
    String time = dt.format(t);

    public static void main(user u, user s, String amount) throws IOException {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm");
        String fdt = dt.format(f);
        
        new File(System.getProperty("user.home") + File.separator +"Desktop"+File.separator+"green_bank").mkdir();

        String DEST = System.getProperty("user.home") + File.separator +"Desktop"+File.separator+"green_bank"+File.separator+"withdraw"+fdt + "_" + u.accId + "_" + "to" + "_" + s.accId + ".pdf";
        new PdfWithdraw().createPdf(DEST, u, s, amount);
    }

    public void createPdf(String dest, user u, user s, String amount) throws IOException {
        
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);

        //Add paragraph to the document
        try (Document document = new Document(pdf)) {

            //Add paragraph to the document
            //document.add(new Paragraph("Hello World! I am rumon"));
            Table table = new Table(UnitValue.createPercentArray(new float[]{65, 35})).useAllAvailableWidth();
            Table nestedtable = new Table(UnitValue.createPercentArray(new float[]{60, 40})).useAllAvailableWidth();
            Cell title = new Cell();
            title.add("Green bank").setFontColor(Color.GREEN).setBorder(Border.NO_BORDER).setFontSize(50f).setBold().setVerticalAlignment(VerticalAlignment.MIDDLE);
//            title.add("Trust, Deposit, Fast");
            table.addCell(title);

            nestedtable.addCell(text("Transaction no.", 15f, true, false, true));
            nestedtable.addCell(text(++transno + "", 13f, false, false, false).setVerticalAlignment(VerticalAlignment.MIDDLE));
            nestedtable.addCell(text("Date:", 15f, true, false, true).setVerticalAlignment(VerticalAlignment.MIDDLE));
            nestedtable.addCell(text(date + "", 13f, false, false, false).setVerticalAlignment(VerticalAlignment.MIDDLE));
            nestedtable.addCell(text("Time:", 15f,  true, false, true).setVerticalAlignment(VerticalAlignment.MIDDLE));
            nestedtable.addCell(text(time + "", 13f, false, false, false).setVerticalAlignment(VerticalAlignment.MIDDLE));

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
            underline.addCell(text("", 15f, false, false, false));
            underline.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderTop(gb));
            underline.addCell(text("", 15f, false, false, false));
            document.add(underline.setMargins(-5, 0, 10, 0));

            //text("Account ID",15f," ")
            //details
            Table accdetail = new Table(UnitValue.createPercentArray(new float[]{50, 50})).useAllAvailableWidth();
            accdetail.addCell(text("Account ID", 15f, true, true, false));
            accdetail.addCell(text(u.accId, 15f, false, true, false));
            accdetail.addCell(text("Branch", 15f, true, false, false));
            accdetail.addCell(text(u.branch, 15f, false, false, false));
            accdetail.addCell(text("Name", 15f, true, true, false));
            accdetail.addCell(text(u.name, 15f, false, true, false));
            accdetail.addCell(text("Phone", 15f, true, false, false));
            accdetail.addCell(text(u.phone, 15f, false, false, false));
            accdetail.addCell(text("Address", 15f, true, true, false));
            accdetail.addCell(text(u.address, 15f, false, true, false));

            document.add(accdetail);

            Paragraph t = new Paragraph("\nTransaction details");
            t.setFontSize(24f).setTextAlignment(TextAlignment.CENTER).setBold().setMargins(10, 0, 0, 0);
            document.add(t);

            Table underline2 = new Table(UnitValue.createPercentArray(new float[]{50, 70, 50})).useAllAvailableWidth();
            underline2.addCell(text("", 15f, true, false, false));
            underline2.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderTop(gb));
            underline2.addCell(text("", 15f, true, false, false));
            document.add(underline2.setMargins(-5, 0, 10, 0));

            //details
            Table transdetail = new Table(UnitValue.createPercentArray(new float[]{50, 50})).useAllAvailableWidth();
            transdetail.addCell(text("Money send to", 15f, true, true, false));
            transdetail.addCell(text("(" + s.name + ") " + s.accId, 15f, false, true, false));
            transdetail.addCell(text("Branch", 15f, true, false, false));
            transdetail.addCell(text(s.branch, 15f, false, false, false));
            transdetail.addCell(text("Amount", 15f, true, true, false));
            transdetail.addCell(text(amount + " TK", 15f, false, true, false));

            document.add(transdetail);

            Paragraph b = new Paragraph("\nBalance statement");
            b.setFontSize(24f).setTextAlignment(TextAlignment.CENTER).setBold().setMargins(10, 0, 0, 0);
            document.add(b);
            Table underline3 = new Table(UnitValue.createPercentArray(new float[]{50, 70, 50})).useAllAvailableWidth();
            underline3.addCell(text("", 15f, true, false, false));
            underline3.addCell(new Cell().setBorder(Border.NO_BORDER).setBorderTop(gb));
            underline3.addCell(text("", 15f, true, false, false));
            document.add(underline3.setMargins(-5, 0, 10, 0));

            String prev = Integer.toString(Integer.parseInt(u.balance) + Integer.parseInt(amount));
            //details
            Table baldetail = new Table(UnitValue.createPercentArray(new float[]{50, 50})).useAllAvailableWidth();
            baldetail.addCell(text("Prev balance", 15f, true, true, false));
            baldetail.addCell(text(prev + " TK", 15f, false, true, false));
            baldetail.addCell(text("Sent", 15f, true, false, false));
            baldetail.addCell(text(amount + " TK", 15f, false, false, false));

            document.add(baldetail);

            Border bb = new SolidBorder(1f);
            Table bar = new Table(UnitValue.createPercentArray(new float[]{100})).useAllAvailableWidth();
            bar.setBorder(bb);
            document.add(bar);

            Table result = new Table(UnitValue.createPercentArray(new float[]{50, 50, 50})).useAllAvailableWidth();
            result.addCell(text("", 15f, true, false, false));
            result.addCell(text("Current balance", 15f, true, false, false));
            result.addCell(text(u.balance + " TK", 15f, false, false, false));
            document.add(result);
            //Close document
            document.close();
        }
    }

    static Cell text(String text, float size, boolean left, boolean back, boolean bold) {
        int bool = 0;
        if(left == true){
            bool = bool | 4;
        }
        if (back == true){
            bool = bool | 3;
        }
        if( bold == true){
            bool = bool | 1;
        }
        
        switch(bool){
            case 0 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.RIGHT);
            }
            case 1 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.RIGHT);
            }
            case 2 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.RIGHT).setBackgroundColor(Color.GRAY, 0.3f);
            }
            case 3 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.RIGHT).setBackgroundColor(Color.GRAY, 0.3f);
            }
            case 4 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.LEFT);
            }
            case 5 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.LEFT);
            }
            case 6 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.LEFT).setBackgroundColor(Color.GRAY, 0.3f);
            }
            case 7 -> {
                return new Cell().add(text).setBorder(Border.NO_BORDER).setFontSize(size).setTextAlignment(TextAlignment.LEFT).setBackgroundColor(Color.GRAY, 0.3f);
            }
            default -> {
                return new Cell();
            }
        }
    }
}
