package com.hp.controller;

import com.hp.entity.Emp;
import com.hp.service.EmpService;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.management.MalformedObjectNameException;
import java.util.List;

@Controller
@RequestMapping("/empController")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = {"/employeelist"}, method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView displayEmployeeTable() {
        try {
            List<Emp> employeelistQueryResults = empService.queryAllEmployeeInformation();
            ModelAndView employeeListModelAndView = new ModelAndView();
            /*  添加对象，否则employeeListModelAndView获取不到employeelistQueryResults的集合  */
            employeeListModelAndView.addObject("employeelistQueryResultsTable",employeelistQueryResults);
            /*  返回/page/empManager/list.jsp  */
            employeeListModelAndView.setViewName("empManager/list");
            return employeeListModelAndView;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/addEmployee"},method = {RequestMethod.GET})
    public ModelAndView jumpToInsertJsp(){
        ModelAndView addEmployeeJumpModelAndView = new ModelAndView();
        /*  返回/page/empManager/insert.jsp  */
        addEmployeeJumpModelAndView.setViewName("empManager/insert");
        return addEmployeeJumpModelAndView;
    }

    @RequestMapping(value = {"/insertEmployee"},method = RequestMethod.POST)
    public String insertEmployeeInformationAndJumpingEmpControllerToEmployeeList(int deptno,Emp emp){
        try{
            empService.insertEmployeeInformation(deptno,emp);
            ModelAndView insertEmployeeModelAndView = new ModelAndView();
            /*  执行插入员工操作后，重定向到EmpController控制器的employeelist方法中去执行employeelist方法  */
            return "redirect:/empController/employeelist";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/deleteEmployee"},method = RequestMethod.GET)
    public String deleteEmployeeInformationAndJumpingEmpControllerToEmployeeList(int empno){
        try{
            empService.deleteEmployeeInformation(empno);
            return "redirect:/empController/employeelist";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/editEmployee"},method = RequestMethod.GET)
    public ModelAndView displayEmployeeInformationByEmpno(int empno){
        try {
            Emp selectEmpbyEmpnoEmpResult = empService.queryEmployeeInformationByEmpno(empno);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("empManager/edit");
            mv.addObject("selectEmpbyEmpnoEmpResult",selectEmpbyEmpnoEmpResult);
            return mv;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = {"/updateEmployee"},method = RequestMethod.POST)
    public String updateEmployeeInformation(Emp emp){
        try{
            empService.updateEmployeeInformation(emp);
            return "redirect:/empController/employeelist";
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
