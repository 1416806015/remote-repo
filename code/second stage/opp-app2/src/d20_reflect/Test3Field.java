package d20_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test3Field {
    @Test
    public void testGetField() throws Exception {
        // 1、反射第一步，先得到类的Class对象
        Class c = Cat.class;

        // 2、获取类的全部成员变量
        Field[] fields = c.getDeclaredFields();

        // 3、遍历这个成员变量
        for (Field field : fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }

        // 4、定位某个成员变量
        Field fName = c.getDeclaredField("name");
        System.out.println(fName.getName() + "--->" + fName.getType());

        Field fAge = c.getDeclaredField("name");
        System.out.println(fAge.getName() + "--->" + fAge.getType());

        // 赋值
        Cat cat = new Cat();
        fName.setAccessible(true);  // 暴力反射 让这个成员变量不要去访问这个权限 ，禁止权限访问
        fName.set(cat, "咖啡猫");
        System.out.println(cat);

        // 取值
        String name = (String) fName.get(cat);
        System.out.println(name);
    }
}
