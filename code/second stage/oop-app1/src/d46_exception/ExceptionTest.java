package d46_exception;


public class ExceptionTest {
    public static void main(String[] args) {
        try {
            saveAge(256);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            saveAge2(250);
        } catch (AgeIllegalException e) {
            throw new RuntimeException(e);
        }

    }

    public static void saveAge(int age) {
        if (age > 0 && age < 150) {
            System.out.println("年龄被成功保存：" + age);
        } else {
            // 用一个异常对象封装这个问题
            // throw 抛出去异常对象
            throw new AgeIllegalRuntimeException("/age is illegal, your age is" + age);
        }
    }

    public static void saveAge2(int age) throws AgeIllegalException {
        if (age > 0 && age < 150) {
            System.out.println("年龄被成功保存：" + age);
        } else {
            // 用一个异常对象封装这个问题
            // throw 抛出去异常对象
            // throws 用在方法上，抛出方法内部的异常
            throw new AgeIllegalException("年龄不合法，您的年龄是：" + age);
        }
    }
}
