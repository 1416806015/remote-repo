package com.example.springbootweb.dao.impl;


import com.example.springbootweb.dao.EmpDao;
import com.example.springbootweb.pojo.Emp;
import com.example.springbootweb.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  // 将当前类交给IOC容器管理，成为IOC容器中的bean
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
            // 1、加载并解析emp.xml
            // 获取类路径下的emp.xml文件的绝对路径
            String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
            System.out.println(file);
            List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
            return empList;
    }
}
