package d39_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println("c = " + c);
        System.out.println("-------------------------");

        // 1、把他们变成字符串封装成BigDecimal对象来运算
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);


//        BigDecimal c1 = a1.add(b1);  // +
//        BigDecimal c1 = a1.subtract(b1); // -
//        BigDecimal c1 = a1.multiply(b1); // *
        BigDecimal c1 = a1.divide(b1); // /
        System.out.println("c1 = " + c1);


        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println("k = " + k);

        // 把BigDecimal对象转换为double类型的数据
        double rs = k.doubleValue();
        System.out.println("rs = " + rs);

    }

}
