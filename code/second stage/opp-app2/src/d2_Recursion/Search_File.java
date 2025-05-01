package d2_Recursion;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Search_File {
    public static void main(String[] args) throws Exception {
        searchFile(new File("D:/"), "QQ.exe");

    }

    /**
     * 去目录下搜索某个文件
     *
     * @param dir      目录
     * @param fileName 要搜索的文件名称
     */
    public static void searchFile(File dir, String fileName) throws IOException {
        // 1、把非法的情况都拦截
        if (dir == null || !dir.exists() || dir.isFile()) {
            return; //代表无法搜索
        }

        // 2、dir不是null，存在，一定是目录对象
        // 获取当前目录下的全部一级文件对象
        File[] files = dir.listFiles();

        // 3、判断当前目录下是否存在一级目录文件对象，以及是否可以拿到一级文件对象
        if (files != null && files.length > 0) {
            // 4、遍历全部一级文件对象
            for (File file : files) {
                // 5、判断文件是否是文件，还是文件夹
                if (file.isFile()) {
                    // 是文件，判断这个文件名是否是我们要找的
                    if (file.getName().contains(fileName)) {
                        System.out.println("找到了：" + file.getAbsolutePath());
                        // 可运行  .exe  .bat 文件
//                        Runtime runtime = Runtime.getRuntime();
//                        runtime.exec(file.getAbsolutePath());

                        // Desktop.getDesktop().open(file) 支持：
                        // .txt → 用记事本（Notepad）打开
                        //.pdf → 用 Adobe Reader 或 Edge 打开
                        //.jpg → 用照片查看器打开
                        //.exe → 直接运行程序
//                        if (Desktop.isDesktopSupported()) {
//                            Desktop.getDesktop().open(file);
//                        }
                        // 增加异常捕获
                        try {
                            if (Desktop.isDesktopSupported()) {
                                Desktop.getDesktop().open(file);
                            } else {
                                System.out.println("当前环境不支持用默认程序打开文件。");
                            }
                        } catch (IOException e) {
                            System.out.println("无法打开文件：" + e.getMessage());
                        }
                    }
                } else {
                    // 是文件夹，继续重复这个过程
                    searchFile(file, fileName);
                }
            }
        }

    }
}
