package com.scatlet.service.impl;

import com.scatlet.domin.Role;
import com.scatlet.service.RoleService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/29.
 */
@Scope("prototype")
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
}
