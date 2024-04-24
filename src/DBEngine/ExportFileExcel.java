package DBEngine;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExportFileExcel {
    
    public void ExportFileExcel(JTable table, String fName) throws IOException {
        Workbook workbook = new XSSFWorkbook(); // tạo mới đối tượng đại diện cho excel.
        Sheet sheet = (Sheet) workbook.createSheet(fName); // tạo 1 đối tượng sheet, đại diện cho sheet bên trong file Excel
        // tạo tên cột 
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < table.getColumnCount(); i++) {
            Cell headerCell = headerRow.createCell(i);
            headerCell.setCellValue(table.getColumnName(i));
            // tạo font chữ đận cho tên cột 
            org.apache.poi.ss.usermodel.Font font = workbook.createFont();
            font.setBold(true);
            org.apache.poi.ss.usermodel.CellStyle style = workbook.createCellStyle();
            style.setFont(font);
            headerCell.setCellStyle(style);
        }

        // thêm dữ liệu trong jtable vào trong file
        for (int i = 0; i < table.getRowCount(); i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < table.getColumnCount(); j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(table.getValueAt(i, j).toString());
            }
        }
        FileOutputStream fileOut = new FileOutputStream(fName);
        workbook.write(fileOut);
        fileOut.close();
        JOptionPane.showMessageDialog(null, "Đã xuất thành công file: " + fName);
    }
}
