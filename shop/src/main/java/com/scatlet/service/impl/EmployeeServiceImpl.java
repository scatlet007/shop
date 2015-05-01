package com.scatlet.service.impl;

import com.scatlet.domin.Employee;
import com.scatlet.service.EmployeeService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/29.
 */
@Scope("prototype")
@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements EmployeeService {
}
