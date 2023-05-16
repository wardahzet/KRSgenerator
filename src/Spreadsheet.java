//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeMap;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.util.ZipSecureFile;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.util.CellRangeAddress;
//
///**
// * This program illustrates how to update an existing Microsoft Excel document.
// * Append new rows to an existing sheet.
// *
// * @author www.codejava.net
// *
// */
//public class Spreadsheet {
//
//
//    public static void main(String[] args) {
//        ZipSecureFile.setMinInflateRatio(0);
//        String excelFilePath = "D:/none.xlsx";
//
//        try {
//            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
//            Workbook workbook = WorkbookFactory.create(inputStream);
//
//            Sheet spreadsheet = workbook.getSheetAt(0);
//            int x = 0;
//            MatkulNew.data();
//            Kombinasi.cari();
//            ArrayList<String[][]> data = Kombinasi.data;
//            Map<Integer, String[][]> studentData = new TreeMap<Integer, String[][]>();
//            for (int i = 500; i < 1000; i++) {
//
//                studentData.put(x++, data.get(i));
//            }
//            Set<Integer> keyid = studentData.keySet();
//
//            int rowid = 1;
//            int initial = 7;
//            // writing the data into the sheets...
//            for (Integer key : keyid) {
//                Object[][] objectArr = studentData.get(key);
//
//                for (Object[] datum : objectArr) {
//                    Row row = spreadsheet.getRow(rowid++);
//                    int cellid = initial;
//                    for (Object obj : datum){
//                        Cell cell = row.createCell(cellid++);
//                        cell.setCellValue((String)obj);
////                        Kombinasi.style(cell);
//                    }
//                }
//                spreadsheet.createRow(rowid++);
//
//                Kombinasi.style(new CellRangeAddress(rowid-14,rowid-2,initial,initial+6), spreadsheet);
//                Kombinasi.style(new CellRangeAddress(rowid-14,rowid-14,initial,initial+6), spreadsheet);
//                Kombinasi.style(new CellRangeAddress(rowid-14,rowid-2,initial,initial), spreadsheet);
//            }
////
////            for (Object[] aBook : bookData) {
////                Row row = sheet.createRow(++rowCount);
////
////                int columnCount = 0;
////
////                Cell cell = row.createCell(columnCount);
////                cell.setCellValue(rowCount);
////
////                for (Object field : aBook) {
////                    cell = row.createCell(++columnCount);
////                    if (field instanceof String) {
////                        cell.setCellValue((String) field);
////                    } else if (field instanceof Integer) {
////                        cell.setCellValue((Integer) field);
////                    }
////                }
////
////            }
//
//            inputStream.close();
//
//            FileOutputStream outputStream = new FileOutputStream("D:/none.xlsx");
//            workbook.write(outputStream);
//            workbook.close();
//            outputStream.close();
//
//        } catch (IOException | EncryptedDocumentException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//}