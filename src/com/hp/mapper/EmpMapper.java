package com.hp.mapper;

import com.hp.entity.Emp;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface EmpMapper{

    public List<Emp> selectEmps() throws Exception;

}
