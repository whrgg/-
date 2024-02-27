package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.PublicizeMethod;
import com.traveller.demo1.mapper.PublicizeMethodMapper;
import com.traveller.demo1.service.PublicizeMethodService;
import org.springframework.stereotype.Service;

@Service
public class PublicizeMethodServiceImp extends ServiceImpl<PublicizeMethodMapper, PublicizeMethod> implements PublicizeMethodService {
}