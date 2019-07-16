package com.hp.service.impl;

import com.hp.entity.Emp;
import com.hp.mapper.EmpMapper;
import com.hp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> queryAllEmployeeInformation() throws Exception{
        return empMapper.queryAllEmployeeInformation();
    }

    public boolean insertEmployeeInformation(int deptno,Emp emp) throws Exception{
        return empMapper.insertEmployeeInformation(deptno,emp);
    }
    public boolean deleteEmployeeInformation(int empno) throws Exception{
        return empMapper.deleteEmployeeInformation(empno);
    }

    public Emp queryEmployeeInformationByEmpno(int empno) throws Exception{
        return empMapper.queryEmployeeInformationByEmpno(empno);
    }

    public boolean updateEmployeeInformation (Emp emp) throws Exception{
        return empMapper.updateEmployeeInformation(emp);
    }

}
