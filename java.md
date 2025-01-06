# java

## 1.Scanner

作用：键盘输入数据

```java
import java.util.Scanner;

#从键盘输入数据
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

## 2. Random

作用：生成随机数

```java
import java.util.Random;

#得到0-9的随机数
Random r = new Random();
int number = r.nextInt(10); # nextInt(n)只能生成0-n-1的数，不包含n  
```

## 3.数组

```java
静态初始化
#完整格式
数据类型[] 数据名 = new 数据类型[]{元素1,元素2...}
int[] ages = new int[]{12,23,44};
#简化格式
数据类型[] 数据名 = {元素1,元素2...}
int[] ages = {22,34,44};


动态初始化
数据类型[] 数组名 = new 数据类型[长度];
int[] ages = new int[3];
```

## 4.方法

![](C:\Users\14168\AppData\Roaming\marktext\images\2025-01-03-16-40-47-image.png)

```java
public static int sum(int a,int b){
    int c = a + b;
    return c;
}
```
