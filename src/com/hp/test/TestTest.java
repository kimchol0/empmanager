package com.hp.test;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestTest {

    @Test
    public void testDept(){
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/company?serverTimezone=GMT%2B8&amp&characterEncoding=utf-8";
        String username = "root";
        String password = "htgCXtd";
        Connection mysqlConnection = null;
        Statement mysqlStatement = null;
        try{
            Class.forName(driverClassName);
            mysqlConnection = DriverManager.getConnection(url,username,password);
            mysqlStatement = mysqlConnection.createStatement();
            String sql = "select * from dept";
            ResultSet deptResultSet = mysqlStatement.executeQuery(sql);
            while (deptResultSet.next()){
                int deptno = deptResultSet.getInt("deptno");
                String dname = deptResultSet.getString("dname");
                String loc = deptResultSet.getString("loc");
                System.out.println("部门编号；"+deptno);
                System.out.println("部门名称："+dname);
                System.out.println("部门地点："+loc);
            }
            deptResultSet.close();
            mysqlStatement.close();
            mysqlConnection.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void Test1(){

    }
}
