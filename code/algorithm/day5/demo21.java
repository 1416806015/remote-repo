package algorithm.day5;

public class demo21 {
    public static void main(String[] args) {
        demo21 solution = new demo21();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // 输出 true
        System.out.println(solution.isPalindrome("race a car")); // 输出 false
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // 跳过非字母数字字符
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // 比较字符（忽略大小写）
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            // 移动指针
            left++;
            right--;
        }
        return true;
    }
}
