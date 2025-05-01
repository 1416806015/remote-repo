package d1_File;

import java.io.File;

public class Test3 {
    public static void main(String[] args) throws Exception {

        // 1、public boolean createNewFile()：创建一个新文件（文件内容为空），创建成功返回true,反之。
        File f1 = new File("D:/develop/itheima.txt");
        System.out.println(f1.createNewFile());

        // 2、public boolean mkdir(O)：用于创建文件夹，注意：只能创建一级文件夹
        File f2 = new File("D:/develop/aaa");
        System.out.println(f2.mkdir());

        // 3、public boolean mkdirs()：用于创建文件夹，注意：可以创建多级文件夹
        File f3 = new File("D:/develop/aaa/bbb");
        System.out.println(f3.mkdir());

        //3、public boolean delete()：删除文件，或者空文件，注意：不能删除非空文件夹。
        System.out.println(f1.delete());
        System.out.println(f3.delete());

    }
}
