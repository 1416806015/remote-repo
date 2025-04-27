package d45_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        String data = " 来黑马程序员学习Java, \n" +
                " 电话：1866668888， 18699997777\n" +
                " 或者联系邮箱：boniu@itcast.cn, \n" +
                " 座机电话：01036517895， 010-98951256\n" +
                " 邮箱：bozai@itcast.cn, \n" +
                " 邮箱2：dlei0009@163.com，\n" +
                " 热线电话：400-618-9090，400-618-4000，400-618-4000，4006184000， 4006189090";

        // 1. 定义爬取规则（正则表达式）
        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|(\\d{1,2}-?\\d{3,8}-?\\d{3,8}-?\\d{3,8})|(\\d{3,8}\\d{3,8}\\d{3,8}\\d{3,8}\\d{3,8}\\d{3,8})";

        // 2. 把正则表达式封装成一个Pattern对象
        Pattern pattern = Pattern.compile(regex);

        // 3.通过pattern对象得到查找内容的匹配器
        Matcher matcher = pattern.matcher(data);

        // 4.通过匹配器开始去内容中查找信息
        while (matcher.find()) {
            System.out.println(matcher.group()); //取出信息
        }

    }

}
