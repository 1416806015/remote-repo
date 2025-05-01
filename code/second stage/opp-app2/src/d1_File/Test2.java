package d1_File;

import java.io.File;
import java.text.SimpleDateFormat;

public class Test2 {
    public static void main(String[] args) {
        //1.创建文件对象，指代某个文件
        File f1 = new File("D:\\develop\\ab.txt");

        // 2、public boolean exists()：判断当前文件对象，对应的文件路径是否存在，存在返回true
        System.out.println(f1.exists());

        //3、public boolean isFile()）：判断当前文件对象指代的是否是文件，是文件返回true，反之。
        System.out.println(f1.isFile());

        //4、public boolean isDirectory()：判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之。
        System.out.println(f1.isDirectory());

        //5.public String getName(O：获取文件的名称（包含后缀)
        System.out.println(f1.getName());

        //6.public long Length()：获取文件的大小，返回字节个数
        System.out.println(f1.length());

        //7.public Long lastModified()：获取文件的最后修改时间。
        long time = f1.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(time));

        // 8.public String getPath(O)：获取创建文件对象时，使用的路径
        File f2 = new File("D:\\develop\\ab.txt");
        File f3 = new File("opp-app2\\src\\chenTest.txt");
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());

        //9.public String getAbsolutePathO:获取绝对路径
        System.out.println(f2.getAbsolutePath());
        System.out.println(f3.getAbsolutePath());
    }
}
