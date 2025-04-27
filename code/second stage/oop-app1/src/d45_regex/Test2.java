package d45_regex;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        checkPhone();
        checkEmail();
    }

    public static void checkPhone() {
        while (true) {
            System.out.println("请输入您的电话号码~~");
            Scanner scanner = new Scanner(System.in);
            String phone = scanner.nextLine();
            // 145448464 011-50505505 6560446655
            if (phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")) {
                System.out.println("输入的号码正确！");
                break;
            } else {
                System.out.println("输入的号码不正确！");
            }
        }
    }

    public static void checkEmail() {
        while (true) {
            System.out.println("请输入您的邮箱~~");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();
            // deli0009@163.com  22566456@qq.com  chen@itcast.com.cn
            if (email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")) {
                System.out.println("输入的邮箱正确！");
                break;
            } else {
                System.out.println("输入的邮箱不正确！");
            }
        }
    }
}
