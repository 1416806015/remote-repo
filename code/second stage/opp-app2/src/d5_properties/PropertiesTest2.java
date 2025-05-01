package d5_properties;

import java.io.FileWriter;
import java.util.Properties;

/**
 * 目标：掌握把键值对数据存入到属性文件中去
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws Exception {

        // 1、创建一个Properties的对象,先用他来存储一些键值对
        Properties properties = new Properties();
        properties.setProperty("张无忌", "minmin");
        properties.setProperty("杨叔叔", "cuisan");
        properties.setProperty("张翠山", "susu");

        // 2、把properties对象中的键值对数据存入到属性文件中
        properties.store(new FileWriter("opp-app2/src/user.properties")
                , "i saved many users!");
        
    }
}
