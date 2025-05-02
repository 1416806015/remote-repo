package d11_synchronized_code;

public class Accout {
    private String carId;
    private double money;

    public Accout() {
    }

    public Accout(String carId, double money) {
        this.carId = carId;
        this.money = money;
    }

    // 静态方法用类名来作为锁，每次只有一个线程可以访问
    public static void test() {
        synchronized (Accout.class) {

        }
    }

    // 小明和小红同时来取钱
    public void drawMoney(double money) {
        // 先搞清楚是谁来取钱
        String name = Thread.currentThread().getName();
        // 同步代码块
        // this 正好代表共享资源
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "来取钱" + money + "成功");
                this.money -= money;
                System.out.println(name + "来取钱后，余额剩余：" + this.money);
            } else {
                System.out.println(name + "来取钱，余额不足~~");
            }
        }

    }


    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
