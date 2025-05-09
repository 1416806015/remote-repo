package com.example.springbootweb.controller;



import com.example.springbootweb.pojo.Emp;
import com.example.springbootweb.pojo.Result;
import com.example.springbootweb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired  // 运行时，IOc容器会提供该类型的bean对象，并赋值给该变量 － 依赖注入
    private EmpService empService;
@RequestMapping("/listEmp")
    public Result list(){
    // 1、调用service，获取数据
    List<Emp> empList = empService.listEmp();
    // 3、响应数据
    return Result.success(empList);
    }

//    // 1、加载并解析emp.xml
//    // 获取类路径下的emp.xml文件的绝对路径
//    String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//    System.out.println(file);
//    List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//    // 2、对数据进行转换  gender job
//    empList.stream().forEach(emp -> {
//        // 处理 gender 1:男 , 2:女
//        String gender = emp.getGender();
//        if (gender.equals("1")){
//            emp.setGender("男");
//        }else if (gender.equals("2")){
//            emp.setGender("女");
//        }
//
//        // 处理 job  1:讲师， 2:班主任， 3:就业指导
//        String job = emp.getJob();
//        if (job.equals("1")){
//            emp.setJob("讲师");
//        }else if (job.equals("2")){
//            emp.setJob("班主任");
//        }else if (job.equals("3")){
//            emp.setJob("就业指导");
//        }
//
//    });

}
