package d1_File;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //File f1 = new File("D:/develop/ab.txt");
        //File f1 = new File("D:\\develop\\ab.txt");
        File f1 = new File("D:" + File.separator + "develop" + File.separator + "ab.txt");
        System.out.println(f1.length()); // 文件大小

        // 注意：File可以指代一个不存在的文件路径
        File file = new File("D:/develop/aaa.txt");
        System.out.println(file.exists()); // false

        //我现在要定位的文件是在模块中，应该怎么定位呢？
        //绝对路径：带盘符的
        // File f4 = new File("D:/develop/self_idea_project/second stage/opp-app2/src/chenTest.txt");
        //相对路径（重点）：不带盘符，默认是直接去工程下寻找文件的。
        File f4 = new File("opp-app2/src/chenTest.txt");
        System.out.println(f4.length());
    }
}
