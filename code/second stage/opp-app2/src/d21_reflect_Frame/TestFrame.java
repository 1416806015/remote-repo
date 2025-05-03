package d21_reflect_Frame;

import org.junit.Test;

public class TestFrame {
    @Test
    public void save() throws Exception {
        Student s1 = new Student("福建吴彦祖", 45, '男', 185.3, "篮球，台球。阅读");
        Teacher t1 = new Teacher("波妞", 999.9);

        // 需求：把任意对象的字段名和其对应的值等信息，保存到文件中去。
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(t1);


    }
}
