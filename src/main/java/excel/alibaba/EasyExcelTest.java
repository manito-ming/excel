package excel.alibaba;


import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import excel.alibaba.ExcelListener;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EasyExcelTest {
   /*  直接启动会报错，和poi的excel冲突
   需要注释掉pom文件中的这两个依赖
   <!--        poi excel -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>3.16-beta2</version>
        </dependency>
        <dependency>
            <groupId>xerces</groupId>
            <artifactId>xercesImpl</artifactId>
            <version>2.11.0</version>
        </dependency>
   * */
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

