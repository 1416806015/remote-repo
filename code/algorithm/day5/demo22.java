package algorithm.day5;

public class demo22 {

    public static void main(String[] args) {
        demo22 solution = new demo22();
        System.out.println(solution.addBinary("1010", "1011"));   // 输出 "10101"
        System.out.println(solution.addBinary("11", "1"));       // 输出 "100"
    }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // 指向 a 的末尾
        int j = b.length() - 1; // 指向 b 的末尾
        int carry = 0; // 进位
        // 从末尾开始逐位相加
        while (i >= 0 || j >= 0) {
            int sum = carry; // 当前位的和
            // 加上 a 的当前位
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            // 加上 b 的当前位
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            // 计算当前位的结果和进位
            result.append(sum % 2); // 当前位的结果
            carry = sum / 2; // 进位
        }
        // 如果最后还有进位，拼接到结果中
        if (carry != 0) {
            result.append(carry);
        }
        // 反转结果并返回
        return result.reverse().toString();
    }

}
