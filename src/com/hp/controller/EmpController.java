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
@RequestMapping("/empController")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = {"/employeelist"}, method = {RequestMethod.POST})
    public ModelAndView employeelist() {
        try {
            List<Emp> employeelistQueryResults = empService.selectEmps();
            ModelAndView employeeListModelAndView = new ModelAndView();
            /*  添加对象，否则ModelAndView获取不到emps的集合  */
            employeeListModelAndView.addObject("employeelistQueryResultsTable",employeelistQueryResults);
            /*  返回/page/empManager/list.jsp  */
            employeeListModelAndView.setViewName("empManager/list");
            return employeeListModelAndView;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
