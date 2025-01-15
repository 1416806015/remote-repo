package algorithm.day10;

public class leetcode58 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("长度为:" + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0; // 记录最后一个单词的长度
        int i = s.length() - 1; // 从字符串末尾开始遍历
        // 跳过末尾的空格
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // 计算最后一个单词的长度
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
