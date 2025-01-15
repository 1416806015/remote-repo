package algorithm.day5;

public class demo20 {
    public static void main(String[] args) {
        demo20 solution = new demo20();
        System.out.println(solution.addDigits(38)); // 输出 2
        System.out.println(solution.addDigits(12345)); // 输出 6
    }

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
}
