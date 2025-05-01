package d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // 1、编码
        String data = "a我b";
        byte[] bytes = data.getBytes();
        System.out.println(Arrays.toString(bytes));

        // 按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // 2、解码
        String s = new String(bytes);
        System.out.println(s);

        String s1 = new String(bytes1, "GBK");
        System.out.println(s1);
    }
}
