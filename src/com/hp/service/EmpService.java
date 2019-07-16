package com.hp.service;

import com.hp.entity.Emp;

import java.util.List;
public interface EmpService {

    public List<Emp> queryAllEmployeeInformation() throws Exception;

    public boolean insertEmployeeInformation(int deptno,Emp emp) throws Exception;

    public boolean deleteEmployeeInformation(int empno) throws Exception;

    public Emp queryEmployeeInformationByEmpno(int deptno) throws Exception;

    public boolean updateEmployeeInformation (Emp emp) throws Exception;
}
