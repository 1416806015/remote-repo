package com.example.springbootweb.service;





import com.example.springbootweb.pojo.Emp;

import java.util.List;

public interface EmpService {
    // 获取员工列表
    public List<Emp> listEmp();
}
