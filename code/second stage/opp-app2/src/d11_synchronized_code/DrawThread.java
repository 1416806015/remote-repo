package d11_synchronized_code;

public class DrawThread extends Thread {

    private Accout acc;

    public DrawThread(Accout acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 取钱
        acc.drawMoney(10000);
    }


}
