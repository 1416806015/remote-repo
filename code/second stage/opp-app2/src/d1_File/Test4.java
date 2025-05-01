package d1_File;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //1、public String[] list()：获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
        File file = new File("D:/develop");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }

        //2、public File[] listFiles()：（重点）获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }
    }
}
