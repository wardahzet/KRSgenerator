import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class Kombinasi {
    static ArrayList<Integer> jadwal = new ArrayList<>();
    static ArrayList<String> jadi = new ArrayList<>();
    static ArrayList<String[][]> data = new ArrayList<>();
    static String[][] hari;
    static String[] day = {"Jam", "Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
    static String[] time = {"07:00 - 07:49", "07:50 - 08:39", "08:40 - 09:29", "09:30 - 10:19", "10:20 - 11:09", "11:10 - 12:00", "12:50 - 13:39", "13:40 - 14:29", "14:30 - 15:19", "15:30 - 16:19", "16:20 - 17:09", "17:10 - 18:00"};
    static int count = 0;
    static int getCount = 0;

    public static void main(String[] args) {

        ZipSecureFile.setMinInflateRatio(0);
        MatkulNew.data();
        cari();
        System.out.println(data.size());
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");
        spreadsheet.setDefaultColumnWidth(9);
        XSSFRow row;

        int x = 0;
        Map<Integer, String[][]> studentData = new TreeMap<>();
        for (String[][] strings : data) {
            studentData.put(x++, strings);
        }

        Set<Integer> keyid = studentData.keySet();

        int rowid = 1;
        int initial = 1;

        for (Integer key : keyid) {
            Object[][] objectArr = studentData.get(key);

            for (Object[] datum : objectArr) {
                row = spreadsheet.createRow(rowid++);
                int cellid = initial;
                for (Object obj : datum){
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String)obj);
                    style(cell);
                }
            }
            spreadsheet.createRow(rowid++);

            style(new CellRangeAddress(rowid-14,rowid-2,initial,initial+5), spreadsheet);
            style(new CellRangeAddress(rowid-14,rowid-14,initial,initial+5), spreadsheet);
            style(new CellRangeAddress(rowid-14,rowid-2,initial,initial), spreadsheet);
        }

//         .xlsx is the format for Excel Sheets...
//         writing the workbook into the file...
        try {
            FileOutputStream fos = new FileOutputStream("D:/baru.xlsx");
            workbook.write(fos);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void style(Cell cell){
        CellStyle cellStyle =cell.getSheet().getWorkbook().createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cell.setCellStyle(cellStyle);
    }

    public static void style(CellRangeAddress region, Sheet spreadsheet){
        RegionUtil.setBorderTop(BorderStyle.THICK, region, spreadsheet);
        RegionUtil.setBorderBottom(BorderStyle.THICK, region, spreadsheet);
        RegionUtil.setBorderLeft(BorderStyle.THICK, region, spreadsheet);
        RegionUtil.setBorderRight(BorderStyle.THICK, region, spreadsheet);
        RegionUtil.setTopBorderColor(IndexedColors.BLACK.index, region, spreadsheet);
        RegionUtil.setBottomBorderColor(IndexedColors.BLACK.index, region, spreadsheet);
        RegionUtil.setLeftBorderColor(IndexedColors.BLACK.index, region, spreadsheet);
        RegionUtil.setRightBorderColor(IndexedColors.BLACK.index, region, spreadsheet);
    }

    public static void cari() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++)
                    for (int l = 0; l < 4; l++)
                        for (int m = 0; m < 4; m++)
                            for (int n = 0; n < 4; n++)
                                for (int o = 0; o < 4; o++)
                                    for (int p = 0; p < 2; p++)
                                        for (int q = 0; q < 2; q++)
                                            data(i, j, k, l, m, n, o, p, 0, 0, 0, q, 0, 0, 0, 0);

    }

    public static void data(int api, int as, int iesi, int ki, int pam, int tis, int tkti, int ea, int bdt, int pewlan, int tbc, int mpti, int sig, int sfd, int dfp, int iot) {
        jadwal.addAll(MatkulNew.AS.get(as));
        jadwal.addAll(MatkulNew.API.get(api));
        jadwal.addAll(MatkulNew.IESI.get(iesi));
        jadwal.addAll(MatkulNew.KI.get(ki));
        jadwal.addAll(MatkulNew.PAM.get(pam));
        jadwal.addAll(MatkulNew.TKTI.get(tkti));
        jadwal.addAll(MatkulNew.TIS.get(tis));
//        jadwal.addAll(MatkulNew.BDT.get(bdt));
//        jadwal.addAll(MatkulNew.PEWLAN.get(pewlan));
//        jadwal.addAll(MatkulNew.TBC.get(tbc));
//        jadwal.addAll(MatkulNew.EA.get(ea));
//        jadwal.addAll(MatkulNew.MPTI.get(mpti));
//        jadwal.addAll(MatkulNew.SIG.get(sig));
        jadwal.addAll(MatkulNew.SFD.get(sfd));
//        jadwal.addAll(MatkulNew.DFP.get(dfp));
//        jadwal.addAll(MatkulNew.IOT.get(iot));
        count++;
        for (int i = 0; i < jadwal.size() - 1; i++) {
            for (int y = i + 1; y < jadwal.size(); y++) {
                if (jadwal.get(i) % 1000 == jadwal.get(y) % 1000) {
                    getCount++;
                    jadwal.clear(); return;
                }
            }
        }
        hari = new String[13][6];
        hari[0] = day;
        for (Integer integer : jadwal) {
            if (integer % 1000 == 0) break;
            int c = integer % 1000 / 100;
            int r = integer % 100;
            hari[r][c] = indentifier(integer);
        }
        for (int i = 1; i < hari.length; i++) {
            hari[i][0] = time[i-1];
            for (int h = 0; h < hari[i].length; h++) {
                if (hari[i][h] == null) hari[i][h] = "     ";
            }
        }
        data.add(hari);
//        hasil(hari);
        jadwal.clear();
    }

    public static void hasil(String[][] hari) {
        String selesai = "--------------------------------------------------------------\n" +
                "     Jam         Senin   Selasa     Rabu    Kamis    Jumat \n" +
                String.format(" 07:00 - 07:49  %6s   %6s   %6s   %6s   %6s  \n", hari[0][0], hari[1][0], hari[2][0], hari[3][0], hari[4][0]) +
                String.format(" 07:50 - 08:39  %6s   %6s   %6s   %6s   %6s  \n", hari[0][1], hari[1][1], hari[2][1], hari[3][1], hari[4][1]) +
                String.format(" 08:40 - 09:29  %6s   %6s   %6s   %6s   %6s  \n", hari[0][2], hari[1][2], hari[2][2], hari[3][2], hari[4][2]) +
                String.format(" 09:30 - 10:19  %6s   %6s   %6s   %6s   %6s  \n", hari[0][3], hari[1][3], hari[2][3], hari[3][3], hari[4][3]) +
                String.format(" 10:20 - 11:09  %6s   %6s   %6s   %6s   %6s  \n", hari[0][4], hari[1][4], hari[2][4], hari[3][4], hari[4][4]) +
                String.format(" 11:10 - 12:00  %6s   %6s   %6s   %6s   %6s  \n", hari[0][5], hari[1][5], hari[2][5], hari[3][5], hari[4][5]) +
                String.format(" 12:50 - 13:39  %6s   %6s   %6s   %6s   %6s  \n", hari[0][6], hari[1][6], hari[2][6], hari[3][6], hari[4][6]) +
                String.format(" 13:40 - 14:29  %6s   %6s   %6s   %6s   %6s  \n", hari[0][7], hari[1][7], hari[2][7], hari[3][7], hari[4][7]) +
                String.format(" 14:30 - 15:19  %6s   %6s   %6s   %6s   %6s  \n", hari[0][8], hari[1][8], hari[2][8], hari[3][8], hari[4][8]) +
                String.format(" 15:30 - 16:19  %6s   %6s   %6s   %6s   %6s  \n", hari[0][9], hari[1][9], hari[2][9], hari[3][9], hari[4][9]) +
                String.format(" 16:20 - 17:09  %6s   %6s   %6s   %6s   %6s  \n", hari[0][10], hari[1][10], hari[2][10], hari[3][10], hari[4][10]) +
                String.format(" 17:10 - 18:00  %6s   %6s   %6s   %6s   %6s  \n", hari[0][11], hari[1][11], hari[2][11], hari[3][11], hari[4][11]) +
                "--------------------------------------------------------------\n";
        jadi.add(selesai);
    }

    public static String indentifier(int x) {
        String kata;
        switch (x / 10000) {
            case 1 -> kata = "API";
            case 2 -> kata = "AS";
            case 3 -> kata = "IESI";
            case 4 -> kata = "KI";
            case 5 -> kata = "PAM";
            case 6 -> kata = "TIS";
            case 7 -> kata = "TKTI";
            case 8 -> kata = "EA";
            case 9 -> kata = "BDT";
            case 10 -> kata = "PEWLAN";
            case 11 -> kata = "TBC";
            case 12 -> kata = "MPTI";
            case 13 -> kata = "SIG";
            case 14 -> kata = "SFD";
            case 15 -> kata = "DFP";
            case 16 -> kata = "IOT";
            default -> kata = "EA";
        }
        switch (x / 1000 % 10) {
            case 1 -> kata = kata + "-A";
            case 2 -> kata = kata + "-B";
            case 3 -> kata = kata + "-C";
            case 4 -> kata = kata + "-D";
            default -> kata = kata + "--";
        }
        return kata;
    }
}
