package algorithm.day3;

public class demo14 {
    public static void main(String[] args) {
        int x = search(101, 200);
        System.out.println("当前素数个数：" + x);
    }

    public static int search(int start, int end) {
//        start=101 end=200
        int count = 0;
        for (int i = start; i <= end; i++) {
//              判断这个i是否为素数
            //信号位思想
            boolean flag = true;  //假设当前这个数是素数
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
//              i当前这个数不是素数
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
