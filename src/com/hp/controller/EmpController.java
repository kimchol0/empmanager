package com.hp.controller;

import com.hp.entity.Emp;
import com.hp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/EmpController")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = {"/EmployeeInformationTable"}, method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView displayEmployeeTable() {
        try {
            List<Emp> employeeInformationQueryResultTable = empService.queryAllEmployeeInformation();
            ModelAndView employeeListModelAndView = new ModelAndView();
            /*  添加对象，否则employeeListModelAndView获取不到employeelistQueryResults的集合  */
            employeeListModelAndView.addObject("employeeInformationQueryResultTable",employeeInformationQueryResultTable);
            /*  返回/page/empManager/EmployeeInformationTable.jsp  */
            employeeListModelAndView.setViewName("empManager/EmployeeInformationTable");
            return employeeListModelAndView;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/addEmployeeInformation"},method = {RequestMethod.GET})
    public ModelAndView jumpToInsertJsp(){
        ModelAndView addEmployeeJumpModelAndView = new ModelAndView();
        /*  返回/page/empManager/insertEmployeeInformation.jsp  */
        addEmployeeJumpModelAndView.setViewName("empManager/insertEmployeeInformation");
        return addEmployeeJumpModelAndView;
    }

    @RequestMapping(value = {"/insertEmployeeInformation"},method = RequestMethod.POST)
    public String insertEmployeeInformationAndJumpingEmpControllerToEmployeeInformationTable(int deptno,Emp emp){
        try{
            empService.insertEmployeeInformation(deptno,emp);
            ModelAndView insertEmployeeModelAndView = new ModelAndView();
            /*  执行插入员工操作后，重定向到EmpController控制器的EmployeeInformationTable方法中去执行EmployeeInformationTable方法  */
            return "redirect:/EmpController/EmployeeInformationTable";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/deleteEmployeeInformation"},method = RequestMethod.GET)
    public String deleteEmployeeInformationAndJumpingEmpControllerToEmployeeInformationTable(int empno){
        try{
            empService.deleteEmployeeInformation(empno);
            return "redirect:/EmpController/EmployeeInformationTable";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/editEmployeeInformation"},method = RequestMethod.GET)
    public ModelAndView displayEmployeeInformationByEmpno(int empno){
        try {
            Emp queryEmployeeInformationByEmpnoResult = empService.queryEmployeeInformationByEmpno(empno);
            ModelAndView displayEmployeeInformationByEmpnoModelAndView = new ModelAndView();
            displayEmployeeInformationByEmpnoModelAndView.setViewName("empManager/editEmployeeInformation");
            displayEmployeeInformationByEmpnoModelAndView.addObject("queryEmployeeInformationByEmpnoResult",queryEmployeeInformationByEmpnoResult);
            return displayEmployeeInformationByEmpnoModelAndView;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/updateEmployeeInformation"},method = RequestMethod.POST)
    public String updateEmployeeInformation(Emp emp){
        try{
            empService.updateEmployeeInformation(emp);
            return "redirect:/EmpController/EmployeeInformationTable";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
