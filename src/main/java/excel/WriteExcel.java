package excel;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author mingzhihong
 * @date 2019/10/22 21:00
 */
public class WriteExcel {


    /**
     * 将数据写入excel文件
     *
     * @param listData 表数据
     * @param columnNameCN 表的列名称
     * @param sheetName workbook名称
     * @throws IOException
     */
    public static void exportXlsxFromSQL(List<?> listData, List<String> columnNameCN, String sheetName) throws IOException {
        ObjectMapper om = new ObjectMapper();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        // 时间类型格式，如果不设置这个，excel默认展示位number型
        XSSFDataFormat format = workbook.createDataFormat();
        cellStyle.setDataFormat(format.getFormat("yyyy-MM-dd hh:mm:ss"));

        XSSFSheet spreadsheet = workbook.createSheet(sheetName);
        int rowNum = 0;
        XSSFRow row = spreadsheet.createRow(rowNum);
        XSSFCell cell;
        for (int i = 0; i < columnNameCN.size(); i++) {
            cell = row.createCell(i);
            cell.setCellValue(columnNameCN.get(i));
        }
        int cellNum = 0;
        for (Object data : listData) {
            rowNum++;
            row = spreadsheet.createRow(rowNum);
                cell = row.createCell(cellNum);
                if (data instanceof String) {
                    cell.setCellValue((String) data);
                    continue;
                }

        }

        OutputStream out = new FileOutputStream(new File("C:\\Users\\mingzhihong\\Desktop\\mapx.xlsx"));
        workbook.write(out);
        out.close();
        workbook.close();
    }
    public static void main(String[] args) throws Exception{
        List<String> listData = new ArrayList<>();
        List<String> columnNameCN = new ArrayList<>();
        String sheetName = "1";
        listData.add("中国");
        listData.add("美国");
        columnNameCN.add("国家");
        exportXlsxFromSQL(listData,columnNameCN,sheetName);
    }
}
