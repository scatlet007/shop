package com.scatlet.service.impl;

import com.scatlet.domin.Admin;
import com.scatlet.service.AdminService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/28.
 */
@Scope("prototype")
@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{

}
