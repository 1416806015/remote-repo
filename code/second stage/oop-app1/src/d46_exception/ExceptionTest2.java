package d46_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  目标：异常处理
 * */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("您要找的文件不存在！！！");
            throw new RuntimeException(e); // 打印出这个异常对象的信息，记录下来
        } catch (ParseException e) {
            System.out.println("您要解析的时间异常！！");
            throw new RuntimeException(e);
        }
    }

    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2008-10-11 10:22:16");
        test2();
    }

    public static void test2() throws FileNotFoundException {
        // 读取文件
        FileInputStream is = new FileInputStream("D:/meinv.png");
    }
}
