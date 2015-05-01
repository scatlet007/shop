package com.scatlet.service.impl;

import com.scatlet.domin.UserInfo;
import com.scatlet.service.UserInfoService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/29.
 */
@Scope("prototype")
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo> implements UserInfoService {
}
