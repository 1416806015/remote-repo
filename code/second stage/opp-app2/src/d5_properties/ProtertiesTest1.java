package d5_properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class ProtertiesTest1 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个Properties的对象（键值对集合，空容器）
        Properties properties = new Properties();

        // 2、开始加载属性文件中的键值对数据到properties对象中去
        properties.load(new FileReader("D:opp-app2\\src\\d5_properties\\user.properties"));
        System.out.println(properties);

        // 3、根据键取值
        System.out.println(properties.getProperty("赵敏"));

        // 4、遍历全部的键和值
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "--->" + value);
        }

        properties.forEach((k, v) -> {
            System.out.println(k + "-->" + v);
        });

    }
}
