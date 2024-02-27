package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.Situation3;
import com.traveller.demo1.mapper.Situation3Mapper;
import com.traveller.demo1.service.Situation3Service;
import org.springframework.stereotype.Service;

@Service
public class Situation3ServiceImp extends ServiceImpl<Situation3Mapper, Situation3> implements Situation3Service {
}