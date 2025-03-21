# MySQL

## 客服端连接

```java
mysql [-h 127.0.0.1][-P 3306] -u root -p
```

# DDL

![](docs/assets/ddl.png)

![](docs/assets/ddl2.png)

```java
创建表
//需求：设计一张员工信息表，要求如下：
1．编号（纯数字）
2 员员工工号（字符串类型，长度不超过10位）
3.员工姓名（字符串类型，长度不超过10位）
4.[性别（男/女，存储一个汉字）
5．年龄（正常人年龄，不可能存储负数）
6.身份证号（二代身份证号均为18位，身份证中有X这样的字符）
7、入职时间（取值年月日即可）
create table emp(
    -> id int comment '编号',
    -> workno varchar(10) comment '工号',
    -> name varchar(10) comment '姓名',
    -> gender char(1) comment '性别',
    -> age tinyint unsigned comment '年龄',
    -> idcard char(11) comment '身份证号',
    -> entrydate date comment '入职时间'
    -> ) comment '员工表';
```

![](docs/assets/ddl.3.png)
