package algorithm.day7;

import java.util.Scanner;

public class demo27 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入石头的总数: ");
            int num = sc.nextInt();
            System.out.println(canWinNim(num));
        }
    }

    public static boolean canWinNim(int n) {
        /*如果 n % 4 != 0，当前玩家可以获胜。
        否则，当前玩家必输。*/
        return n % 4 != 0;
    }
}
