package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.CapabilityClass;
import com.traveller.demo1.mapper.CapabilityClassMapper;
import com.traveller.demo1.service.CapabilityClassService;
import org.springframework.stereotype.Service;

@Service
public class CapabilityClassServiceImp extends ServiceImpl<CapabilityClassMapper, CapabilityClass> implements CapabilityClassService {
}