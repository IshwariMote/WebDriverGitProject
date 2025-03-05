import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        Workbook workbook = WorkbookFactory.create(true);
        Sheet sheet = workbook.createSheet("TestData");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        
        cell.setCellValue("Hello, Excel!");
        
        FileOutputStream fos = new FileOutputStream("TestData.xlsx");
        workbook.write(fos);
        
        fos.close();
        workbook.close();
    }
}
