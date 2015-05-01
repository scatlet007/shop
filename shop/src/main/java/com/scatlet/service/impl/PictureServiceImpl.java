package com.scatlet.service.impl;

import com.scatlet.domin.Picture;
import com.scatlet.service.PictureService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/29.
 */
@Scope("prototype")
@Service
public class PictureServiceImpl extends BaseServiceImpl<Picture> implements PictureService {
}
