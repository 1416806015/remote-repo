package d19_junit;

import org.junit.*;

/**
 * 测试类
 */
public class StringUtilTest {
    @Before
    public void test1() {
        System.out.println("----> test1 Before 执行了-------");
    }

    @BeforeClass
    public static void test11() {
        System.out.println("----> test11 BeforeClass 执行了-------");
    }

    @After
    public void test2() {
        System.out.println("----> test2 After 执行了-------");
    }

    @AfterClass
    public static void test22() {
        System.out.println("----> test22 AfterClass 执行了-------");
    }

    @Test   // 测试方法
    public void testPrintNumber() {
        StringJunit.pritNumber("admin");
        StringJunit.pritNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        int index = StringJunit.getMaxIndex(null);
        System.out.println(index);

        int index1 = StringJunit.getMaxIndex("admin");
        System.out.println(index1);

        // 断言机制：程序员可以通过预测业务方法的结果
        Assert.assertEquals("方法内部有bug！", 4, index1);
    }
}
