package com.hp.mapper;

import com.hp.entity.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface EmpMapper{

    public List<Emp> queryAllEmployeeInformation() throws Exception;

    public boolean insertEmployeeInformation(@Param("deptno") int deptno,@Param("emp") Emp emp) throws Exception;

    public boolean deleteEmployeeInformation(int empno) throws Exception;

    public Emp queryEmployeeInformationByEmpno(int empno)throws Exception;

    public boolean updateEmployeeInformation (Emp emp) throws Exception;

}
