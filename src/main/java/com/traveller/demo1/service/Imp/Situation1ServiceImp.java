package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Situation1;
import com.traveller.demo1.mapper.Situation1Mapper;
import com.traveller.demo1.service.Situation1Service;
import org.springframework.stereotype.Service;

@Service
public class Situation1ServiceImp extends ServiceImpl<Situation1Mapper, Situation1> implements Situation1Service {
}