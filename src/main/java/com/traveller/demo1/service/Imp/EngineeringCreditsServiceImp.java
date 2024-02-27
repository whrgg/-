package com.traveller.demo1.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.traveller.demo1.entity.EngineeringCredits;
import com.traveller.demo1.mapper.EngineeringCreditsMapper;
import com.traveller.demo1.service.EngineeringCreditsService;
import org.springframework.stereotype.Service;

@Service
public class EngineeringCreditsServiceImp extends ServiceImpl<EngineeringCreditsMapper, EngineeringCredits> implements EngineeringCreditsService {
}