package d45_regex;

public class RegexTest {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("1416806015"));
        System.out.println(checkQQ("14168a06015"));
        System.out.println("-----------------------");
        System.out.println(checkQQ1(null));
        System.out.println(checkQQ1("1416806015"));
        System.out.println(checkQQ1("14168a06015"));
    }

    public static boolean checkQQ1(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq) {
        if (qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        // 判断qq号码中是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            // 根据索引提取当前位置处的字符
            char ch = qq.charAt(i);
            // 判断ch记住的字符，如果不是数字，qq号码不合法
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        // 说明qq号码肯定是合法的
        return true;
    }
}
