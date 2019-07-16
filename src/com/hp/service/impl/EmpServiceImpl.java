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
    public List<Emp> selectEmps() throws Exception{
        return empMapper.selectEmps();
    }

    public boolean insertEmp(int deptno,Emp emp) throws Exception{
        return empMapper.insertEmp(deptno,emp);
    }
    public boolean deleteEmp(int empno) throws Exception{
        return empMapper.deleteEmp(empno);
    }

    public Emp selectEmpbyEmpno(int empno) throws Exception{
        return empMapper.selectEmpbyEmpno(empno);
    }

    public boolean updateEmp (Emp emp) throws Exception{
        return empMapper.updateEmp(emp);
    }

}
