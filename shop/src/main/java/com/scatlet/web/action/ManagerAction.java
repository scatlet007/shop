package com.scatlet.web.action;

import com.scatlet.domin.Employee;
import com.scatlet.service.EmployeeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
/**
 * Created by Administrator on 2015/4/29.
 */
@Controller("Admin-ManagerAction")
@Scope("prototype")
public class ManagerAction extends BaseAction<Employee>{

    @Resource
    private EmployeeService employeeService;

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String ones(){
        System.out.println("start!");
        return "SUCCESS";
    }
}
