package com.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;  // 记住登录后的账户

    //启动ATM系统，展示欢迎界面
    public void start() {
        while (true) {
            System.out.println("======欢迎您进入ATM系统======");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //用户登录
                    login();
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作~~~");
            }
        }
    }

    //用户的登录
    private void login() {
        System.out.println("====系统登录====");
        // 1.判断是否存在账户对象，存在才能登录
        if (accounts.size() == 0) {
            System.out.println("当前系统中无任何账户，请先开户~~~");
            return; //跳出登录操作
        }
        while (true) {
            // 2.系统中存在账户对象，可以开始登录
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();
            // 3.判断这个卡号是否存在
            Account acc = getAccountByCarId(cardId);
            if (acc == null) {
                System.out.println("该账户不存在，请重新输入~~");
            } else {
                while (true) {
                    // 卡号存在，输入密码
                    System.out.println("请您输入密码：");
                    String passWord = sc.next();
                    if (acc.getPassword().equals(passWord)) {
                        loginAcc = acc;
                        //密码正确，登陆成功
                        System.out.println("恭喜您，" + acc.getUserName() + "您的卡号是：" + acc.getCardId());
                        // 展示登录后的操作界面
                        showUserCommand();
                        return;  //跳出并结束当前登录方法
                    } else {
                        System.out.println("您输入的密码有误，请重新输入~~");

                    }
                }
            }
        }
    }

    //展示登录后的操作界面
    private void showUserCommand() {
        while (true) {
            System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户的处理====");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询账户
                    showLoginAccount();
                    break;
                case 2:
                    //存款
                    depositMoney();
                    break;
                case 3:
                    //取款
                    drawMoney();
                    break;
                case 4:
                    //转账
                    transferMoney();
                    break;
                case 5:
                    //密码修改
                    break;
                case 6:
                    //退出
                    System.out.println(loginAcc.getUserName() + "您退出系统成功~~~");
                    return;  //跳出并结束当前方法
                case 7:
                    //注销当前账户
                    deleteAccount();
                    break;
                default:
                    System.out.println("您当前选择的操作不存在，请确认~~~");
            }
        }
    }

    //注销账户
    private void deleteAccount() {
        System.out.println("====进行销户操作====");
    }

    //转账
    private void transferMoney() {
        System.out.println("====转账====");
        // 1、判断系统中是否存在其他账户
        if (accounts.size() < 2) {
            System.out.println("当前系统中只有你一个账户，无法为其他账户转账~~~");
            return;
        }
        // 2、判断自己的账户是否有钱
        if (loginAcc.getMoney() == 0) {
            System.out.println("穷逼就别转了~~~~");
            return;
        }
        // 3、开始转账
        while (true) {
            System.out.println("请您输入需要转账的卡号：");
            String cardId = sc.next();
            //4、判断这个卡号是否正确
            Account acc = getAccountByCarId(cardId);
            if (acc == null) {
                System.out.println("您输入的卡号不正确~~");
            } else {
                //用户存在，认证对方的姓氏
                String name = "*" + acc.getUserName().substring(1);  // * + 马刘德华
                System.out.println("请您输入【" + name + "】的姓氏");
                String preName = sc.next();
                // 5、判断这个姓氏是否正确
                if (acc.getUserName().startsWith(preName)) {
                    while (true) {
                        //认证通过
                        System.out.println("请您输入给对方转账的金额：");
                        double money = sc.nextDouble();
                        //6、判断是否超过自己的余额
                        if (loginAcc.getMoney() >= money) {
                            //转账给对方
                            //更新自己的余额
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            //更新对方的余额
                            acc.setMoney(acc.getMoney() + money);
                            return;  // 跳出转账方法
                        } else {
                            System.out.println("对不起，您的余额不足，最多还可以转账：" + loginAcc.getMoney());
                        }
                    }
                } else {
                    System.out.println("对不起，您输入的姓氏有问题~~~");
                }
            }
        }
    }

    //取款
    private void drawMoney() {
        System.out.println("====取款====");
        // 1、判断账户余额是否达到100元
        if (loginAcc.getMoney() < 100) {
            System.out.println("您的余额不足，请确认~~~" + "您的余额剩余：" + loginAcc.getMoney());
            return;
        }

        // 2、让用户输入取款金额
        while (true) {
            double money = sc.nextDouble();
            if (loginAcc.getMoney() >= money) {
                //4、当前取款金额是否超过限额
                if (money > loginAcc.getMoney()) {
                    System.out.println("您当前取款金额超过限额，您每次可以取款：" + loginAcc.getMoney());
                } else {
                    // 代表可以开始取款，更新取款后的余额
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("您取款：" + money + "成功，取款后剩余：" + loginAcc.getMoney());
                    break;
                }
            } else {
                System.out.println("余额不足，您的账户余额为：" + loginAcc.getMoney());
            }
        }
    }

    // 存款
    private void depositMoney() {
        System.out.println("====存款====");
        System.out.println("请输入您的存款金额：");
        double money = sc.nextDouble();
        // 更新当前账户的余额
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，您这次存了：" + money + "成功，余额为：" + loginAcc.getMoney());
    }

    // 展示当前登录的账户信息
    private void showLoginAccount() {
        System.out.println("====当前您的账户信息如下：");
        System.out.println("卡号：" + loginAcc.getCardId());
        System.out.println("户主：" + loginAcc.getUserName());
        System.out.println("性别：" + loginAcc.getSex());
        System.out.println("余额：" + loginAcc.getMoney());
        System.out.println("每次取现额度：" + loginAcc.getLimit());
    }

    //完成用户开户
    private void createAccount() {
        System.out.println("====系统开户操作====");
        //1、创建一个账户对象，用于封装用户的开户信息
        Account acc = new Account();
        //2、需要用户对象用于输入自己的开户信息，赋值给账户对象
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);
        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0);  //"男“
            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("您输入的性别有误~只能是男或者女~~");
            }
        }
        while (true) {
            System.out.println("请您输入您的账户密码：");
            String password = sc.next();
            System.out.println("请您输入您的确认密码：");
            String passwordok = sc.next();
            //判断2次密码是否一样
            if (password.equals(passwordok)) {
                acc.setPassword(password);
                break;
            } else {
                System.out.println("您输入的2次密码不一致，请您重新输入");
            }
        }
        System.out.println("请您输入您的取现额度");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        // 重点：生成卡号（由系统生成，不可一样）
        String newCardId = createCardId();
        acc.setCardId(newCardId);
        //3、把这个账户对象存到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜你，" + acc.getUserName() + "您的卡号是：" + acc.getCardId());
    }

    // 返回一个8位数字的卡号（不能重复）
    private String createCardId() {
        while (true) {
            // 1.定义一个String类型的变量记住8位数字作为卡号
            String cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);   //0-9
                cardId += data;
            }
            // 判断carId中记住的卡号，是否重复
            Account acc = getAccountByCarId(cardId);
            if (acc == null) {
                // 说明carId没有找到账户对象，因此carId没有重复，可以返回作为一个新的卡号
                return cardId;
            }
        }
    }

    // 根据卡号查询账户对象返回
    private Account getAccountByCarId(String cardId) {
        //遍历全部的账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            //判断这个账户对象acc中的卡号是否我们要找的卡号
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null; //查无此账户，这个卡号不存在
    }
}
