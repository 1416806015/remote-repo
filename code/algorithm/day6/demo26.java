package algorithm.day6;

public class demo26 {
    public static void main(String[] args) {
        demo26 solution = new demo26();
        System.out.println(solution.isPowerOfTwo(26));
        System.out.println(solution.isPowerOfTwo(32));
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // 2 的幂必须是正整数
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

}
