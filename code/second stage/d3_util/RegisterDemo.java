package d3_util;

import java.util.Random;

public class RegisterDemo {
    public static void main(String[] args) {
        String code="";
        String data = "abcdefghijklmnopqrstuvwxyz";
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int index=r.nextInt(data.length());
            code+=data.charAt(index);
        }
        System.out.println((code));
    }
}
