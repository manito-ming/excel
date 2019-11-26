package csv;



import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author mingzhihong
 * @date 2019/10/22 17:15
 * @descpition 读取csv格式的文件
 */

public class csv {
    public void readCsv(String path){
        try (FileInputStream inputStream = new FileInputStream(path);
             InputStreamReader reader = new InputStreamReader(inputStream,"GBK");
             Scanner sc = new Scanner(reader)) {
//            LogUtils.info(df.format(new Date()) + "读取文件中...\n" + "文件名为:" + name);
            /**
             * 读取csv文件
             * 因为文件过大，所以需要用scanner每行读取
             * 用FileInputStream 相当于在内存和文件之见加了一个数据传输管道
             * 然后用Scanner去读取这个流，一行一行的去读这个文件
             */
            int i=0;
            while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    //文件是CSV文件，CSV文件中的每一列是用","隔开的，这样就可以得到每一列的元素
                    String[] strArray = line.split(",");
                for (String str:strArray) {
                }
                i++;
                System.out.print(strArray[15]+",");
            }
            System.out.println("结束:"+i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//    public void readexcel(String path){
//        CsvReadBs csvReadBs = CsvReadBs.newInstance(path);
//        csvReadBs.charset("GBK");
//        csvReadBs.startIndex();
//
//    }

    public static void main(String[] args) {
        csv c = new csv();
        c.readCsv("C:\\Users\\mingzhihong\\Desktop\\ds20191000000930_2.csv");
    }
}
