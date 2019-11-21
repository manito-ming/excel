package excel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author mingzhihong
 * @date 2019/10/23 12:25
 * @descpition 去掉<br><br/>
 */
public class Test {
    public static void main(String[] args) {
        String subjectString = "小孩<br/>大人";
        System.out.println("<br\\s*/?>");
        subjectString = subjectString.replaceAll("<br\\s*/?>", "\r\n");
        String xx = subjectString;
        System.out.println(subjectString);
        List<String > asList  = new ArrayList<>();
        asList.add("0564165");
        Set<String> set = new HashSet<>(asList);
        for (String s: set){
            System.out.println(s);
        }
    }
}
