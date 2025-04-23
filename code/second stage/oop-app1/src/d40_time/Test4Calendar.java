package d40_time;

import java.util.Calendar;
import java.util.Date;

public class Test4Calendar {
    public static void main(String[] args) {
        //目标：掌握Calendar的使用和特点。
        //11、得到系统此刻时间对应的日历对象。

        Calendar now = Calendar.getInstance();
        System.out.println("now = " + now);

        // 2、获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println("year = " + year);

        int days = now.get(Calendar.DAY_OF_YEAR);
        System.out.println("days = " + days);

        // 3、那道日历中记录的日期对象
        Date date = now.getTime();
        System.out.println(date);

        // 4、拿到时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println("time = " + time);

        // 5、修改日历中的某个信息
        now.set(Calendar.MONDAY, 9);
        now.set(Calendar.DAY_OF_YEAR, 125);
        System.out.println(now);

        // 6、为某个信息增加减少多少
        now.add(Calendar.DAY_OF_YEAR, 100);
        now.add(Calendar.DAY_OF_YEAR, -10);
        now.add(Calendar.DAY_OF_MONTH, 6);
        now.add(Calendar.HOUR, 12);
        System.out.println(now);
    }
}
