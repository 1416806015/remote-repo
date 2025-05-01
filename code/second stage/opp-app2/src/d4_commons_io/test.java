package d4_commons_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {
    public static void main(String[] args) throws IOException {
        // 复制文件
        // FileUtils.copyFile(new File("opp-app2\\src\\chenTest.txt"), new File("opp-app2\\src\\chenTest3.txt"));
        // 复制文件夹
        //FileUtils.copyDirectory(new File("opp-app2\\src\\chenTest4.txt"), new File("D:\\develop\\Test\\b"));
        // 删除文件夹
        // FileUtils.deleteDirectory(new File("D:\\develop\\Test\\b"));

        // java原生提供的方法
        // Files.copy(Path.of("opp-app2\\src\\chenTest.txt"), Path.of("opp-app2\\src\\chenTest4.txt"));

        // readString 读成一个字符串返回
        System.out.println(Files.readString(Path.of("opp-app2\\src\\chenTest4.txt")));

    }
}
