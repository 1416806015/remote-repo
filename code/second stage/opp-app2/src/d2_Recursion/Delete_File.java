package d2_Recursion;

import java.io.File;

public class Delete_File {
    public static void main(String[] args) {
        // 删除非空文件夹
        File dir = new File("D:/develop/Test");
        deleteDir(dir);
        
    }

    public static void deleteDir(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }

        if (dir.isFile()) {
            dir.delete();
            return;
        }

        // dir存在且是文件夹, 拿到里面的一级文件对象
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        // 2、这是一个有内容的文件夹，干掉里面的内容在删掉
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deleteDir(file);
            }
        }
        dir.delete();
    }

}
