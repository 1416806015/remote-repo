package day2;

import java.util.Random;

public class demo9 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 5; // 字符串长度
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            randomString.append(generateRandomChar(random)); // 生成随机字符并拼接
        }
        System.out.println("随机字符串: " + randomString);
    }

    /**
     * 生成随机字母或数字（大小写混合）
     *
     * @param random Random 对象
     * @return 随机字符
     */
    public static char generateRandomChar(Random random) {
        int choice = random.nextInt(3); // 随机选择生成小写字母、大写字母或数字
        char randomChar;
        switch (choice) {
            case 0:
                randomChar = (char) ('a' + random.nextInt(26)); // 生成随机小写字母
                break;
            case 1:
                randomChar = (char) ('A' + random.nextInt(26)); // 生成随机大写字母
                break;
            default:
                randomChar = (char) ('0' + random.nextInt(10)); // 生成随机数字
                break;
        }
        return randomChar;
    }
}