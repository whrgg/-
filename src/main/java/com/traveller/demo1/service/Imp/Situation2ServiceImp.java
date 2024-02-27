package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Situation2;
import com.traveller.demo1.mapper.Situation2Mapper;
import com.traveller.demo1.service.Situation2Service;
import org.springframework.stereotype.Service;

@Service
public class Situation2ServiceImp extends ServiceImpl<Situation2Mapper, Situation2> implements Situation2Service {
}