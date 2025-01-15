package algorithm.day10;

public class leetcode28 {
    public static void main(String[] args) {
        String str1 = "haystack";
        String str2 = "needle";
        System.out.println(strStr(str1, str2));
        String str3 = "haystackneedle";
        String str4 = "needle";
        System.out.println(strStr(str3, str4));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int i, j;
        if (m == 0) {
            return 0;
        }
        // 遍历 haystack
        for (i = 0; i <= n - m; i++) {
            for (j = 0; j < m; j++) {
                //使用 charAt 和循环遍历字符串中的每个字符。
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            // 如果完全匹配，返回当前下标
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
