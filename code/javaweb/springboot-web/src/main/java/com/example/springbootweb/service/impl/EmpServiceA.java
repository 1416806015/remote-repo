package com.example.springbootweb.service.impl;



import com.example.springbootweb.dao.EmpDao;
import com.example.springbootweb.pojo.Emp;
import com.example.springbootweb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  // 将当前类交给IOC容器管理，成为IOC容器中的bean
public class EmpServiceA implements EmpService {
    @Autowired  // 运行时，IOc容器会提供该类型的bean对象，并赋值给该变量 － 依赖注入
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {
        // 1、调用dao，获取数据
        List<Emp> empList = empDao.listEmp();

        // 2、对数据进行转换  gender job
        empList.stream().forEach(emp -> {
            // 处理 gender 1:男 , 2:女
            String gender = emp.getGender();
            if (gender.equals("1")){
                emp.setGender("男");
            }else if (gender.equals("2")){
                emp.setGender("女");
            }

            // 处理 job  1:讲师， 2:班主任， 3:就业指导
            String job = emp.getJob();
            if (job.equals("1")){
                emp.setJob("讲师");
            }else if (job.equals("2")){
                emp.setJob("班主任");
            }else if (job.equals("3")){
                emp.setJob("就业指导");
            }

        });
        return empList;
    }
}
