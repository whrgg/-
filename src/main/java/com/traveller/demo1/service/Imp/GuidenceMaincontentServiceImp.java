package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.GuidenceMaincontent;
import com.traveller.demo1.mapper.GuidenceMaincontentMapper;
import com.traveller.demo1.service.GuidenceMaincontentService;
import org.springframework.stereotype.Service;

@Service
public class GuidenceMaincontentServiceImp extends ServiceImpl<GuidenceMaincontentMapper, GuidenceMaincontent> implements GuidenceMaincontentService {
}