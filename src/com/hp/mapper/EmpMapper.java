package com.hp.mapper;

import com.hp.entity.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface EmpMapper{

    public List<Emp> selectEmps() throws Exception;

    public boolean insertEmp(@Param("deptno") int deptno,@Param("emp") Emp emp) throws Exception;

    public boolean deleteEmp(int empno) throws Exception;

    public Emp selectEmpbyEmpno(int empno)throws Exception;

    public boolean updateEmp (Emp emp) throws Exception;

}
