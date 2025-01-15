package algorithm.day1;

public class demo3 {
    public static void main(String[] args) {
/*逢七过：
*   规则：从任意一个数开始报数，当你要报的数字是包含7或者是7的倍数时都要说：过
    需求：在控制台打印出1-100之间满足逢七过的数字
* */
        int a = 1;
        int temp;
        while (a <= 100) {
            temp = a % 7;
            if (temp == 0 || a % 10 == 7)
                System.out.println("过");
            else
                System.out.println(a);
            a++;
        }

    }
}
