package algorithm.day6;

public class demo24 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(climbStatirs(x));
    }

    //   1、2、3、5、8、13、21、34、55、89
    /*
     * 1     1
     * 2     2    （1+1  2）
     * 3     3    （1+1+1 1+2 2+1）
     * 4     5    （1+1+1+1 1+2+1 2+1+1）
     *
     * */
    public static int climbStatirs(int n) {
        int x = 1;
        int y = 2;
        int r = 0;
        for (int i = y; i < n; i++) {
            r = x + y;
            x = y;
            y = r;
        }
        return r;
    }
}
