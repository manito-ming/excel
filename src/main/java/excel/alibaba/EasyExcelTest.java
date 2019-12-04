package excel.alibaba;


import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import excel.alibaba.ExcelListener;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EasyExcelTest {

    public static void main(String[] args) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\mingzhihong\\Desktop\\map1.xlsx"));
        try {
            ExcelListener excelListener = new ExcelListener();
            EasyExcelFactory.readBySax(in, new Sheet(1, 1, MapData.class),excelListener);
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            in.close();
        }

    }

}

